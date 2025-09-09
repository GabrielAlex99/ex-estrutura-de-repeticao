import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite um número positivo:");
        int numero = scanner.nextInt();

        System.out.println("\nLooping em ordem crescente:");
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }

        System.out.println("\nLooping em ordem decrescente:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        if (nome.length() > 6) {
            System.out.println("\nSeu nome tem mais que 6 letras");
            for (int tamanho = 0; tamanho < nome.length(); tamanho++) {
                System.out.println(nome);
            }
        } else {
            System.out.println("\nSeu nome tem menos do que 6 letras");
            System.out.println(nome);
        }

        scanner.close();
    }
}
