package com.PerformHere.API.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Votes {

    @Id
    Integer id;
    String userId;
    String artistName;
    String location;

    public Votes() {

    }

    public Votes(Integer id, String userId, String artistName, String location) {
        this.id = id;
        this.userId = userId;
        this.artistName = artistName;
        this.location = location;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getLocation() {
        return location;
    }
}
