
package visão;


/**
 *
 * @author gabri
 */
import modelo.FactoryNome;
import java.util.Scanner;
public class Fabrica_Main {
    
    
    public static void main(String[] args) {
        
        FactoryNome factory = new FactoryNome();
        
        String nome = "Gabriel Tertulino";
        String sobrenome = "Tertulino, Gabriel";
      
        
        System.out.println(factory.criarNome(nome));
        System.out.println(factory.criarNome(sobrenome));
            
        }    
    }
     
    
