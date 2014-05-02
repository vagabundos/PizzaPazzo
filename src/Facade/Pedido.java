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
 * @author Lucas
 */
public class Pedido
{
    // Propriedades
    public int numeroPedido;
    public int Cliente;
    public List<ItemPedido> ItensPedido = null;
    public Date dataHoraPedido;
    public Pagamento pagamentoPedido;
    public status sttPedido;
    
    // Enums
    public enum status
    {
        AguardandoProducao,
        EmProducao,
        Despachado,
        Entregue
    }

    // Métodos
    public Pedido()
    {
        // Seta numeroPedido como -1, pois define o numero real do pedido no momento de gravar no banco
        this.numeroPedido = -1;
        this.ItensPedido = new ArrayList<>();
    }
    
    public boolean pagarPedido(int numPed)
    {
        try
        {   
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
}
