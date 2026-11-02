import java.util.Scanner;

public class Variaveis {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boas vindas Usuário");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();
        //tive que colocar esse nextLine para consumir a quebra de linha, se não ele pulava o estado civil

        System.out.println("Digite seu estado civil: ");
        String estado = scanner.nextLine();

        System.out.println("Seu nome completo é " + nome + ", seu CPF é " + cpf + " ,sua idade é " + idade + ", seu peso é " + peso + " kg, sua altura é " + altura + " e seu estado civil é " + estado);

        scanner.close();
    }
}

