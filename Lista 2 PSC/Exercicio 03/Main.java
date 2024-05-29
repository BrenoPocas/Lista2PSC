import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int VENDEDORES = 10;
        double[] totalVendas = new double[VENDEDORES];
        double[] percentualComissao = new double[VENDEDORES];
        String[] nomesVendedores = new String[VENDEDORES];

        Scanner sc = new Scanner(System.in);

        //carregando os vetores
        for(int i = 0; i < VENDEDORES; i++){
            System.out.printf("Digite o nome do %dº vendedor: ", (i+1));
            nomesVendedores[i] = sc.nextLine();
            System.out.printf("Digite o total de vendas do %dº vendedor: ", (i+1));
            totalVendas[i] = sc.nextDouble();
            System.out.printf("Digite o percentual de comissao do %dº vendedor: ", (i+1));
            percentualComissao[i] = sc.nextDouble();
            sc.nextLine(); //limpeza de buffer
        }

        // Um relatório com os nomes dos vendedores e os valores a receber
        for(int i = 0; i < VENDEDORES; i++){
            System.out.printf("Nome: %s | Total de vendas: R$ %.2f | Percentual de comissão: %.1f\n", nomesVendedores[i], totalVendas[i], percentualComissao[i]);
        }

        //O total das vendas de todos os vendedores
        double soma = 0;
        for(int i = 0; i < VENDEDORES; i++){
            soma += totalVendas[i];
        }
        System.out.printf("\nTotal de vendas de todos os vendedores: R$ %.2f\n", soma);

        //O maior valor a receber e quem o receberá
        double max = 0;
        String nome = "";
        for(int i = 0; i < VENDEDORES; i++){
            double temp = totalVendas[i]*percentualComissao[i]/100;
            if(temp > max){
                max = temp;
                nome = nomesVendedores[i];
            }
        }
        System.out.printf("\n%s receberá o maior valor: R$ %.2f\n", nome, max);

        //O menor valor a receber e quem o receberá
        double min = 9999999999.0;
        for(int i = 0; i < VENDEDORES; i++){
            double temp = totalVendas[i]*percentualComissao[i]/100;
            if(temp < min){
                min = temp;
                nome = nomesVendedores[i];
            }
        }
        System.out.printf("\n%s receberá o menor valor: R$ %.2f\n", nome, min);

        sc.close();
    }
}