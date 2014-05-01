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
    private static List<Bebida> listaBebida= new ArrayList<Bebida>();
    public Bebida(String descricao, float preco, int id)
    {
        super(descricao, preco,id);
    }
    public static List<Bebida> getProduto(){
        return Bebida.listaBebida;
    }
    
}
