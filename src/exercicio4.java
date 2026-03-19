import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sm;
        int qw;
        double vqw, conta;

        System.out.print("quanto vale o salário minimo? - R$");
        sm = sc.nextDouble();
        System.out.print("agora quantos reais a sua residência gasta em qilowatt - ");
        qw = sc.nextInt();

        vqw = sm/7/100;
        conta = qw * vqw;

        System.out.println("valor da conta = R$"+conta);
        System.out.println("valor do quilowatt = R$ " +vqw);
        System.out.println("valor da conta com 10% de desconto = R$" +conta * 0.9);


    }
}
