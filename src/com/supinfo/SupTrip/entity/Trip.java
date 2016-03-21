package com.supinfo.SupTrip.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Windows on 19/03/2016.
 */

@Entity
@Table (name = "trip")
public class Trip implements Serializable
{
    @Id
    private Long id = null;
    private String cmapusdepart;
    private String campusarrive;
    private String moyentransport;

    @ManyToMany (mappedBy = "campus")
    private Campus campus;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getCmapusdepart() {return cmapusdepart;}
    public void setCmapusdepart(String cmapusdepart) {this.cmapusdepart = cmapusdepart;}

    public String getCampusarrive() {return campusarrive;}
    public void setCampusarrive(String campusarrive) {this.campusarrive = campusarrive;}

    public String getMoyentransport() {return moyentransport;}
    public void setMoyentransport(String moyentransport) {this.moyentransport = moyentransport;}
}
