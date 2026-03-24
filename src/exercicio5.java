import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vha, sb, sl, dinss;
        int nht;

        System.out.print("Qual é o valor da sua hora aula? - R$");
        vha = sc.nextDouble();

        System.out.println("-------------------------------------");

        System.out.print("Quantas horas você trabalhou esse mês? - ");
        nht = sc.nextInt();

        sb = vha * nht;
        System.out.println("O seu salario bruto é de - "+sb);

        System.out.println("------------------------------------");

        dinss = sb * 7.5 / 100;
        sl = sb - dinss;
        System.out.println("E com o desconto do inss o salário líquido é de - " +String.format("%.2f", sl));

    }
}
