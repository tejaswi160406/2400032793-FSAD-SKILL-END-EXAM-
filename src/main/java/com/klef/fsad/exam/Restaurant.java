package com.klef.fsad.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "restaurant_date")
    private LocalDate date;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "rating")
    private double rating;

    @Column(name = "owner_name", length = 100)
    private String ownerName;

    public Restaurant() {
    }

    public Restaurant(int id, String name, LocalDate date, String status, String location, double rating, String ownerName) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
        this.location = location;
        this.rating = rating;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
