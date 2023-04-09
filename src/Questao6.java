import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        System.out.println("Informe o raio da circunferência: ");
        double c;
        Scanner leia = new Scanner(System.in);
        c = leia.nextDouble();
        double pi = 3.14;
        leia.close();
        double a;

        a = pi * (c * c);

        System.out.println("A área da circunferência é : " + a);
    }

}
