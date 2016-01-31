package com.arcturusx.eatery.domain;

import javax.persistence.*;

/**
 * Created by bruntha on 1/31/16.
 */
@Entity
@Table(name = "ratings", schema = "", catalog = "eatery")
public class RatingsEntity {
    private int ratingId;
    private double score;
    private int noOfOccurance;
    private String restaurantId;
    private String aspect;
    private Integer level;
    private Integer noOfoccurance;
    private String parentAspect;
    private Double rating;
    private Double weight;

    @Id
    @Column(name = "rating_id")
    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    @Basic
    @Column(name = "score")
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Basic
    @Column(name = "no_of_occurance")
    public int getNoOfOccurance() {
        return noOfOccurance;
    }

    public void setNoOfOccurance(int noOfOccurance) {
        this.noOfOccurance = noOfOccurance;
    }

    @Basic
    @Column(name = "restaurantID")
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Basic
    @Column(name = "aspect")
    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "noOfoccurance")
    public Integer getNoOfoccurance() {
        return noOfoccurance;
    }

    public void setNoOfoccurance(Integer noOfoccurance) {
        this.noOfoccurance = noOfoccurance;
    }

    @Basic
    @Column(name = "parentAspect")
    public String getParentAspect() {
        return parentAspect;
    }

    public void setParentAspect(String parentAspect) {
        this.parentAspect = parentAspect;
    }

    @Basic
    @Column(name = "rating")
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingsEntity that = (RatingsEntity) o;

        if (noOfOccurance != that.noOfOccurance) return false;
        if (ratingId != that.ratingId) return false;
        if (Double.compare(that.score, score) != 0) return false;
        if (aspect != null ? !aspect.equals(that.aspect) : that.aspect != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (noOfoccurance != null ? !noOfoccurance.equals(that.noOfoccurance) : that.noOfoccurance != null)
            return false;
        if (parentAspect != null ? !parentAspect.equals(that.parentAspect) : that.parentAspect != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (restaurantId != null ? !restaurantId.equals(that.restaurantId) : that.restaurantId != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = ratingId;
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + noOfOccurance;
        result = 31 * result + (restaurantId != null ? restaurantId.hashCode() : 0);
        result = 31 * result + (aspect != null ? aspect.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (noOfoccurance != null ? noOfoccurance.hashCode() : 0);
        result = 31 * result + (parentAspect != null ? parentAspect.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }
}
