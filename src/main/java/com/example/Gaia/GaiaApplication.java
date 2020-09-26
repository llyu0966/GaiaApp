package com.example.Gaia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author linliyu
 */
@SpringBootApplication
@RestController
public class GaiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaiaApplication.class, args);
	}
        
        @RequestMapping(path = "/household/{numberOfResidents}/{isPurchase}/{isRecycle}/{diet}", method = RequestMethod.GET)
    public double household(@PathVariable int numberOfResidents, @PathVariable boolean isPurchase, 
            @PathVariable boolean isRecycle, @PathVariable int diet) {
       if(isPurchase == true){
           if(isRecycle == true) {return (diet-100)/numberOfResidents ;}
           else{return (diet-50)/numberOfResidents ;}}
        else{
            return diet/numberOfResidents;
        }
    }
    
    @RequestMapping(path = "/transportation/{metro}/{bike}", method = RequestMethod.GET)
    public double transportation(@PathVariable double metro, @PathVariable double bike) {
       return (bike*0.17 + metro*0.18)*12*4;
    }
    
    @RequestMapping(path = "/travel/{numOflongFlight}/{numOfMediumFlight}/{numOfShortFlight}", method = RequestMethod.GET)
    public double travel(@PathVariable int numOflongFlight, @PathVariable int numOfMediumFlight,
            @PathVariable int numOfShortFlight) {
       return (numOflongFlight*4.1 + numOfMediumFlight*2.1 + numOfShortFlight*1.5);
    }
    
}// end of GaiaApplication class

