public class Main {

    public static void main(String[] args) {
        System.out.printf("%.2f", calcS(5));
    }

    public static double calcS(int n){
        double S = 0;
        for(int i = 1; i <= n; i++){
            S += (double) 1 / fatorial(i);
        }
        return S;
    }

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