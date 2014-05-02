/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Facade.Pedido;
import Factory.PedidoFactoryConcrete;

/**
 *
 * @author Lucas
 */
public class PedidosController
{
    ///
    /// Utilizado ao abrir a tela de cadastro de pedido
    ///
    public Pedido cmdCadastraPedido()
    {
        // ToDo - Obtém cliente que vem da tela: Buscou ou Cadastrou novo cliente
        
        PedidoFactoryConcrete pedFactory = PedidoFactoryConcrete.getFactory();
        Pedido objPed = pedFactory.criaPedido();
        
        // ToDo - associa o pedido sendo criado com o cliente encontrado
        
        return objPed;
    }
    
    ///
    /// Ocorre após o usuário selecionar um novo itemPedido
    ///
    public Pedido cmdGetDetalhesProduto(Pedido objPed)
    {
        // Verifica disponibilidade do produto desejado
        
        
        
        return objPed;
    }
    
    ///
    /// Após o usuário incluir todos os itens desejados, salva Pedido no banco e na memória (aloca também o pedido numa entrega)
    ///
    public void cmdFinalizaCadastroPedido(Pedido objPed)
    {
        // ToDo - Salva o Pedido no banco
        
        // ToDo - Salva o Pedido na memória
        
        // ToDo - Chama método de Entrega: Aloca o Pedido à uma entrega
    }
    
    
    public void cmdEfetuaPagamento(int numPed)
    {
        //pagarPedido(numPed);
    }
}
