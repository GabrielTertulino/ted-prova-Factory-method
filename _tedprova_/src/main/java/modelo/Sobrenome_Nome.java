/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gabri
 */

public class Sobrenome_Nome extends Nome{
    
  public String nome;
  
    public Sobrenome_Nome(String nome){
        this.nome = nome;
    }
    private String separaNome[] = new String[3];    
    
    public Sobrenome_Nome(){
        separaNome = nome.split(",");
        this.nome = separaNome[3];
        sobrenome = separaNome[0];
    }
    
    @Override
    public String getNome(){
        return separaNome[3] + "" + separaNome[0];
    }
    
    
    @Override
    public String toString(){
        return "Sobrenome_Nome(" + "Sobrenome: " + nome + ")";
    }
    
    
    
    
}
