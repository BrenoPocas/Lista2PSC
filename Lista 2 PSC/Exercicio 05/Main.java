import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM = 15;
        int[] vetor = new int[TAM];
        ArrayList<Integer> resultante = new ArrayList<>();

        // leia um vetor de 15 posições com números inteiros
        for (int i = 0; i < TAM; i++){
            System.out.printf("Digite o %dº numero: ", (i+1));
            vetor[i] = sc.nextInt();
            if(isPrimo(vetor[i])){
                resultante.add(vetor[i]);
            }
        }
        
        // Escreva o vetor resultante.
        System.out.print("Numeros primos digitados: ");
        for(int num : resultante){
            System.out.printf("%d ", num);
        }

        sc.close();
    }

    public static boolean isPrimo(int num){
        for (int i = 2; i < num; i++){
            if(num % i == 0) return false; 
        }
        return true;
    }
}