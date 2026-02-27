import java.util.Scanner;
/**
 * Die Klasse Spieler erweitert die Klasse Person und beschreibt, wie der Spieler das Spiel spielt.
 */
public class Spieler extends Person 
{
    Scanner sc;
    /*Konstruktor*/
    public Spieler()
    {
        sc = new Scanner(System.in);
    }
    /* Methoden */
    /**
     * Diese Methode gibt zunächst eine entscheidungsfrage auf der 
     * Konsole aus und gibt anschließend die Benutzereingabe zurück
     * @Author Nick
     * @return entscheidung
     */
    public boolean entscheide()
    {
        System.out.println("Weiter? (Y/N)");
        String response = sc.nextLine();
        if(response.equalsIgnoreCase("Y"))
        {
            return(true);
        }
        return(false);
    }

    /**
     * Diese Methode überschreibt die abstrakte Methode spielen() in dern Klasse Person. Sie
     * legt fest, wie der Spieler bei seinem Zug spielt.
     * @Author Emma
     */
    public void spielen()
    {
        for(int i = 0; i < 3; i = i + 1)
        {
            wuerfel.wuerfeln();
            setzeAktErgebnis(gibAktErgebnis()+wuerfel.gibAktWert());
        }
        System.out.println ("Aktuelles Ergebniss " + gibAktErgebnis());
        while(entscheide() && gibAktErgebnis() < 21)
        {
            wuerfel.wuerfeln();
            setzeAktErgebnis(gibAktErgebnis()+wuerfel.gibAktWert());
            System.out.println ("Aktuelles Ergebniss " + gibAktErgebnis());
        }
    }

}//Ende Klasse: Spieler

