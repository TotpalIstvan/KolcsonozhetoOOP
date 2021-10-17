package hu.petrik.kolcsonzooop;

public class Konyv implements Kolcsonozheto{
    private  String szerzo, cim, isbn;

    public Konyv (String szerzo, String cim, String isbn) {
        this.szerzo= szerzo;
        this.cim = cim;
        this.isbn  = isbn;

    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s-%s", this.szerzo, this.cim);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 14;
    }
}
