/**Program to calculate factorial of a number */

public class factorialnumb {
    public static int printfactorial(int n){
        if(n == 1 || n== 0){
            return 1;
        }
        int sum = printfactorial(n-1);
        int fact_numb = n * sum;
        return fact_numb;
    }
    public static void main(String[] args) { 
        int n = 5;
        System.out.println(printfactorial(n));
        
    }
}
