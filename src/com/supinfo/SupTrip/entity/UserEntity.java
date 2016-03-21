package com.supinfo.SupTrip.entity;

import javax.persistence.*;

/**
 * Created by Boufle on 21/03/2016.
 */
@Entity
@Table(name = "user", schema = "suptrip", catalog = "")
public class UserEntity {
    private String firstName;
    private String lastName;
    private String emailAdress;
    private String campuName;
    private String password;
    private String booster;
    private int userId;

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "EmailAdress")
    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Basic
    @Column(name = "CampuName")
    public String getCampuName() {
        return campuName;
    }

    public void setCampuName(String campuName) {
        this.campuName = campuName;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "IdBooster")
    public String getBooster() {
        return booster;
    }

    public void setBooster(String booster) {
        this.booster = booster;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (emailAdress != null ? !emailAdress.equals(that.emailAdress) : that.emailAdress != null) return false;
        if (campuName != null ? !campuName.equals(that.campuName) : that.campuName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (emailAdress != null ? emailAdress.hashCode() : 0);
        result = 31 * result + (campuName != null ? campuName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }
}
