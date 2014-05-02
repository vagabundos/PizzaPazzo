/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Facade.Bebida;
import Facade.Pizza;
import Facade.Produto;
import GUI.ctlCadProduto.tipoCadastro;

/**
 *
 * @author Gauss
 */
public final class ProdutoController
{
    static ProdutoController myInstance = null;

    public static synchronized ProdutoController getInstance()
    {
        if (myInstance == null)
        {
            myInstance = new ProdutoController();
        }
        return myInstance;
    }

    public void cadastrarProduto(String codigo, tipoCadastro tipo, String descricao, float preco)
    {
        Produto pr = null;
        
        if (tipo == tipoCadastro.sabor)
            pr = new Pizza(codigo, descricao, preco);
        
        else if (tipo == tipoCadastro.sabor)
            pr = new Bebida(codigo, descricao, preco);
        
        pr.novoProduto();
        
        // ToDo - Salvar produto no banco
        
    }

    public void editarProduto(int ID, String nome, String endereco, String telefone)
    {
        /*
        Produto objProduto = null;
        for (Produto cl : Produto.getLstCliente())
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
        */
    }
    
    public void apagarCliente(int IDCliente)
    {
        /*
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
        */
    }

}
