/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Gauss
 */
public class ItemPedido
{
    
    public Produto novoProduto(String descricao,float preco,int id,String sabor1, String sabor2){
        Produto prod=null;
       if(id==1){
           Sabor s1 = new Sabor(sabor1);
           Sabor s2 = new Sabor (sabor2);
           prod = new Pizza(descricao, preco, id,s1,s2);
       }
       else{
           prod = new Bebida(descricao, preco, id);
       }
       return prod;
    } 
    public Produto novoProduto(String decricao, float preco, int id){
        Produto prod = new Bebida(decricao, preco, id);
        return prod;
    } 
    
    
}
