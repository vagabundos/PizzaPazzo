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
public class Bebida extends Produto
{

    private static List<Bebida> listaBebida = new ArrayList<Bebida>();

    public Bebida(String codigo, String descricao, float preco)
    {
        super(codigo, descricao, preco);
    }

    public static List<Bebida> getProduto()
    {
        return Bebida.listaBebida;
    }

    @Override
    public void novoProduto()
    {
        // ToDo - Cria nova bebida
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
