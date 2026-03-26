import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int v3, dz;
        System.out.print("digite um único número contendo três digitos (100-999) - ");
        v3 = sc.nextInt();
        dz = v3 % 100 / 10;
        System.out.println("dezena =" +dz);
    }
}
