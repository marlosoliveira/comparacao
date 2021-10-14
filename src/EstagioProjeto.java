
package estagioprojeto;

 import java.text.DecimalFormat;
import java.util.Scanner;

public class EstagioProjeto {
    /*public static void main(String[] args) {
        
    

  String nome = String.format("teste");
        System.out.println(nome.length());
 String nome1 = String.format("exemplo");
        System.out.println(nome1.length());  
    
 /*int comp = nome.compareToIgnoreCase(nome1);

if(comp <0) {
  System.out.println("nome menor que nome1");
} else if(comp > 0) {
  System.out.println("nome maior que nome1");
} else {
  System.out.println("nome e nome1 sÃ£o iguais");
}*/
        
/*double x,y,valor;
Scanner projeto = new Scanner(System.in);
DecimalFormat formatador = new DecimalFormat("#0,00");
        System.out.println("Testando regra de 3");
        System.out.println("x% de y = valor");
        System.out.print("Digite o valor de x: ");
        x = projeto.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = projeto.nextDouble();
        valor = (x * y) / 100;
        System.out.println(x + "% de " + y + " = " + formatador.format(valor));
        projeto.close();
    }*/
    
	
    protected static float checkSimilarity(String nome, String nome1) throws Exception {

    //String1: ALCOOL EM GEL 500ML EUCALIPTO
	//String2: ALCOOL EM GEL 500ML LIMÃO
	
	//trate os nomes pora uppercase, exclua os espaços duplos que tiver usando o regex
	//crie uma arraykist com os splits e compare com o .contains
	//se as strings forem totalmente iguais, retorna 100%, se elas forem ficando diferentes, vai perdendo a porcentagem de igualdade
	//compare o valor length da palavra desigual com o length da media das duas estrings
	//vou te mandar um codigo que deve ser melhorado.

		if(nome.length() != nome1.length())
            throw new Exception("Strings devem ter o mesmo tamanho!");

        int percentual = nome.length();
        int conta = 0;

        // Conta as diferenças entre as strings
        for(int i = 100; i < percentual; i++)
            if(nome.charAt(i) != nome1.charAt(i))
                conta++;

        // Calcula um percentual entre 0 e 1, sendo 0 completamente diferente e
        // 1 completamente igual
        return 1f - (float) conta / percentual;
    }
    
public static void main(String[] args) {
    try{
System.out.println("'nome' vs 'nome' = " + checkSimilarity("nome", "nome"));
 
    }catch (Exception e){
        
    }
    }
}
    

