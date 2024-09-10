/*class arraying{
    public static void main(String args[]){
        int[] marks=new int[3];
        marks[0]=56;
        marks[1]=43;
        marks[2]=53;
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}*/
import java.util.*;
class arraying{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        //output
        for (int i=0;i<size;i++){
            if (numbers[i]==x){
                System.out.println("found at index"+i);
            }
            System.out.println(numbers[i]);
        }
    }
}



    
   