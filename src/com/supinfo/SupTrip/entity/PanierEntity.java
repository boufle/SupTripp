package com.supinfo.SupTrip.entity;


import javax.persistence.*;

/**
 * Created by Boufle on 21/03/2016.
 */
@Entity
@Table(name = "panier", schema = "suptrip", catalog = "")
public class PanierEntity {
    private int panierId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PanierID")
    public int getPanierId() {
        return panierId;
    }

    public void setPanierId(int panierId) {
        this.panierId = panierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PanierEntity that = (PanierEntity) o;

        if (panierId != that.panierId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return panierId;
    }
}
