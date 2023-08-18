import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // if
        //if else
        //else if
        //nested if else
        //Loops, Arrays , casting ,functions
//        if (10 > 5) {
//            System.out.println("10 is greater than 5");
//        }
//      Scanner sc=new Scanner(System.in);
//        int age=15;
//        System.out.println("Enter age");
//        int age=sc.nextInt();
//        if(age>=18){
//            System.out.println("You are a major ");
//        }else{
//            System.out.println("you are a minor ");
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter your marks ");
//        int marks=sc.nextInt();
//        if(marks>=70){
//            System.out.println("Grade A");
//        }else if(marks>=60 && marks<70){
//            System.out.println("Grade B");
//        }else if(marks>=50 && marks <60){
//            System.out.println("Grade C");
//        }else{
//            System.out.println("Grade F");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter age");
        int age=sc.nextInt();
        double entryFee=2000.0;
        int discount=0;
        if(age>=21){
            System.out.println("Do you have discount coupon 'y'  or 'n' ");
            char coupon=sc.next().charAt(0);
            System.out.println("You can enter the pub ");
            if(coupon =='y'){

                System.out.println("Enter coupon code DISCOUNT70 or DISCOUNT50");
                String couponcode=sc.next();
                if(couponcode.equalsIgnoreCase("DISCOUNT70")){
                    discount=70;
                    System.out.println("You have discount of "+discount+" %");
                    System.out.println("Please pay entry fee: INR "+ entryFee*(100-discount)*0.01 +"/-");
                }else if(couponcode.equalsIgnoreCase("DISCOUNT50") ){
                    discount=50;
                    System.out.println("You have discount of "+discount+" %");
                    System.out.println("please pay entry fee: INR "+entryFee*(100-discount)*0.01 +"/-");

                }
            }else{
                System.out.println("Please pay entry fee : INR " +entryFee+"/-");
            }

        }else{
            System.out.println("You cannot enter the pub !! Better luck next time !!");
        }
    }
    }

