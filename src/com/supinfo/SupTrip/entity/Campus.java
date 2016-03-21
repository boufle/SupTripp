package com.supinfo.SupTrip.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Windows on 19/03/2016.
 */

@Entity
@Table (name="campus")
public class Campus implements Serializable
{
    @Id
    private Long id = null;
    private String campusname;
    private String descrption;

    @ManyToMany
    @JoinTable (name = "trip")
    private Trip trip;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getCampusname() {return campusname;}
    public void setCampusname(String campusname) {this.campusname = campusname;}

    public String getDescrption() {return descrption;}
    public void setDescrption(String descrption) {this.descrption = descrption;}
}
