/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

/**
 *
 * @author dennis
 */
public class Game {
 private String titel;
 private String omschrijving;
 private int spelers;
 private double prijs;    

public Game(){
titel= "";
omschrijving= "";
spelers =0;
prijs = 0.0;
}

public Game(String titel, String omschrijving, int spelers, double prijs){
this.titel=titel;
this.omschrijving=omschrijving;
this.spelers=spelers;
this.prijs=prijs;
}

}

