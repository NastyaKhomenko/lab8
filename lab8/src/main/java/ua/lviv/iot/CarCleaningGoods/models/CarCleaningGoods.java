/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.models;

import ua.lviv.iot.CarCleaningGoods.models.Quality;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "childType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ParentClass")

public class CarCleaningGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String producer;

    @Column
    private String country;

    @Column
    private int salesPerDay;

    @Column
    private double price;

    @Enumerated(EnumType.STRING)
    @Column
    private Quality quality;

    public CarCleaningGoods() {

    }

    public CarCleaningGoods(String name, String producer, String country, int salesPerDay, double price,
            Quality quality) {
        this.name = name;
        this.producer = producer;
        this.country = country;
        this.salesPerDay = salesPerDay;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "CarCleaningGoods [name=" + name + ", producer=" + producer +

                ", country=" + country + ", salesPerDay=" + salesPerDay + ", price=" +

                price + ", quality=" + quality + "]";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalesPerDay() {
        return salesPerDay;
    }

    public void setSalesPerDay(int salesPerDay) {
        this.salesPerDay = salesPerDay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

}
