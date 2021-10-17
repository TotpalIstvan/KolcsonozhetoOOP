package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Konyv k1= new Konyv("J.R.R Tolkien", "Hobbit", "1234-3215");
        Konyv k2= new Konyv("J.R.R Tolkien", "A Gyűrűk Ura", "7896-3215");
        Konyv k3= new Konyv("George R.R. Martin", "Trónok Harca", "1178-3220");

        Dvd d1 = new Dvd("Star Wars V.rész-A Birodalom visszavág",124);
        Dvd d2 = new Dvd("Star Wars IV.rész-Egy új remény",124);
        Dvd d3 = new Dvd("Star Wars VI.rész-A Jedi visszatér",124);
        Dvd d4 = new Dvd("A Gyűrűk Ura - A Gyűrű szövetsége",124);
        Dvd d5 = new Dvd("A Gyűrűk Ura - A király visszatér",124);

        Ujsag u1 = new Ujsag("Képes Sport", 2007,23);
        Ujsag u2 = new Ujsag("Élet és tudomány", 2005,26);
        Ujsag u3 = new Ujsag("Képes Sport", 2010,40);

/*
        System.out.println(k1.megjelenitendoNev());
        System.out.println(k1.getIsbn());
        System.out.println(d1.megjelenitendoNev());
*/
        List<Kolcsonozheto> katalogus = new ArrayList<>();
        katalogus.add(k1);
        katalogus.add(k2);
        katalogus.add(k3);
        katalogus.add(d1);
        katalogus.add(d2);
        katalogus.add(d3);
        katalogus.add(d4);
        katalogus.add(d5);
        katalogus.add(u1);
        katalogus.add(u2);
        katalogus.add(u3);

        for (Kolcsonozheto kolcsonozheto: katalogus) {
            System.out.println(kolcsonozheto.megjelenitendoNev() + " "+ kolcsonozheto.meddigKolcsonozheto() + " nap");
        }

        List<Dvd> dvdk = new ArrayList<>();
        dvdk.add(d1);
        dvdk.add(d2);
        dvdk.add(d3);
        dvdk.add(d4);
        dvdk.add(d5);
        System.out.println();

        for (Dvd dvd: dvdk) {
            System.out.println(dvd.megjelenitendoNev());
        }
        System.out.println();
        Collections.sort(dvdk);

        for (Dvd dvd: dvdk) {
            System.out.println(dvd.megjelenitendoNev());
        }
    }
}
