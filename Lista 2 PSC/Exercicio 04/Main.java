import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM = 5;
        String[] produtos = new String[TAM];
        double[] precos = new double[TAM];

        //preenchendo os vetores
        for(int i = 0; i < TAM; i++){
            System.out.printf("Digite o nome do %dº produto: ", (i+1));
            produtos[i] = sc.nextLine();
            System.out.printf("Digite o preço do %dº produto: ", (i+1));
            precos[i] = sc.nextDouble();
            sc.nextLine(); //limpeza de buffer
        }

        // A quantidade de produtos com preço inferior a R$ 50,00
        int precoInferiorA50 = 0;
        for(double preco : precos){
            if (preco < 50){
                precoInferiorA50++;
            }
        }
        System.out.printf("\n%d produtos custam menos de R$ 50,00\n", precoInferiorA50);

        // O nome dos produtos com preço entre R$ 50,00 e R$ 100,00
        System.out.printf("\nProdutos com preço entre R$ 50,00 e R$ 100,00: ");
        boolean existe = false;
        for(int i = 0; i < TAM; i++){
            if (precos[i] >= 50 && precos[i] < 100){
                System.out.printf("%s ", produtos[i]);
                existe = true;
            }            
        }
        if (!existe){
            System.out.print("Não há produtos nesse intervalo de preço.");
        }

        // A media dos preços dos produtos com preço superior a R$ 100,00.
        int precoSuperiorA100 = 0;
        double somaPrecos = 0;
        for(double preco : precos){
            if (preco >= 100){
                somaPrecos += preco;
                precoSuperiorA100++;
            }
        }
        double mediaPrecosSuperioresA100 = somaPrecos / precoSuperiorA100;
        System.out.printf("\n\nA media de preço dos produtos com preço superior à R$ 100,00 é: %.2f", mediaPrecosSuperioresA100);

        sc.close();
    }
}