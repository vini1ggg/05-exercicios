import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v3, centena, dezena, unidade, vInvertido;
        System.out.println("digite um único número com três digitos (100-999) - ");
        v3 = sc.nextInt();
        centena = v3 / 100;
        dezena = v3 % 100 / 10;
        unidade = v3 % 10;
        vInvertido = unidade * 100 + dezena * 10 + centena;
        System.out.println(vInvertido);

    }
}
