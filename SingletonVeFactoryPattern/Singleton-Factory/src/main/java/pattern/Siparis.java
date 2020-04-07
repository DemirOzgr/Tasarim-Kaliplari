package pattern;

public class Siparis {

    private static Siparis instance = null;

    public String ilanId;
    public String urunAdi;
    public String adres;
    public int tutar;

    private Siparis(){
        //...
    }
    private void SiparisVer(){
        System.out.println("Siparis Verildi...");
    }
    public static Siparis getInstance()
    {
        if (instance == null){
            instance = new Siparis();
        }
        return instance;
    }
    public static void main(String[] args) {
        //Singleton
        Siparis nesne = Siparis.getInstance();
        Siparis nesne2 = Siparis.getInstance();

        nesne.SiparisVer();
        nesne2.SiparisVer();

        System.out.println();

        //Factory
        try {
            HavaleIleOdeme havaleIleOdeme = (HavaleIleOdeme) OdemeFactory.createOdeme(HavaleIleOdeme.class);
            havaleIleOdeme.adres();

            KrediKarti krediKarti = (KrediKarti) OdemeFactory.createOdeme(KrediKarti.class);
            krediKarti.adres();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
