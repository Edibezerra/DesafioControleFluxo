import java.util.Scanner;

public class Contador {
  
    public static void main(String[] args) {
      
        Scanner terminal = new Scanner(System.in);      
              
        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = terminal.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int numero2 = terminal.nextInt();
            
            if (numero2 < numero1) {               
                throw new ParametrosInvalidosException();
                
            }         
                     
            System.out.println("Números entre " + numero1 + " e " + numero2 + " são:" );
            for (int i = numero1 + 1; i< numero2; i++) {
                System.out.print(i + " ");
            }
            
            } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: O segundo número não pode ser menor que o primeiro." );       
            } finally {
            terminal.close();
        }
    }
   
}
       


