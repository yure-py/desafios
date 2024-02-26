import java.util.Scanner;

public class d3 {
    static void reajuste(){
        Scanner leitor = new Scanner(System.in);
        double salario = leitor.nextDouble();

        System.out.println(salario+(salario*0.01));
    }
}
