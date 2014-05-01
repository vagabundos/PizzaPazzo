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
public class Pizza extends Produto
{
     private Sabor sabor1;
     private Sabor sabor2;
    public Pizza(String descricao, float preco, int id,Sabor sabor1,Sabor sabor2)
    {
        super(descricao, preco, id);
        this.sabor1 = sabor1;
        this.sabor2 = sabor2;   
    }
     public Sabor getSabor1()
    {
        return sabor1;
    }

    public void setSabor1(Sabor sabor1)
    {
        this.sabor1 = sabor1;
    }

    public Sabor getSabor2()
    {
        return sabor2;
    }

    public void setSabor2(Sabor sabor2)
    {
        this.sabor2 = sabor2;
    }
}
