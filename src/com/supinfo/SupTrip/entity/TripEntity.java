package com.supinfo.SupTrip.entity;


import javax.persistence.*;

/**
 * Created by Boufle on 21/03/2016.
 */
@Entity
@Table(name = "trip", schema = "suptrip", catalog = "")
public class TripEntity {
    private String campusDepart;
    private String campusArrivee;
    private String moyenTransport;
    private int tripId;

    @Basic
    @Column(name = "CampusDepart")
    public String getCampusDepart() {
        return campusDepart;
    }

    public void setCampusDepart(String campusDepart) {
        this.campusDepart = campusDepart;
    }

    @Basic
    @Column(name = "CampusArrivee")
    public String getCampusArrivee() {
        return campusArrivee;
    }

    public void setCampusArrivee(String campusArrivee) {
        this.campusArrivee = campusArrivee;
    }

    @Basic
    @Column(name = "MoyenTransport")
    public String getMoyenTransport() {
        return moyenTransport;
    }

    public void setMoyenTransport(String moyenTransport) {
        this.moyenTransport = moyenTransport;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TripID")
    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripEntity that = (TripEntity) o;

        if (tripId != that.tripId) return false;
        if (campusDepart != null ? !campusDepart.equals(that.campusDepart) : that.campusDepart != null) return false;
        if (campusArrivee != null ? !campusArrivee.equals(that.campusArrivee) : that.campusArrivee != null)
            return false;
        if (moyenTransport != null ? !moyenTransport.equals(that.moyenTransport) : that.moyenTransport != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = campusDepart != null ? campusDepart.hashCode() : 0;
        result = 31 * result + (campusArrivee != null ? campusArrivee.hashCode() : 0);
        result = 31 * result + (moyenTransport != null ? moyenTransport.hashCode() : 0);
        result = 31 * result + tripId;
        return result;
    }
}
