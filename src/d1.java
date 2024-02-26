import java.util.Scanner;

public class d1 {
    public static void calcularIdadeEmDias(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("dd/mm/yyyy: ");

        int dias = leitor.nextInt();
        dias += (leitor.nextInt())*30;
        dias += (leitor.nextInt())*365;

        System.out.println(dias);
    }
}
