import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v1, v2;
        double p, a;
        System.out.print("digite o valor das bases - ");
        v1 = sc.nextDouble();
        System.out.print("digite o valor das alturas - ");
        v2 = sc.nextDouble();
        p = (v1 + v2) * 2;
        a =  v1 * v2;
        System.out.println("o valor da área e perímetro são respectivamente:\nárea =" +a);
        System.out.println("perímetro =" +p);
    }
}
