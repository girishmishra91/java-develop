
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

/*public class star{
    public static void main(String args[]){
        int n=4;
        int m=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*public static void main(String args[]){
    int n=4;
    int m=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=m;j++){
            if (i==1||j==1||i==n||j==m){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}*/
/*public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/
/*public static void main(String args[]){
    int n=5;
    for (int i=n;i>=1;i--){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }


}*/
/*public static void main(String args[]){
    int n=4;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }*/
/*public static void main(String args[]){
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" "); 
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/
/*public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println(); 
}*/
/*public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}*/
/*public static void main(String args[]){
    int n=5;
    int number=1;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(number+" ");
            number ++;
        }
        System.out.println();
    }
}*/
/*public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            int sum=i+j;
            if (sum%2==0){
                System.out.print("1"+" ");
            }else{
                System.out.print("0"+" ");
            }
        }
        System.out.println();
    }
}*/

        

/*public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        for (int j=1;j<=2*(n-i);j++){
            System.out.println(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/                                                    // whats error 
/*public static void main(String arg[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}*/
/*public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}*/
public static void main(String args[]){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j--){
            System.out.print(j);
        }
        for (int j=2;j>=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}



