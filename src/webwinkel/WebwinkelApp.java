/*
 * Class WebwinkelApp maakt een Winkelwagen object aan van het type ArrayList waar de parameters van het object worden ingestopt
 * @param CD: prijs, titel, artiest, omschrijving, tracks
 * @param Boek: prijs, titel, auteur, omschrijving, isbn
 * @param Game: prijs, titel, omschrijving, aantal spelers
 *
 * @author dennis
 * 
 * @return inhoud van Winkelwagen
 */
package webwinkel;

import Producten.Boek;
import Producten.CD;
import Producten.Game;

public class WebwinkelApp {

    public static void main(String[] args) {

        /*Boek boek1 = new Boek("Java: A beginners guide", "Java programming", "Schildt, Herbert", "978-0-07-160632-5", 59.95);
         CD cd1 = new CD("Madonna: The Immaculate Collection", "Baanbrekend", "Madonna", "", 20, 19.95);
         Game game1 = new Game("Monopoly", "Strategisch", 4, 39.50);
         */
        Winkelmand mandje1 = new Winkelmand();

        mandje1.voegToe(
                new CD(19.95, "The Immaculate Collection", "Madonna", "Baanbrekend", 20));
        mandje1.voegToe(
                new Boek(59.95, "Java, A beginners guide", "Schildt, Herbert", "Java programmingcourse", "978-0-07-160632-5"));
        mandje1.voegToe(
                new Game(39.95, "Monopoly", "Wie verwerft de meeste straten!?", 6));

        System.out.print(mandje1);
    }
}