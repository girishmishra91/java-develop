public class factorial{
    static int factorial(int n){
        if (int i=0||i=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}