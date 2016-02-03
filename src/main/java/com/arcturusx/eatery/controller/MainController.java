package com.arcturusx.eatery.controller;

import com.arcturusx.eatery.domain.*;
import com.arcturusx.eatery.service.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    BusinessService businessService;
    @Autowired
    AspectService aspectService;
    @Autowired
    RatingsService ratingsService;
    @Autowired
    WeightService weightService;
    @Autowired
    CompositeScoreService compositeScoreService;
    @Autowired
    FoodService foodService;

    private static ObjectMapper objectMapper = new ObjectMapper();


//    CompositeRating compositeRating=new CompositeRating();

    @RequestMapping(value = "/Main",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "Main";
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView MainPage(ModelMap model) {
        return new ModelAndView("redirect:/Main");
    }

    @RequestMapping(value = "autocomplete", method = RequestMethod.GET)
    public String autoComplete(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "AutocompleteRestaurant";
    }

    @RequestMapping(value = "Restaurants", method = RequestMethod.GET)
    public String getRestaurant(ModelMap model) {
        List csRestaurants = businessService.getAllBusinesses();
        List csAsects=aspectService.getAllAspects();
        model.addAttribute("message", csRestaurants);
        model.addAttribute("message1", csAsects);
        return "Restaurant";
    }

    @RequestMapping(value = "Foods", method = RequestMethod.GET)
    public String getFoods(ModelMap model) {
        List csRestaurants = businessService.getAllBusinesses();
        model.addAttribute("message", csRestaurants);
        return "AutocompleteFoods";
    }


    @RequestMapping(value = "best-restaurants", method = RequestMethod.GET)
    public String bestRestaurant(ModelMap model) {
        List csRestaurants = compositeScoreService.getBestRestaurants();
        model.addAttribute("message", csRestaurants);
        return "best-restaurants";
    }

    @RequestMapping(value = "result", method = RequestMethod.GET)
    public String resultPage() {
        return "result";
    }

    @RequestMapping(value = "best-restaurants-aspect", method = RequestMethod.POST)
    public @ResponseBody
    String bestRestaurantAspect(ModelMap model, String aspect_id) throws JsonProcessingException {

        List aspects = aspectService.getAllAspects();
        int asId=Integer.parseInt(aspect_id);

        List csRestaurants = compositeScoreService.getBestRestaurantsOfAspect(asId);

        String response="";
        for(int i=csRestaurants.size()-1;i>csRestaurants.size()-6 && i>=0;i--){
            CompositeScoreEntity compositeScoreEntity= (CompositeScoreEntity) csRestaurants.get(i);
            response=response+businessService.getBusiness(compositeScoreEntity.getBusinessId()).getName()+"*"+compositeScoreEntity.getCompositeScore();
            response+="##";
        }

        return response;
    }


    private int getAspectID(String aspect_name, List aspects) {
        int aspectID = 0;
        for (int i = 0; i < aspects.size(); i++) {
            AspectEntity aspectEntity = (AspectEntity) aspects.get(i);
            if (aspectEntity.getAspectName().matches(aspect_name)) {
                aspectID = aspectEntity.getAspectId();
                break;
            }
        }
        return aspectID;
    }

    @RequestMapping(value = "best-restaurants-and-aspect", method = RequestMethod.POST)
    public @ResponseBody String bestRestaurantAndAspect(ModelMap model,String resname,String aspectname) throws JsonProcessingException {

        int aspectId=0;
        String busnessId="";

        List aspectList=aspectService.getAllAspects();
        List busList=businessService.getAllBusinesses();

        for(int i=0;i<aspectList.size();i++){
            AspectEntity aspectEntity= (AspectEntity) aspectList.get(i);
            if(aspectEntity.getAspectName().equals(aspectname)){
                aspectId=aspectEntity.getAspectId();
                System.out.println(aspectId);
                break;
            }
        }

        for(int i=0;i<busList.size();i++){
            BusinessEntity businessEntity= (BusinessEntity) busList.get(i);
            if(businessEntity.getName().equals(resname)){
                busnessId=businessEntity.getBusinessId();
                break;
            }
        }

        List csRestaurants = compositeScoreService.getBestRestaurantsOfAspect(aspectId,busnessId);


        String response="";
        for(int i=csRestaurants.size()-1;i>csRestaurants.size()-6 && i>=0;i--){
            CompositeScoreEntity compositeScoreEntity= (CompositeScoreEntity) csRestaurants.get(i);
            response=response+businessService.getBusiness(compositeScoreEntity.getBusinessId()).getName()+"*"+compositeScoreEntity.getCompositeScore();
            response+="##";
        }

        return response;
    }

    @RequestMapping(value = "best-food", method = RequestMethod.POST)
    public @ResponseBody String bestFood(ModelMap model,String clusterHead) {
        List csRestaurants = foodService.getAllFood(clusterHead);

        String response="";
        for(int i=0;i<csRestaurants.size();i++){
            FoodEntity foodEntity= (FoodEntity) csRestaurants.get(i);
            response=response+businessService.getBusiness(foodEntity.getRestaurantId()).getName().toString()+"*"+foodEntity.getScore();
            response+="##";
        }

        return response;

    }

    @RequestMapping(value = "food-list", method = RequestMethod.GET)
    public String getFoodSearch(ModelMap model) {
        // List csRestaurants = foodService.getAllFood("beans");
        List clusterheadlists=foodService.getAllClusterHeads();

        model.addAttribute("clusterheadlists",clusterheadlists);
        return "Food";
    }


    private double getCompositeScore(List list) {
        double score=0.0;

        for (int i = 0; i < list.size(); i++) {
            FoodEntity foodEntity= (FoodEntity) list.get(i);
            score+=foodEntity.getScore();
        }
        return score/list.size();
    }

    private List getBestRestaurants(String foodName) {
        List list = new ArrayList();

        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("FoodRatingAggregated.txt").getFile());
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] tmp = line.split("[ \t]");
                if (tmp[1].matches(foodName))
                    list.add(new FoodRating(tmp[0], Double.parseDouble(tmp[2])));
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }



    /*class CompositeRating {
        public HashMap<String, Double> getCompositeRatings() {
            List restaurants = businessService.getAllBusinesses();

            HashMap<String, Double> compositeRatings = new HashMap<String, Double>();
            for (int i = 0; i < restaurants.size(); i++) {
                BusinessEntity businessEntity = (BusinessEntity) restaurants.get(i);
                compositeRatings.put(businessEntity.getBusinessId(), getCompositeRating(businessEntity.getBusinessId()));
                System.out.println(businessEntity.getBusinessId() + "\t" + getCompositeRating(businessEntity.getBusinessId()));
            }
            return compositeRatings;
        }

        public double getCompositeRating(String businessID) {
            List ratings = ratingsService.getRatings(businessID);

            double foodItemScore = getSubRatings("F_FoodItem", ratings);
            double staffScore = getSubRatings("S_Staff", ratings);
            double deliveryScore = getSubRatings("S_Delivery", ratings);
            double entertainmentScore = getSubRatings("A_Entertainment", ratings);
            double furnitureScore = getSubRatings("A_Furniture", ratings);
            double placesScore = getSubRatings("A_Places", ratings);
            double locatedAreaScore = getSubRatings("A_LocatedArea", ratings);
            double paymentScore = getSubRatings("O_Payment", ratings);
            double reservationScore = getSubRatings("O_Reservation", ratings);
            double experienceScore = getSubRatings("O_Experience", ratings);
            double environmentScore = getSubRatings("A_Environment", ratings);

            updateSubRatings(ratings, "F_FoodItem", foodItemScore);
            updateSubRatings(ratings, "S_Staff", staffScore);
            updateSubRatings(ratings, "S_Delivery", deliveryScore);
            updateSubRatings(ratings, "A_Entertainment", entertainmentScore);
            updateSubRatings(ratings, "A_Furniture", furnitureScore);
            updateSubRatings(ratings, "A_Places", placesScore);
            updateSubRatings(ratings, "A_LocatedArea", locatedAreaScore);
            updateSubRatings(ratings, "O_Payment", paymentScore);
            updateSubRatings(ratings, "O_Reservation", reservationScore);
            updateSubRatings(ratings, "O_Experience", experienceScore);
            updateSubRatings(ratings, "A_Environment", environmentScore);

//        print(ratings);

            double serviceScore = getSubRatings("Service", ratings);
            double worthinessScore = getSubRatings("Worthiness", ratings);
            double ambienceScore = getSubRatings("Ambience", ratings);
            double foodScore = getSubRatings("Food", ratings);
            double offersScore = getSubRatings("Offers", ratings);
            double othersScore = getSubRatings("Others", ratings);

            updateSubRatings(ratings, "Service", serviceScore);
            updateSubRatings(ratings, "Worthiness", worthinessScore);
            updateSubRatings(ratings, "Ambience", ambienceScore);
            updateSubRatings(ratings, "Food", foodScore);
            updateSubRatings(ratings, "Offers", offersScore);
            updateSubRatings(ratings, "Others", othersScore);

//        print(ratings);

            double restaurantScore = getSubRatings("Restaurant", ratings);
            return restaurantScore;
        }

        public HashMap<String, Double> getCompositeRatingOfAspects(String restaurantName) {
            List ratings = ratingsService.getRatings(restaurantName);
            HashMap<String, Double> comScors = new HashMap<String, Double>();

            double foodItemScore = getSubRatings("F_FoodItem", ratings);
            double staffScore = getSubRatings("S_Staff", ratings);
            double deliveryScore = getSubRatings("S_Delivery", ratings);
            double entertainmentScore = getSubRatings("A_Entertainment", ratings);
            double furnitureScore = getSubRatings("A_Furniture", ratings);
            double placesScore = getSubRatings("A_Places", ratings);
            double locatedAreaScore = getSubRatings("A_LocatedArea", ratings);
            double paymentScore = getSubRatings("O_Payment", ratings);
            double reservationScore = getSubRatings("O_Reservation", ratings);
            double experienceScore = getSubRatings("O_Experience", ratings);
            double environmentScore = getSubRatings("A_Environment", ratings);

            comScors.put("F_FoodItem", foodItemScore);
            comScors.put("S_Staff", staffScore);
            comScors.put("S_Delivery", deliveryScore);
            comScors.put("A_Entertainment", entertainmentScore);
            comScors.put("A_Furniture", furnitureScore);
            comScors.put("A_Places", placesScore);
            comScors.put("A_LocatedArea", locatedAreaScore);
            comScors.put("O_Payment", paymentScore);
            comScors.put("O_Reservation", reservationScore);
            comScors.put("O_Experience", experienceScore);
            comScors.put("A_Environment", environmentScore);

            updateSubRatings(ratings, "F_FoodItem", foodItemScore);
            updateSubRatings(ratings, "S_Staff", staffScore);
            updateSubRatings(ratings, "S_Delivery", deliveryScore);
            updateSubRatings(ratings, "A_Entertainment", entertainmentScore);
            updateSubRatings(ratings, "A_Furniture", furnitureScore);
            updateSubRatings(ratings, "A_Places", placesScore);
            updateSubRatings(ratings, "A_LocatedArea", locatedAreaScore);
            updateSubRatings(ratings, "O_Payment", paymentScore);
            updateSubRatings(ratings, "O_Reservation", reservationScore);
            updateSubRatings(ratings, "O_Experience", experienceScore);
            updateSubRatings(ratings, "A_Environment", environmentScore);

//        print(ratings);

            double serviceScore = getSubRatings("Service", ratings);
            double worthinessScore = getSubRatings("Worthiness", ratings);
            double ambienceScore = getSubRatings("Ambience", ratings);
            double foodScore = getSubRatings("Food", ratings);
            double offersScore = getSubRatings("Offers", ratings);
            double othersScore = getSubRatings("Others", ratings);

            comScors.put("Service", serviceScore);
            comScors.put("Worthiness", worthinessScore);
            comScors.put("Ambience", ambienceScore);
            comScors.put("Food", foodScore);
            comScors.put("Offers", offersScore);
            comScors.put("Others", othersScore);


            updateSubRatings(ratings, "Service", serviceScore);
            updateSubRatings(ratings, "Worthiness", worthinessScore);
            updateSubRatings(ratings, "Ambience", ambienceScore);
            updateSubRatings(ratings, "Food", foodScore);
            updateSubRatings(ratings, "Offers", offersScore);
            updateSubRatings(ratings, "Others", othersScore);

            double restaurantScore = getSubRatings("Restaurant", ratings);
            comScors.put("Restaurant", restaurantScore);

            return comScors;
        }

        private void updateSubRatings(List ratings, String aspect, double score) {
            boolean isAvailable = false;
            for (int i = 0; i < ratings.size(); i++) {
                RatingsEntity ratingsEntity = (RatingsEntity) ratings.get(i);
                if (ratingsEntity.getAspectByAspectTag().getAspectTag().matches(aspect)) {
                    ratingsEntity.setScore(score);
                    ratings.remove(i);
                    ratings.add(ratingsEntity);
                    isAvailable = true;
                }
            }
            if (!isAvailable) {
                ratings.add(new RatingsEntity(1,score,1, new BusinessEntity(),new AspectEntity(1,aspect,aspect,1,1)));
            }
        }

        private void print(List ratings) {
            for (int i = 0; i < ratings.size(); i++) {
                RatingsEntity ratingsEntity = (RatingsEntity) ratings.get(i);
                System.out.println(ratingsEntity.getAspectByAspectTag().getAspectTag() + " " + ratingsEntity.getScore());
            }
        }

        private double getSubRatings(String parentAspect, List ratings) {
//        HibernateMain hibernateMain = new HibernateMain();
            List weights = weightService.getWeights(parentAspect);

            double subRating = 0.0;
            double factor = 0.0;
            for (int i = 0; i < weights.size(); i++) {
                WeightsEntity weightsEntity = (WeightsEntity) weights.get(i);
                double rating = getRatingForAspect(weightsEntity.getAspect(), ratings);
                if (rating != 0) {
                    subRating += weightsEntity.getWeight() * rating;
                    factor += weightsEntity.getWeight();
                }
            }
            if (subRating != 0)
                return subRating / factor;
            else
                return 0.0;
        }

        private double getRatingForAspect(String aspect, List ratings) {
            double rating = 0.0;
            for (int i = 0; i < ratings.size(); i++) {
                RatingsEntity ratingsEntity = (RatingsEntity) ratings.get(i);
                if (ratingsEntity.getAspectByAspectTag().getAspectTag().matches(aspect)) {
                    rating = ratingsEntity.getScore();
                    break;
                }
            }
            return rating;
        }
    }*/
}