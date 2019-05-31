/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.models;

public class Detergent extends CarCleaningGoods {
    private double capacity;
    private String appliance;
    
    public Detergent(){
    
    }

    public Detergent(double capacity, String appliance) {
        this.capacity = capacity;
        this.appliance = appliance;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getAppliance() {
        return appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }
    
    
}
