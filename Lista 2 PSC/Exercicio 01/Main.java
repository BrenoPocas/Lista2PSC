import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int impares = 0, pares = 0;

        //leitura do vetor
        for(int i = 0; i < vet.length ; i++){
            System.out.print("Digite um numero inteiro: ");
            vet[i] = sc.nextInt();
            //contagem de pares e impares
            if(vet[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        //impressao dos pares
        System.out.printf("Quantidade de numeros pares: %d\n", pares);
        System.out.print("Numeros pares: ");
        for(int num:vet){
            if(num%2==0){
                System.out.printf("%d ",num);
            }
        }
        
        //impressao dos impares
        System.out.println("");
        System.out.printf("Quantidade de numeros impares: %d\n", impares);
        System.out.print("Numeros impares: ");
        for(int num:vet){
            if(num%2==1){
                System.out.printf("%d ",num);
            }
        }

        sc.close();
    }
}
