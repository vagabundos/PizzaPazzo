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
public class ItemPedido {

    private List<Pedido> listPedidos=null;
    
    public ItemPedido(List<Pedido> listPedidos) {
        this.listPedidos = listPedidos;
    }
    public ItemPedido(){
        this.listPedidos = new ArrayList<Pedido>();
    }
    
}
