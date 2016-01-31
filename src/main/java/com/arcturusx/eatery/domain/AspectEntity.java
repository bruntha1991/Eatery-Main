package com.arcturusx.eatery.domain;

import javax.persistence.*;

/**
 * Created by bruntha on 1/31/16.
 */
@Entity
@Table(name = "aspect", schema = "", catalog = "eatery")
public class AspectEntity {
    private int aspectId;
    private String aspectName;
    private String aspectTag;
    private int level;
    private int parentAspect;

    public AspectEntity() {
    }

    public AspectEntity(int aspectId, String aspectName, String aspectTag, int level, int parentAspect) {
        this.aspectId = aspectId;
        this.aspectName = aspectName;
        this.aspectTag = aspectTag;
        this.level = level;
        this.parentAspect = parentAspect;
    }

    @Basic
    @Column(name = "aspect_id")
    public int getAspectId() {
        return aspectId;
    }

    public void setAspectId(int aspectId) {
        this.aspectId = aspectId;
    }

    @Basic
    @Column(name = "aspect_name")
    public String getAspectName() {
        return aspectName;
    }

    public void setAspectName(String aspectName) {
        this.aspectName = aspectName;
    }

    @Id
    @Column(name = "aspect_tag")
    public String getAspectTag() {
        return aspectTag;
    }

    public void setAspectTag(String aspectTag) {
        this.aspectTag = aspectTag;
    }

    @Basic
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "parent_aspect")
    public int getParentAspect() {
        return parentAspect;
    }

    public void setParentAspect(int parentAspect) {
        this.parentAspect = parentAspect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AspectEntity that = (AspectEntity) o;

        if (aspectId != that.aspectId) return false;
        if (level != that.level) return false;
        if (parentAspect != that.parentAspect) return false;
        if (aspectName != null ? !aspectName.equals(that.aspectName) : that.aspectName != null) return false;
        if (aspectTag != null ? !aspectTag.equals(that.aspectTag) : that.aspectTag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aspectId;
        result = 31 * result + (aspectName != null ? aspectName.hashCode() : 0);
        result = 31 * result + (aspectTag != null ? aspectTag.hashCode() : 0);
        result = 31 * result + level;
        result = 31 * result + parentAspect;
        return result;
    }
}
