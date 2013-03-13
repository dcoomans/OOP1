/*
 * abstracte Class Item bevat de standaard eigenschappen voor een object. 
 *
 * @param String titel, String omschrijving, double prijs
 * @author dennis
 */
package Producten;

/**
 *
 * @author dennis
 */
public abstract class Item {

    private String titel;
    private String omschrijving;
    private double prijs;

    /**
     *
     * @return
     */
    public String getTitel() {
        return titel;
    }

    /**
     *
     * @param titel
     */
    public void setTitel(String titel) {
//        System.out.println(titel);
        this.titel = titel;

    }

    /**
     *
     * @return
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     *
     * @param omschrijving
     */
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    /**
     *
     * @return
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     *
     * @param prijs
     */
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
