/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Facade.Cliente;
import java.util.List;

/**
 *
 * @author Gauss
 */
public class ClienteController
{
    public void cadastrarCliente(String nome, String telefone, String endereco)
    {
        Cliente cl = new Cliente(nome,telefone,endereco);
        
        // ToDo - Salvar cliente no banco
    }
    
    public List<Cliente> cmdBuscaCliente(String nome, String telefone, String endereco)
    {
        // ToDo - Realizar busca na MEMÓRIA com os filtros específicos
        //        No diagrama de sequencia, foi feito para buscar na MEMÓRIA
        return null;
    }
    
}
