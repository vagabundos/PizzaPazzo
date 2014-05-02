/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Facade.Cliente;
import java.util.ArrayList;
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
        
        cl.salvaCliente();
    }
    
    public List<Cliente> cmdBuscaCliente(String nome, String telefone, String endereco)
    {
        // Busca na lista de Clientes utilizando os filtros inseridos
        List<Cliente> lstClienteBusca = Cliente.comparaFiltros(nome,telefone,endereco);
        
        return lstClienteBusca;
    }
    
}
