/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.models;

import ua.lviv.iot.CarCleaningGoods.models.CarCleaningGoods;
import ua.lviv.iot.CarCleaningGoods.models.Convenience;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("childClass")

public class Brusher extends CarCleaningGoods {
    @Column
    private String stiffness;
    
    @Enumerated(EnumType.STRING)
    @Column
    private Convenience convenience; 
    
  public Brusher(){
        
  }

  public Brusher(String name, String producer, String country, int salesPerDay, double price, Quality quality, String stiffness, Convenience convenience ) {
    this.stiffness = stiffness;
    this.convenience = convenience;
  }

  public String getStiffness() {
    return stiffness;
  }

  public void setStiffness(String stiffness) {
    this.stiffness = stiffness;
  }

  public Convenience getConvenience() {
    return convenience;
  }

  public void setConvenience(Convenience convenience) {
    this.convenience = convenience;
  }
    
    
    
}
