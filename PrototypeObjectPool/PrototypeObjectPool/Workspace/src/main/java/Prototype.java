import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{

    private List<String> paymentList;

    public Prototype(){
        paymentList = new ArrayList<String>();
    }

    public Prototype(List<String> list){
        this.paymentList=list;
    }
    public void loadData(){
        paymentList.add("Kredi Kartı Ile Odeme");
        paymentList.add("Kapida Odeme");
        paymentList.add("Puan Ile Odeme");
        paymentList.add("Havale Ile Odeme");
    }

    public List<String> getOdemeList() {
        return paymentList;
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
        Prototype payment = new Prototype();
        payment.loadData();

        //Deep Copy
        Prototype paymentNew = (Prototype) payment.clone();
        //Shallow Copy
        Prototype  paymentNew1 = payment;
        List<String> list =  paymentNew.getOdemeList();
        list.add("Paranız Bizimle Guvende");
        List<String> list1 = paymentNew1.getOdemeList();
        list1.add("Paranız Iade");


        System.out.println(payment.getOdemeList());
        System.out.println( paymentNew.getOdemeList());
        System.out.println(paymentNew1.getOdemeList());

        System.out.println();

        System.out.println(payment);
        System.out.println( paymentNew);
        System.out.println(paymentNew1);


    }
}
