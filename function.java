import java.util.*;
public class function{
    public static void volume(int n){
        int volume=n*n*n;
        System.out.println("the volume of cube is"+volume);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        volume(side);

    }
    
}




