




public class Hund extends Husdyr {

    private String race;

    public Hund(String navn, String livret, String race)
    {
        super(navn, livret);
        this.race = race;
    }

    public String getRace(){
        return race;
    }

    public String givLyd(){
        return "vov-vov";
    }





}

//givLyd metoden bliver overskrevet af subklassen.polimorfi -