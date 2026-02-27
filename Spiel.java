import java.util.*;
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
    private Scanner answer;
    

    /*Konstruktor*/
    public Spiel()
    {
        croupier = new Croupier();
        spieler = new Spieler();
        punkteCroupier = 0;
        punkteSpieler = 0;
        aktuellerSpieler = spieler;
        answer = new Scanner(System.in);
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
        return aktuellerSpieler;
    }

    /** 
     * Diese Methode setzt das Attribut aktuellerSpieler auf den 
     * übergebenen Wert aus pAktuellerSpieler
     * @Author Nick
     * @param pAktuellerSpieler
     */
    public void setzeAktuellerSpieler(Person  pAktuellerSpieler)
    {
        aktuellerSpieler=pAktuellerSpieler;
    }

    /**
     * Diese Methode druckt den aktuellen Punktestand auf der Konsole
     * @Author Michael
     */
    public void druckePunktestand()
    {
        System.out.println("Spieler Punkte " + punkteSpieler 
        + " | Croupier Punkte " + punkteCroupier);
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
     {if (punkteSpieler>punkteCroupier && punkteSpieler<21){
        System.out.println("you win");
        return spieler;
      }else {
       System.out.println("you loose"); 
       return croupier;
      }
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
        
    }

    /**
     * Diese Methode startet eine Runde innerhalb eines Spiels
     * @Author Michael
     */
    public void starteRunde()
    {
        
        System.out.println("Möchtest du eine Runde Starten 1 - ja,  2 - nein");
        if (answer.nextInt() == 1){
            while(spieler.entscheide()) {
                spieler.spielen();
            }
        }
    }

    /**
     * Diese Methode beendet das Spiel und gibt auf der
     * Konsole ein Grußwort aus!
     * @Author Pia
     */

    public void spielBeenden()
    {
        System.out.println("Game over"); 
    }

    /** 
     * Diese Methode liefert die Punkte des Spielers
     *@return liefert punkteSpieler 
     *@Author Henry
     */
    public int gibPunkteSpieler()
    {
        
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

