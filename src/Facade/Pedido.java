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
public class Pedido
{
    private List<ItemPedido> listItensPedido = null;

    public Pedido(List<ItemPedido> listItensPedido)
    {
        this.listItensPedido = listItensPedido;
    }

    public Pedido()
    {
        this.listItensPedido = new ArrayList<ItemPedido>();
    }
}
