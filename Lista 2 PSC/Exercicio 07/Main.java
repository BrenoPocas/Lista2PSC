public class Main {
    public static void main(String[] args) {
        System.out.print(tempoEmSegundos(2, 40, 10));
    }

    //Faça uma função que receba três números inteiro como parâmetros, representando horas, minutos e segundos e os converta em segundos. 
    public static int tempoEmSegundos(int h, int m, int s){
        return h * 3600 + m * 60 + s;
    }
}