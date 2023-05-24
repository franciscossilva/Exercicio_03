import java.util.Scanner;
public class SalarioMinino {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double salariousuario,salariominino,quantidadesalariominimos;
        System.out.println("digite valor do seu salario:");
        salariousuario =scanner.nextDouble();
        System.out.println("digite valor do salario minino atual:");
        salariominino = scanner.nextDouble();
        quantidadesalariominimos=salariousuario/salariominino;
        System.out.println("voce ganha "+quantidadesalariominimos+ "salarios minimos");
    }
}
