/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.models;

public class HighPressureWasher extends CarCleaningGoods {
   private int power;
   
    public HighPressureWasher(){
        
    }
   
    public HighPressureWasher(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
   
}
