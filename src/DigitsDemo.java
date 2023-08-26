import java.util.Scanner;

public class DigitsDemo {
    public static void main(String[] args) {
        //54321

        /*
        1
        2
         */
        /*1
        2
        3
        4
        5
         */
        //21 --> 21/10 --> 2 --> 21%10 -->1
       // System.out.println(21%10);
        //System.out.println(21/10);
        /*int num=no%10;
        int q=no/10;
        System.out.println(num);
        System.out.println(q);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a integer number ");
        int no=sc.nextInt();
        while(no>0){
            System.out.println(no%10);//1 --> 2 -->3
            no=no/10;//321 --> 321/10 --> 32  --> 32/10 --> 3
        }
        //How to reverse a number
        //21 --> 1 , 2
        // 12 = 2* 1+1* 1*10;
        //321 -> 3 , 2 , 1 --> 1* 100+2*10+3*1=123
    }
}
