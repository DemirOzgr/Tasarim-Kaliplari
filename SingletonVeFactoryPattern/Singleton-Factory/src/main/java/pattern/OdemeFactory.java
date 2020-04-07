package pattern;

public class OdemeFactory {

        public static Odeme createOdeme(Class clss) throws InstantiationException, IllegalAccessException {
            return  (Odeme) clss.newInstance();
        }
}
