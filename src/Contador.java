
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = sc.nextInt();
        System.out.println("\nDigite o segundo parâmetro");
        int parametro2 = sc.nextInt();
        
        try{
            contar(parametro1,parametro2);
        }catch(Exception e){
            System.err.println("Erro: "+e.getMessage());
        }
    }
    
    static void contar(int par1,int par2) throws ParametrosInvalidosException{
        if(par1>par2){
            throw new  ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");
        }else{
            for (int i = par1; i <= par2; i++) {
                System.out.println("\nImprimindo numero: " + i);
            }
            System.out.printf("\n\nTotal de numeros imprimidos: %d", par2 - par1);
        }
    }

    private static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException(String msg) {
            super(msg);
        }
    }
}
