import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um numero inteiro positivo: ");
            num = sc.nextInt();
        } while (num < 0);
        System.out.printf("A soma dos numeros entre 1 e %d é %d", num, soma(num));

        sc.close();
    }

    public static int soma(int num){
        int soma = 0;
        for(int i = 1; i <= num; i++){
            soma += i;
        }
        return soma;
    }
}