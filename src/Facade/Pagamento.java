/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import static Facade.Pagamento.status.pago;

/**
 *
 * @author Gauss
 */
public abstract class Pagamento
{
    float valor;
    status sttPagamento;
    public enum status
    {
        pendente,
        pago
    }
    
    public boolean pedidoPago()
    {
        return (sttPagamento == pago);
    }
    
    public abstract void realizaPagamento(int numPed);
}
