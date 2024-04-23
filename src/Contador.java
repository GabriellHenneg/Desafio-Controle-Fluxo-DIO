import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o parametro Um: ");
        int parametroUm = leitor.nextInt();
        System.out.println("Informe o parametro Dois: ");
        int parametroDois = leitor.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch  (ParametrosInvalideException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
            //
        }

    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalideException{
        if (parametroUm > parametroDois){
            throw  new ParametrosInvalideException();

        }else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 0; i < diferenca; i++) {
                System.out.println("imprimindo numero " + (i +1));
            }

        }
    }
}