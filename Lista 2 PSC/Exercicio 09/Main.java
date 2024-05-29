public class Main {
    public static void main(String[] args) {
        volumeEsfera(3);
    }

    public static void volumeEsfera(double raio){
        System.out.printf("O volume da esfera é: %.2f", (4 * Math.PI * Math.pow(raio, 3)) / 3);
    }
}