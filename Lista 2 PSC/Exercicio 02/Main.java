import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[15];
        boolean err = true;

        //Leitura do vetor
        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero inteiro: ");
            vet[i] = sc.nextInt();
        }

        //Informando posiçoes do vetor com o valor "30"
        System.out.print("Posiçoes com o numero 30: ");
        for(int i = 0; i < vet.length ; i++){
            if (vet[i] == 30){
                System.out.printf("%d ", i);
                err = false;
            }
        }

        //Informando caso nao haja o numero "30" no vetor
        if(err){
            System.out.print("O vetor nao contem o numero 30.");
        }

        sc.close();
    }
}