/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Gaia;

/**
 *
 * @author linliyu
 */
public class Housing {
    
    public Housing(){}
    
    public Housing(Double electricity, Double gas, Double water){
        super();
        this.electricity = electricity;
        this.gas = gas;
        this.water = water;
    }
    
    private Double electricity;
    private Double gas;
    private Double water;
    
    // Getters and setters of the properties
    public Double getElectricity(){
        return electricity;
    }
    
    public void setElectricity(Double el){
        this.electricity = el;
    }
    
    public Double getGas(){
        return gas;
    }
    
    public void setGas(Double gas){
        this.gas = gas;
    }
    
    public Double getWater(){
        return water;
    }
    
    public void setWater(Double water){
        this.water = water;
    }
    
    
}
