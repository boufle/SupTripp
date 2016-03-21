package com.supinfo.SupTrip.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Windows on 19/03/2016.
 */

@Entity
@Table(name = "panier")
public class Panier implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpanier = null;

    @OneToOne
    public Long getIdpanier() {return idpanier;}
    public void setIdpanier(Long idpanier) {this.idpanier = idpanier;}
}
