/**
 * Classe Winkelmand maakt een ArrayList Item aan welke producten bevat. De
 * producten kunnen worden verwijderd, toegevoegd en opgevraagd worden dmb de
 * standaard getter en setter methodes en een constructor Winkelmand
 *
 * @author dennis
 */
package webwinkel;

import Producten.Item;
import java.util.ArrayList;

/**
 *
 * @author dennis
 */
public class Winkelmand {

    private ArrayList<Item> producten;

    /**
     *
     */
    public Winkelmand() {
        this.producten = new ArrayList();
    }

    /**
     *
     * @param product
     */
    public void voegToe(Item product) {
        this.producten.add(product);
    }

    /**
     *
     * @param product
     */
    public void verWijder(Item product) {
        this.producten.remove(product);
    }

    /**
     *
     * @return
     */
    public ArrayList<Item> getProducten() {
        return producten;
    }

    /*public double getTotaal(double totaalPrijs) {
        for (int i = 0; i < this.producten.size; i++) {
            totaalPrijs += this.producten.prijs;
            return totaalPrijs;
        }
        * 
        */
        /** 
         *
         * @return de inhoud van de Arraylist met de toString opmaak
         */
        @Override
        public String toString
        
            () {
        String response = "";
            for (Item product : this.getProducten()) {
                response += product.toString() + "\n\n";
            }
            System.out.print("Aantal producten in winkelmand: " + this.getProducten().size() + "\n\n");
            return response;
        }
    
}