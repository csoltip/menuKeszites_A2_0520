package modell;

public class Konfiguracio{
    /* ADATTAGOK */
    private String nev;
    private int index;
    private boolean hirlevel;
    
    /* GENERÁLTATVA: ALT+INSERT */
    /* TAGFÜGGVÉNYEK */
    public Konfiguracio(String teljesSor) {
        String[] adatok = teljesSor.split(" ");
        nev = adatok[0];
        index = Integer.parseInt(adatok[1]);
        hirlevel = Boolean.parseBoolean(adatok[2]);
    }
    
    public Konfiguracio(String nev, int index, boolean hirlevel) {
        this.nev = nev;
        this.index = index;
        this.hirlevel = hirlevel;
    }

    public boolean isHirlevel() {
        return hirlevel;
    }

    public String getNev() {
        return nev;
    }

    public int getIndex() {
        return index;
    }

    /* Az objektum szöveges reprezentációja 
    örököltük az Object-ből és felülírjuk
    ha nem lenne felülírva, akkor memóriacímet adna vissza
    */
    @Override
    public String toString() {
        return "Konfiguracio{" 
                + "nev=" + nev 
                + ", index=" + index 
                + ", hirlevel=" + hirlevel 
                + '}';
    }
}
