import java.util.Scanner;

public class ComparacaoStrings {

 
    public static void main(String[] args) {
     Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o primeiro nome: ");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome: ");
        String nome2 = leitor.next();
        
        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais");   
        }else{
            System.out.println("os nomes são diferentes");
        
        }
     
        
        
    }
   
    
}
