import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float lado1 = 0.00f;
        float lado2 = 0.00f;
        float area = 0.00f;
        float area2 = 0.00f;

        System.out.println("Digite a altura do quadrado: ");
        lado1 = sc.nextFloat();

        System.out.println("Digite a base do quadrado: ");
        lado2 = sc.nextFloat();

        area = lado1 * lado2;
        area2 = area * 2;

        System.out.println("A área do quadrado é: " + area + " O dobro dessa área é: " + area2);

        sc.close();

    }
}
