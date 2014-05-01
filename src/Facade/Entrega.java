/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gauss
 */
public class Entrega {

    private int ID;
    private List<Integer> Pedidos;
    private Date dataEntrega;
    private boolean entregaRealizada;

    public Entrega() {
        this.ID = -1;
        this.dataEntrega = new Date();
        this.entregaRealizada = false;
        this.Pedidos = new ArrayList<>();
    }

    public Entrega(List<Integer> Pedidos) {
        this.ID = -1;
        this.dataEntrega = new Date();
        this.entregaRealizada = false;
        this.Pedidos = Pedidos;
    }
}
