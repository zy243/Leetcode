package factorial;

public class Factorial {

    public static void main(String[] args) {
        int result=findFactorial(5);
        System.out.println("Result = "+result);
        
    }
    public static int findFactorial(int n){
        int factorial=1;
        if(n == 0 || n == 1) {  // Handle both 0! and 1! cases
        return 1;
        }
        else{
            return n*findFactorial(n-1);
        }
        
    }
    
}
