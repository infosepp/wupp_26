/**
 * Die Klasse Spiel beschreibt die übergeordnete Logik des Wupp-Spiels.
 */
public class Spiel 
{
    /* Attribute */
    private Person aktuellerSpieler; // Spieler der im Moment an der Reihe ist.
    private Croupier croupier; 
    private int punkteSpieler;
    private Spieler spieler;
    private int punkteCroupier;

    /*Konstruktor*/
    public Spiel()
    {
        croupier = new Croupier();
        spieler = new Spieler();
        punkteCroupier = 0;
        punkteSpieler = 0;
        aktuellerSpieler = spieler;
    }

    /* Methoden */
    /** 
     * Diese Methode setzt den Attributwert von punkteCroupier 
     * auf den Wert aus pPunkteCroupier
     * @Author Alessio
     * @param pPunkteCroupier
     */
    public void setzePunkteCroupier(int  pPunkteCroupier)
    {
        
    }

    /**
     * Diese Methode liefert den aktuellen Spieler als Objekt 
     * @Author Pia
     * @return liefert aktuellerSpieler 
     */
    public Person gibAktuellerSpieler()
    {
        
    }

    /** 
     * Diese Methode setzt das Attribut aktuellerSpieler auf den 
     * übergebenen Wert aus pAktuellerSpieler
     * @Author Henry
     * @param pAktuellerSpieler
     */
    public void setzeAktuellerSpieler(Person  pAktuellerSpieler)
    {
        
    }

    /**
     * Diese Methode druckt den aktuellen Punktestand auf der Konsole
     * @Author Michael
     */
    public void druckePunktestand()
    {
        
    }

    /**
     * Diese Methode wechselt den aktuellen Spieler auf der 
     * Grundlage der Belegung des Attributes aktuellerSpieler
     * @Author Nick
     */
    public void spielerWechseln()
    {
        if(aktuellerSpieler==spieler)
        {
            aktuellerSpieler=croupier;
        }
        else if(aktuellerSpieler==croupier)
        {
            aktuellerSpieler=spieler;
        }
    }

    /**
     * Diese Methode gibt den Gesamtsieger als Objekt zurück
     * @return Person die gewonnen hat
     * @Author Alessio
     */
    public Person ermittleGesamtsieger()
    {
        
    }

    /**
     * Diese Methode gibt den Rundensieger als Objekt zurück
     * @return Person die die Runde gewonnen hat
     * @Author Emma
     */
    public Person ermittleRundensieger()
    {
       
    }

    /**
     * Diese Methode startet ein neues Spiel. In dieser Methode ist die 
     * Spiellogik implementiert.
     * @Author Henry
     */

    public void starteSpiel()
    {
        punkteCroupier = 0;        
        punkteSpieler = 0;
        aktuellerSpieler=spieler;
        System.out.println("Neues spiel gestartet"); 
        starteRunde() ;
    }

    /**
     * Diese Methode startet eine Runde innerhalb eines Spiels
     * @Author Michael
     */
    public void starteRunde()
    {
        
    }

    /**
     * Diese Methode beendet das Spiel und gibt auf der
     * Konsole ein Grußwort aus!
     * @Author Pia
     */

    public void spielBeenden()
    {
        
    }

    /** 
     * Diese Methode liefert die Punkte des Spielers
     *@return liefert punkteSpieler 
     *@Author Henry
     */
    public int gibPunkteSpieler()
    {
        return punkteSpieler;
    }

    /** 
     * Diese Methode setzt den Wert von punkteSpieler auf den
     * übergebenen Wert von pPunkteSpieler
     * @param pPunkteSpieler
     * @Author Nick
     */
    public void setzePunkteSpieler(int  pPunkteSpieler)
    {
        punkteSpieler=pPunkteSpieler;
    }

    /**
     * Diese Methode gibt den Wert aus punkteCroupier aus 
     * @return liefert punkteCroupier 
     * @Author Emma
     */
    public int gibPunkteCroupier()
    {  return punkteCroupier;
        
    }

}//Ende Klasse: Spiel

