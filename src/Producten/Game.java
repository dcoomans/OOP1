/*
 * Class Game bevat de extra eigenschappen voor een Game object. De standaard
 * eigenschappen worden uit Class Item gehaald
 *
 * @author dennis
 */
package Producten;

/**
 *
 * @author dennis
 */
public class Game extends Item {

    private int spelers;

    /**
     *
     * @param prijs
     * @param titel
     * @param omschrijving
     * @param spelers
     */
    public Game(double prijs, String titel, String omschrijving, int spelers) {
        this.setPrijs(prijs);
        this.setOmschrijving(omschrijving);
        this.setTitel(titel);
        this.setSpelers(spelers);
    }

    /**
     *
     * @return
     */
    public int getSpelers() {
        return spelers;
    }

    private void setSpelers(int spelers) {
        this.spelers = spelers;
    }

    /**
     * toString vult aan op de toString van de bovenliggende class Item
     *
     * @return de waarde spelers
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "Aantal spelers: " + spelers;
    }
}