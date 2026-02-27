/**
 * Die Klasse Croupier erweitert die Klasse Person und beschreibt, wie der Croupier das Spiel spielt.
 */
public class Croupier extends Person 
{
    /*Konstruktor*/
    public Croupier()
    {
    }

    /*Methoden*/
    /**
     * @Author Michael
     */
    public void spielen()
    {
        while(gibAktErgebnis() < 16) {
           wuerfel.wuerfeln(); 
        }
    }
    
    
}//Ende Klasse: Croupier

