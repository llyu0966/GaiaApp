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
public class Transportation implements CarbonCalculator{
    
    //constructors
    public Transportation(){}
    
    public Transportation(double rail, double car, double metro, double bike){
        super();
        this.rail = rail;
        this.car = car;
        this.metro = metro;
        this.bike = bike;
    }
    //Average total weekly travel via the ways
    private double rail;
    private double car;
    private double metro;
    private double bike;
    
    // Getters and setters of the properties
    public double getRail(){
        return rail;
    }
    
    public void setRail(double rail){
        this.rail = rail;
    }
    
    public double getCar(){
        return car;
    }
    
    public void setCar(double car){
        this.car = car;
    }
    
    public double getMetro(){
        return metro;
    }
    
    public void setMetro(double metro){
        this.metro = metro;
    }
    
    public double getBike(){
        return bike;
    }
    
    public void setBike(double bike){
        this.bike = bike;
    }
    

    @Override
    public String toString(){
        return "Average total weekly travel via intercity of commuter rail: " + rail 
                +"; Average total weekly travel via bus,subway, or metro:" + metro 
                +"; Average total weekly travel via vehicles:" + car
                +"; Average total weekly travel via bike or walk:" + bike;
    }
    
    @Override
    public double getCarbonFootprint() {
        return (bike*0.17 + rail*0.22 + metro*0.18 + 0.38*car)*12*4;
    }
}// end of Transportation class
