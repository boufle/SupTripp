package com.supinfo.SupTrip.entity;


import javax.persistence.*;

/**
 * Created by Boufle on 21/03/2016.
 */
@Entity
@Table(name = "campus", schema = "suptrip", catalog = "")
public class CampusEntity {
    private String campusName;
    private String description;
    private int campusId;

    @Basic
    @Column(name = "CampusName")
    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CampusID", nullable = false)
    public int getCampusId() {
        return campusId;
    }

    public void setCampusId(int campusId) {
        this.campusId = campusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CampusEntity that = (CampusEntity) o;

        if (campusId != that.campusId) return false;
        if (campusName != null ? !campusName.equals(that.campusName) : that.campusName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = campusName != null ? campusName.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + campusId;
        return result;
    }
}
