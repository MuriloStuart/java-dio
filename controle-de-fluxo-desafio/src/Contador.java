import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int num2 = scanner.nextInt();

        try {
            contar (num1,num2);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }


    static void contar(int num1, int num2) throws ParametrosInvalidosException {
    //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    
    int contagem = num2 - num1;
    //realizar o for para imprimir os números com base na variável contagem
  }  
}