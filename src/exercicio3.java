import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double quantidadelitros, tempogasto, velocidademedia, quilometrosporlitro, distancia;

        System.out.print("Qual foi o tempo gasto nesta viagem? (horas) - ");
        tempogasto = sc.nextDouble();
        System.out.print("Qual foi a velocidade média durante esta viagem? (km/h) - ");
        velocidademedia = sc.nextDouble();

        distancia = velocidademedia * tempogasto;
        quantidadelitros = distancia / 10.5 ;

        System.out.print("A quantidade de litros (L) gasta nesta viagem foi de - "+quantidadelitros);


    }
}
