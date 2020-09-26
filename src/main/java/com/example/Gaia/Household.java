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
public class Household implements CarbonCalculator{
    
    //constructors
    public Household(){}
    
    public Household(int numberOfResidents, boolean isRecycle, boolean isPurchase, Double diet){
        super();
        this.numberOfResidents = numberOfResidents;
        this.isRecycle = isRecycle;
        this.isPurchase = isPurchase;
        this.diet = diet;
    }
    
    private int numberOfResidents;
    private boolean isRecycle;
    private boolean isPurchase;
    private Double diet;
    
    // Getters and setters of the properties
    public int getNumberOfResidents(){
        return numberOfResidents;
    }
    
    public void setNumberOfResidents(int numberOfResidents){
        this.numberOfResidents = numberOfResidents;
    }
    
    public boolean getIsRecycle(){
        return isRecycle;
    }
    
    public void setIsRecycle(boolean isRecycle){
        this.isRecycle = isRecycle;
    }
    
    public boolean getIsPurchase(){
        return isPurchase;
    }
    
    public void setIsPurchase(boolean isPurchase){
        this.isPurchase = isPurchase;
    }
    
    public Double getDiet(){
        return diet;
    }
    
    public void setDiet(Double diet){
        this.diet = diet;
    }

    @Override
    public String toString(){
        return "Number of residents including myself: " + numberOfResidents 
                +"; Do you purchase clean energy such as wind or solar?" + isPurchase 
                +"; Do you recycle items such as metal, plastic, glass, or paper?" + isRecycle
                +"; My diet is mostly" + diet;
    }
    
    @Override
    public double getCarbonFootprint() {
        if(isPurchase == true){
           if(isRecycle == true) {return (diet-100)/numberOfResidents ;}
           else{return (diet-50)/numberOfResidents ;}}
        else{
            return diet/numberOfResidents;
        }
               
            
    }
    
}// end of Household class
