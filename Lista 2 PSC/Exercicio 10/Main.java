public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimo(97));
    }

    public static boolean isPrimo(int n){
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}