import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       try{
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
       }
       catch (InputMismatchException e){
        System.out.println("O campo idade precisa ser um número");
       }

    }
    
}
