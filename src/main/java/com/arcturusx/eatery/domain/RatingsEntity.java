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
    private BusinessEntity businessByRestaurantId;
    private AspectEntity aspectByAspectTag;

    public RatingsEntity() {
    }

    public RatingsEntity(int ratingId, double score, int noOfOccurance, BusinessEntity businessByRestaurantId, AspectEntity aspectByAspectTag) {
        this.ratingId = ratingId;
        this.score = score;
        this.noOfOccurance = noOfOccurance;
        this.businessByRestaurantId = businessByRestaurantId;
        this.aspectByAspectTag = aspectByAspectTag;
    }

    public RatingsEntity(int ratingId, double score, int noOfOccurance) {
        this.ratingId = ratingId;
        this.score = score;
        this.noOfOccurance = noOfOccurance;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingsEntity that = (RatingsEntity) o;

        if (noOfOccurance != that.noOfOccurance) return false;
        if (ratingId != that.ratingId) return false;
        if (Double.compare(that.score, score) != 0) return false;

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
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "business_id", nullable = false)
    public BusinessEntity getBusinessByRestaurantId() {
        return businessByRestaurantId;
    }

    public void setBusinessByRestaurantId(BusinessEntity businessByRestaurantId) {
        this.businessByRestaurantId = businessByRestaurantId;
    }

    @ManyToOne
    @JoinColumn(name = "aspect_tag", referencedColumnName = "aspect_tag", nullable = false)
    public AspectEntity getAspectByAspectTag() {
        return aspectByAspectTag;
    }

    public void setAspectByAspectTag(AspectEntity aspectByAspectTag) {
        this.aspectByAspectTag = aspectByAspectTag;
    }
}
