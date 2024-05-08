public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 50;

        if(valorSolicitado <= saldo){
            saldo =  saldo - valorSolicitado;
        } else{
            System.out.println("Valor é superior ao disponivel na conta");
            
        }

        System.out.println(saldo);

        int numero = 1;

    for (int x=1; x<2; x++){
        numero = numero + x;
    }
    System.out.println("O valor de número é: " + numero);
    
    }

    
}
