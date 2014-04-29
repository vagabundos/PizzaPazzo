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
public class Entrega
{

    private List<Pedido> listaPedido = null;

    public Entrega()
    {
        this.listaPedido = new ArrayList<Pedido>();
    }

    public Entrega(List<Pedido> listaPedido)
    {
        this.listaPedido = listaPedido;
    }
}
