import java.util.ArrayList;
import java.util.List;

public class finaltest {
    static int i = 1;
    public static void main(String args[]) {
        //1
        double n = (int)(45.378) * 100/100.0;
        System.out.println(n);
        //2
       class father{
           public int getI() {return i;}
           public void setI(int i) {this.i = i;}
           protected int i = 1;

           public father(int i){

           }
           public father(int i , int e, boolean x){
               i =3;

           }
       }
       class son extends father{

           public son(int i , int e, boolean x) {
               super(i,e,x);
               this.i = i;
               System.out.println("i是： "+i);
           }
       }
        son s1 = new son(1,2,true);
        System.out.println(s1);
        byte i1 = (byte) 128;
        System.out.println(i1);
//3
        String s = "12";
        s=s.concat("ab");
        s = go(s);
        System.out.println(s);
//4
        ArrayList<Integer> list = new ArrayList();
        list.add(3); list.add(2); list.add(1); list.add(3);
        remove2(list, 1);
        System.out.println(list);
        //5

    }
    public static void remove2(ArrayList list, int value) {
        int k = 0;
        while (k < list.size()) {
            if (list.get(k).equals(value))
                list.remove(k);
            k++;
        }}
    static String go(String s) {
        s.concat("56");

        return s;
    }
    public void m(int i) {
        i += 2;
    }
}
