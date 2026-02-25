/**
 *  Die abstrakte Klasse Person fasst alle Attribute und Methoden zusammen, die die beiden
 *  erbenden Klassen Croupier und Spieler gemeinsam haben. Mit der abstrakten Methoden spielen()
 *  wird auch gefordert, diese Methode in jeder Klasse zu überschreiben.
 */
public abstract class Person 
{
    /* Attribute */
    protected Wuerfel wuerfel;
    private int aktErgebnis;
    /*Konstruktor*/
    
    /**
     * Im Konstruktor wird dem Attribut Wuerfel ein neues Objekt vom Typ Würfel zugewiesen.
     */
    public Person()
    {
        wuerfel = new Wuerfel();
    }
    /* Methoden */
    
    /**
     * @Author Emma
     */
    public void setzeAktErgebnis(int  pAktErgebnis){
        
    }

    /**
     * Diese Methode setzt die Spiellogik im Spielerobjekt um
     */
    public abstract void spielen();

    /**
     * @Author Alessio
     */
    public int addiere(int  zahl1,int  zahl2){
        
    }

    /**
     * @Author Henry
     */
    public int gibAktErgebnis(){
         return aktErgebnis;
    }

    /**
     * Diese Methode hält den Prozessor für 1 Sekunde lang an, bevor der Prozessor weiter rechnet.
     */
    public void warte()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}//Ende Klasse: Person

