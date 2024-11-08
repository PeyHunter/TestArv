public abstract class Husdyr {

    protected  String navn;
    protected  String livret;

    public Husdyr() {}

    public Husdyr(String navn, String livret) {
        this.navn = navn;
        this.livret = livret;
    }

    public String getNavn() {
        return navn;
    }

    public String getLivret() {
        return livret;
    }

    public String givLyd(){
        return "ubestemt dyrelyd";
    }

}

//protected tilhører de attributes som skal arves.




//extends betyder man implementere arv
//protected betyder at de også er tilgængelig i subklasserne
//Hund, kat og kanin arver fra Husdyr. Her er der tale om en superklasse og subklasse. Også kaldet klassestrukt.


// Aggregering er objekt struktur. Dvs person er
// aggregering er en person er del af et distrikt og kan ikke existere uden distrikt, fordi de er del af det.
// assosering er den løseste, aggregering er at de er dependent på hinanden.



// SUPER betyder det er en katogori som dækker over hele begrebet - sub er de ting der er specifik for

