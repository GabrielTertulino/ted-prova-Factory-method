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
public class Nome_Sobrenome extends Nome {

   public String nome;      

   public Nome_Sobrenome(String nome){
       this.nome = nome;
   }
   
   private String divideNome[] = new String[3];
       
   
   public Nome_Sobrenome(){
       divideNome = nome.split(" ");
       this.nome = divideNome[0];
       sobrenome = divideNome[3];
   }

   
   
   @Override
   public String getNome(){
       return divideNome[0] + " " + divideNome[3];
   }
   
   @Override
   public String toString(){
       return "Nome_Sobrenome(" + "nome: " + nome + ")";
   }
}