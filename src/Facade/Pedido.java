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
 * @author Lucas
 */
public class Pedido
{
    static List<Pedido> lstPedidos = new ArrayList<Pedido>();
    private List<ItemPedido> listItensPedido = null;
    int numeroPedido;
    String dataHoraPedido;
    Pagamento pagamentoPedido;
    status sttPedido;
    public enum status
    {
        aguardandoProducao,
        emProducao,
        despachado,
        entregue
    }

    public Pedido(List<ItemPedido> listItensPedido)
    {
        this.listItensPedido = listItensPedido;
    }

    public Pedido()
    {
        this.listItensPedido = new ArrayList<ItemPedido>();
    }
    
    public boolean pagarPedido(int numPed)
    {
        try
        {
            // Verifica se o pedido realmente existe
            if (!existePedido(numPed))
                throw new Exception("O pedido " + numPed + " não existe.");
            
            // Verifica se o pedido já foi pago
            if (pagamentoPedido.pedidoPago())
                throw new Exception("O pedido " + numPed + " já foi pago anteriormente.");
            
            // Dados do cliente?
            
            pagamentoPedido.realizaPagamento(numPed);
        }
        catch(Exception ex)
        {
            return false;
        }
        
        return true;
    }

    // Verifica se um determinado pedido existe no sistema
    private boolean existePedido(int numPed)
    {
        for(Pedido ped: lstPedidos)
            if (ped.numeroPedido == numPed)
                return true;
        return false;
    }
}
