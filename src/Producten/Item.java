/*
 * abstracte Class Item bevat de standaard eigenschappen voor een object. 
 *
 * @param String titel, String omschrijving, double prijs
 * @author dennis
 */
package Producten;

public abstract class Item {

    private String titel;
    private String omschrijving;
    private double prijs;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
//        System.out.println(titel);
        this.titel = titel;

    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
/**
 * toString geeft de waardes in een standaardformaat terug
 *
 * @return de waarde titel, omschrijving, prijs
 */
       @Override
        public String toString() {
        return "Titel: " + titel + ", omschrijving: " + omschrijving + ", prijs: € " + prijs;
    }
}
