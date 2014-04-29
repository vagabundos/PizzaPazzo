/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Facade.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gauss
 */
public class CardapioFactory
{
    CardapioFactory instance = null;
    
    public CardapioFactory getInstance()
    {
        if(instance == null)
            instance = new CardapioFactory();
        return instance;
    }
    
    public List<Produto> criaCardapio()
    {
        return new ArrayList<Produto>();
    }
}
