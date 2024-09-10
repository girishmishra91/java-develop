
import java.util.*;
class adding{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];
        System.out.println("first matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        int grouping[][]=new int[rows][cols];
        System.out.println("second matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                grouping[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(grouping[i][j]);
            }
            System.out.println();
        }
        int summing[][]=new int[rows][cols];
        System.out.println("summing of two matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){

                summing[i][j]=numbers[i][j]+grouping[i][j];
                System.out.print(summing[i][j]+" ");
            }
            System.out.println();
        }
    }
}
