package com.supinfo.SupTrip.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Windows on 19/03/2016.
 */

@Entity
@Table (name = "user")
public class User implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
    private Long idbooster;
    private String firstname;
    private String lastname;
    private String campusname;
    private String password;
    private String emailaddress;

    @OneToOne
    @JoinColumn (name = "idpanier")
    private Panier panier;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Long getIdbooster() {return idbooster;}
    public void setIdbooster(Long idbooster) {this.idbooster = idbooster;}

    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getCampusname() {return campusname;}
    public void setCampusname(String campusname) {this.campusname = campusname;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getEmailaddress() {return emailaddress;}
    public void setEmailaddress(String emailaddress) {this.emailaddress = emailaddress;}
}
