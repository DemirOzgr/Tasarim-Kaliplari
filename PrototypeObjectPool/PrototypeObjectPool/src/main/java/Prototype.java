import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{

    //Kaynak : https://www.journaldev.com/1440/prototype-design-pattern-in-java
    private List<String> OdemeList;

    public Prototype(){
        OdemeList = new ArrayList<String>();
    }

    public Prototype(List<String> list){
        this.OdemeList=list;
    }
    public void loadData(){
        OdemeList.add("Kredi Kartı Ile Odeme");
        OdemeList.add("Kapida Odeme");
        OdemeList.add("Puan Ile Odeme");
        OdemeList.add("Havale Ile Odeme");
    }

    public List<String> getOdemeList() {
        return OdemeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getOdemeList()){
            temp.add(s);
        }
        return new Prototype(temp);
    }

}


class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype Odeme = new Prototype();
        Odeme.loadData();

        //Deep Copy
        Prototype OdemeNew = (Prototype) Odeme.clone();
        //Shallow Copy
        Prototype OdemeNew1 = Odeme;
        List<String> list = OdemeNew.getOdemeList();
        list.add("Paranız Bizimle Guvende");
        List<String> list1 = OdemeNew1.getOdemeList();
        list1.add("Paranız Iade");


        System.out.println(Odeme.getOdemeList());
        System.out.println(OdemeNew.getOdemeList());
        System.out.println(OdemeNew1.getOdemeList());

        System.out.println();

        System.out.println(Odeme);
        System.out.println(OdemeNew);
        System.out.println(OdemeNew1);


    }
}
