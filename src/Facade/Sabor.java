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
public class Sabor
{

    private static List<Sabor> listSabor = new ArrayList<Sabor>();
    private String nomeSabor;

    public Sabor(String nomeSabor)
    {
        this.nomeSabor = nomeSabor;
    }

    public String getNomeSabor()
    {
        return nomeSabor;
    }

    public void setNomeSabor(String nomeSabor)
    {
        this.nomeSabor = nomeSabor;
    }

    public void novoSabor(Sabor s1)
    {
        Sabor.listSabor.add(s1);
    }

    public static List<Sabor> getSabores()
    {
        return Sabor.listSabor;
    }
}
