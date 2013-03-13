/*
 * Class CD bevat de extra eigenschappen voor een CD object. De standaard
 * eigenschappen worden uit Class Item gehaald
 *
 * @author dennis
 */
package Producten;

public class CD extends Item {

    private String artiest;
    private int tracks;

    public CD(double prijs, String titel, String artiest, String omschrijving, int tracks) {
        this.setPrijs(prijs);
        this.setOmschrijving(omschrijving);
        this.setTitel(titel);
        this.setArtiest(artiest);
        this.setTracks(tracks);
    }

    public String getArtiest() {
        return artiest;
    }

    private void setArtiest(String artiest) {
        this.artiest = artiest;
    }

    public int getTracks() {
        return tracks;
    }

    private void setTracks(int Tracks) {
        this.tracks = tracks;
    }

    /**
     * toString vult aan op de toString van de bovenliggende class Item
     *
     * @return de waardes artiest en tracks
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "Artiest: " + artiest + ", Tracks: " + tracks;
    }
}