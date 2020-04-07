package pattern;

public interface Odeme {
    void adres();
}

class KrediKarti implements Odeme{
    public void adres() {
        System.out.println("KrediKarti Ile Odeme");
    }
}

class KapidaOdeme implements Odeme{
    public void adres() {
        System.out.println("Kapida Odeme");
    }
}

class PuanIleOdeme implements Odeme{
    public void adres() {
        System.out.println("Puan Ile Odeme");
    }
}

class HavaleIleOdeme implements Odeme{
    public void adres() {
        System.out.println("Havale Ile Odeme");
    }
}