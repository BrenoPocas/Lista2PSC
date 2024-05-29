/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.print(fatorial(5));
    }

    //Implemente uma função que receba um número inteiro positivo e retorne o fatorial deste número.
    public static int fatorial(int n){
        int fat = 1;
        if(n > 0){
            for(int i = 1; i <= n; i++){
                fat *= i;
            }
        }
        return fat;
    }
}