import java.util.InputMismatchException;
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
        } catch (InputMismatchException e) {
            System.out.println("Os parâmetros devem ser em números");
        }

    }


    static void contar(int num1, int num2){
    //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if(num1 > num2){
        ParametrosInvalidosException();
    }
    
    int contagem = num2 - num1;
    for(int indice = 0; indice < contagem; indice++){
        System.out.println("Impimindo o número " + (indice+1));
    }
  }
  
  static void ParametrosInvalidosException(){
    System.out.println("O segundo número deve ser maior que o primeiro");
  }
}