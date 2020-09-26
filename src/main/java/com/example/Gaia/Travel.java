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
public class Travel implements CarbonCalculator{
    //constructors
    public Travel(){}
    
    public Travel(int numOflongFlight, int numOfMediumFlight, int numOfShortFlight){
        super();
        this.numOflongFlight = numOflongFlight;
        this.numOfMediumFlight = numOfMediumFlight;
        this.numOfShortFlight = numOfShortFlight;
    }
    
    //Number of long, medium, short round-trip flights you make in a year
    private int numOflongFlight;
    private int numOfMediumFlight;
    private int numOfShortFlight;
    
    // Getters and setters of the properties
    //Vehicle : distance (km/yr) /*EF (kg CO2e/km) = emissions (kg CO2e/yr)
    public int getnumOflongFlight(){
        return numOflongFlight;
    }
    
    public void setnumOflongFlight(int numOflongFlight){
        this.numOflongFlight = numOflongFlight;
    }
    
    //Bus : distance (km/yr) * EF (kg CO2e/km) = emissions (kg CO2e/yr)
    public int getnumOfMediumFlight(){
        return numOfMediumFlight;
    }
    
    public void setnumOfMediumFlight(int numOfMediumFlight){
        this.numOfMediumFlight = numOfMediumFlight;
    }
    
    //Taxi: distance (km/yr) * EF (kg CO2e/km) = emissions (kg CO2e/yr)
    public int getnumOfShortFlight(){
        return numOfShortFlight;
    }
    
    public void setnumOfShortFlight(int numOfShortFlight){
        this.numOfShortFlight = numOfShortFlight;
    }

    @Override
    public String toString(){
        return "Number of long round-trip flights: " + numOflongFlight 
                +"; Number of median round-trip flights: " + numOfMediumFlight  
                +"; Number of short round-trip flights: " + numOfShortFlight;
                
    }
    
    @Override
    public double getCarbonFootprint() {
        return (numOflongFlight*0.41 + numOfMediumFlight*0.21 + numOfShortFlight*0.06);
    }
    
    
}//end of Travel class

