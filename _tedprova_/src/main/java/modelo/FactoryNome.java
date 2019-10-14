/*
 *  To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gabri
 */
public class FactoryNome {
        
    public FactoryNome(){
    }
        
    public Nome criarNome(String nome){
        if(nome.indexOf(",") > 0){
           return new Sobrenome_Nome(nome);
            }
        else{
           return new Nome_Sobrenome(nome);
            }

}
    
}

   