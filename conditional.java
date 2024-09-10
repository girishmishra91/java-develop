/*import java.util.*;
public static void main(String args[]){
    System.out.print("enter a number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if (number%2==0){
        System.out.println("even number");
    }
    else{
        System.out.println("odd number");
    }
}*/
import java.util.*;
public static void main(String args[]){
    System.out.print("enter the age");
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if (18<=age && age<50){
        System.out.println("it is eligile of voter list");
        System.out.println("it is eligile of driving licence ");
        System.out.println("it is eligile of sex ");

    }
    else if (age>50){
        System.out.println("your age has a old");
        System.out.println("you are mutthal");
        System.out.println("your baby not satisfy");
    }
    else{
        System.out.println("you are a baccha ");
        System.out.println("your marriage is not pass by government");
        System.out.println("you have  to protect a milk");
    
    }
}