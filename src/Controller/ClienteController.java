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
public final class ClienteController
{

    static ClienteController myInstance = null;

    public static synchronized ClienteController getInstance()
    {
        if (myInstance == null)
        {
            myInstance = new ClienteController();
        }
        return myInstance;
    }

    public void cadastrarCliente(String nome, String endereco, String telefone)
    {
        Cliente cl = new Cliente(nome, telefone, endereco);

        // ToDo - Salvar cliente no banco
        cl.salvaCliente();
    }

    public void editarCliente(int ID, String nome, String endereco, String telefone)
    {
        Cliente objCliente = null;
        for (Cliente cl : Cliente.getLstCliente())
        {
            if (cl.ID == ID)
            {
                objCliente = cl;
                break;
            }
        }
        try
        {
            if (objCliente != null)
            {
                objCliente.nome = nome;
                objCliente.telefone = telefone;
                objCliente.endereco = endereco;
                objCliente.editaCliente();
            }
        } catch (Exception exc)
        {
            // deveria ser tratado possibilidade de erro
        }
    }
    
    public void apagarCliente(int IDCliente)
    {
        Cliente objCliente = null;
        for (Cliente cl : Cliente.getLstCliente())
        {
            if (cl.ID == IDCliente)
            {
                objCliente = cl;
                break;
            }
        }
        
        try
        {
            if (objCliente != null)
            {
                objCliente.ApagaCliente();
            }
        } catch (Exception exc)
        {
            // deveria ser tratado possibilidade de erro
        }
    }

    public List<Cliente> cmdBuscaCliente(String nome, String endereco, String telefone)
    {
        // Busca na lista de Clientes utilizando os filtros inseridos
        List<Cliente> lstClienteBusca = Cliente.comparaFiltros(nome, telefone, endereco);

        return lstClienteBusca;
    }

    public List<Object> getDados(Cliente cl)
    {
        List<Object> lst = new ArrayList<>();

        lst.add(0, cl.getID());
        lst.add(1, cl.getNome());
        lst.add(2, cl.getEndereco());
        lst.add(3, cl.getTelefone());

        return lst;
    }

}
