import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int idade; // declaração da variável idade
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.print("\nPor favor, informe sua idade: ");
        idade = entrada.nextInt();
        System.out.println(); // imprime uma linha em branco

        System.out.println("A idade informada foi: " + idade);

        clearBuffer(entrada);

        System.out.println("Por favor, diga seu nome: ");

        nome = entrada.nextLine();
        System.out.println("Seu nome é" + nome);

        WorkingWithJson workingWithJson = new WorkingWithJson();

        workingWithJson.working();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}