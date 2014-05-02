/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gauss
 */
public class Pizza extends Produto
{

    private Sabor sabor1;
    private Sabor sabor2;

    public Pizza(String codigo, String descricao, float preco, Sabor sabor1, Sabor sabor2)
    {
        super(codigo, descricao, preco);
        this.sabor1 = sabor1;
        this.sabor2 = sabor2;
    }

    public Pizza(String codigo, String descricao, float preco)
    {
        super(codigo, descricao, preco);
    }
    
    @Override
    public void novoProduto()
    {
        // ToDo - Chama método de Sabor para criar novo sabor
        Sabor sb = new Sabor();
        
        sb.novoSabor();
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
