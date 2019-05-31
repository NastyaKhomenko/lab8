/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.models;

import ua.lviv.iot.CarCleaningGoods.models.Size;

public class Duster extends CarCleaningGoods{
    private Size size;
    private String material;
    private String color;

    public Duster(){
        
    }
    
    public Duster(Size size, String material, String color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
