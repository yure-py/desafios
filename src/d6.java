import java.util.Scanner;

public class d6 {
    static void ipi(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Porcentagem: ");
        double porcentagem = leitor.nextDouble() / 100 + 1;

        System.out.print("Código, Valor Unitario, Quantidade [1]: ");
        int codigo = leitor.nextInt();
        double valor = leitor.nextDouble();
        int quantidade = leitor.nextInt();

        double total = valor*quantidade;

        System.out.print("Código, Valor Unitario, Quantidade [2]: ");
        codigo = leitor.nextInt();
        valor = leitor.nextDouble();
        quantidade = leitor.nextInt();

        total += (valor*quantidade);

        System.out.printf("Valor total: %.2f\n", total*porcentagem);
    }
}
