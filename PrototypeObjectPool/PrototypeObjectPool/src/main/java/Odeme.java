import java.util.HashMap;
import java.util.Map;
//Kaynak : https://www.journaldev.com/1440/prototype-design-pattern-in-java
    public abstract class Odeme {
        public String type() {
            return "Odeme";
        }
    }

    class KrediKarti extends Odeme {

        public String type() {
            return "KrediKarti";
        }
    }

    class KapidaOdeme extends Odeme {

        public String type() {
            return "KapidaOdeme";
        }
    }

    class Puan  extends Odeme {

        public String type() {
            return "Puan";
        }
    }

    class Havale  extends Odeme {

        public String type() {
            return "Havale";
        }
    }


    class OdemeSource {

        private static OdemeSource poolManager  = null;
        static int size=3;
        private static OdemeSource source = new OdemeSource();
        private Map<Class<? extends Odeme> , Odeme> poolMap = new HashMap<Class<? extends Odeme>, Odeme>();

        private OdemeSource() {

        }

        public static Odeme getOdeme(Class<? extends Odeme> clazz) throws IllegalAccessException, InstantiationException {
            Odeme b = source.poolMap.get(clazz);

            if (b == null) {
                b = clazz.newInstance();
                source.poolMap.put(b.getClass(), b);
                size--;
            }

            return b;
        }

        public static void main(String[] args) throws InstantiationException, IllegalAccessException {

            //Object Pool

            Odeme odeme = OdemeSource.getOdeme(KrediKarti.class);
            System.out.println(odeme.type() + " " + odeme);
            Odeme odeme2 = OdemeSource.getOdeme(KrediKarti.class);
            System.out.println(odeme2.type() + " " + odeme2);
            Odeme odeme3 = OdemeSource.getOdeme(KapidaOdeme.class);
            System.out.println(odeme3.type() + " " + odeme3);
            Odeme odeme4 = OdemeSource.getOdeme(Puan.class);
            System.out.println(odeme4.type() + " " + odeme4);
            Odeme odeme5 = OdemeSource.getOdeme(Havale.class);
            System.out.println(odeme5.type() + " " + odeme5);
            Odeme odeme6 = OdemeSource.getOdeme(Puan.class);
            System.out.println(odeme6.type() + " " + odeme6);

        }
    }

