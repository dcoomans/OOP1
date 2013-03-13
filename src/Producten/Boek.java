/*
 * Class Boek bevat de extra eigenschappen voor een Boek object. De standaard
 * eigenschappen worden uit Class Item gehaald
 *
 * @author dennis
 */
package Producten;

/**
 *
 * @author dennis
 */
public class Boek extends Item {

    private String auteur;
    private String isbn;

    /**
     *
     * @param prijs
     * @param titel
     * @param auteur
     * @param omschrijving
     * @param isbn
     */
    public Boek(double prijs, String titel, String auteur, String omschrijving, String isbn) {
        this.setPrijs(prijs);
        this.setOmschrijving(omschrijving);
        this.setTitel(titel);
        this.setAuteur(auteur);
        this.setIsbn(isbn);
    }

     /**
     *
     * @return
     */
    public String getAuteur() {
        return auteur;
    }

    private void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     *
     * @return
     */
    public String getIsbn() {
        return isbn;
    }

    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * toString vult aan op de toString van de bovenliggende class Item
     *
     * @return de waardes auteur en isbn
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "Auteur: " + auteur + ", ISBN-nummer: " + isbn;
    }
}
