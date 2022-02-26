import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class fillintest{
    public static void main(String[]args){

       sumTo(5);
       digitSum(2345);
        double sqrt = Math.sqrt(123);



     /*   String one = "student";
        String two = "beer";
        String three = "dorm";
        int number = 12;

        sentence(two, one, number);
        sentence(three, two, 125);
        sentence(three, one, 250);
        sentence(one, two, 4);
        sentence("classroom", one, 2 * number);*/

        /*//7。abstract method
        List list = new ArrayList();
        list.add(100);
        System.out.println(list.get(0));



//6.cast
        class Parents{
            String name;
            int age;
        }
        class Kid extends Parents{

        }
        Kid kid = new Kid();
        Parents parents = new Parents();
        if(kid instanceof Parents){
            Parents p = (Parents)kid;
            System.out.println("true!");

        }else
            System.out.println("false!");
*/
        /*//5.
        double[][] list = new double[10][5];
        for (int row = 0;row <list.length;row++){
            for (int colume = 0; colume < list[row].length;colume++){
                list[row][colume]=-0.1;
            }
        }
        System.out.println(list);*/
      /*  //4.multi-dimensional arraylist
        ArrayList[][] peopleName = new ArrayList[10][2];
        int i =1;
        peopleName[0][1].add(i);
        System.out.println(peopleName[0][1]);
*/

        /*//3.randommmm[1,25]
        double i = Math.random()*25;
        System.out.println(Math.round(i));*/
        /*//1.uses a for statement to sum the numbers from 1 through 50 and
        //display the total sum to the console.
        int sum = 0;
        for(int i = 0; i <=50 ; i++){
            sum = sum+i;
            System.out.println("i="+i+" sum is= "+sum);
        }
        //2.output a shape
        int row; // the row position
        int column; // the column position
        int space; // number of spaces to print
        for ( row = 10; row >= 1; row-- )
        {
            for ( space = 10; space > row; space-- )
                System.out.print( " " );
            //Fill code here
            for (column = 1;column <=row;column++)
            System.out.print( "*" );

            System.out.println();
        } // end for loop

        System.out.println();*/

    }

    public static void sentence(String one, String two, int number) {
        System.out.println(two + "s in the " + one + " = " + number);
    }
    static double sumTo(int n){
        double sumTo=0;
        for(int i=1;i<=n;i++){
            sumTo+=1.0/i;
        }
        return sumTo;
    }
    static int digitSum(int i){
        i = Math.abs(i);
        int sum = 0;
        while(i>0){
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
        return sum;
    }
    }

