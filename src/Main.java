//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Husdyr[] husdyr = new Husdyr[3];

        Kat miver = new Kat("Miver", "Mus");
        husdyr[0] = miver;

        Hund mimse = new Hund("mimse", "kødben", "shitzu");
        husdyr[1] = mimse;

        Kanin peter = new Kanin("Peter","mælkebøtter");
        husdyr[2] = peter;

        for (int i = 0; i < husdyr.length; i++) {
            System.out.println(husdyr[i].getNavn() + " "+ husdyr[i].getLivret() +" "+ husdyr[i].givLyd());
        }


    }
}

//late binding betyder at koden først bliver taget stilling til om det skal exikveres når det sker.