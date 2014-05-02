/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import DO.DOCliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Cliente implements Comparable<Cliente>
{

    static List<Cliente> lstCliente = new ArrayList<Cliente>();

    public int ID;
    public String nome;
    public String telefone;
    public String endereco;

    public Cliente(String nome, String telefone, String endereco)
    {
        // Seta ID como -1, pois define ID real do cliente no momento de gravar no banco
        this.ID = -1;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public static List<Cliente> comparaFiltros(String nome, String telefone, String endereco)
    {
        // Lista de clientes do resultado da busca de acordo com os filtros
        List<Cliente> lstClienteBusca = new ArrayList<Cliente>();

        // Cria cliente com os filtros inseridos para comparação
        Cliente clFiltro = new Cliente(nome, telefone, endereco);

        for (Cliente cl : lstCliente)
        {
            if (cl.compareTo(clFiltro) == 1)
            {
                lstClienteBusca.add(cl);
            }
        }

        return lstClienteBusca;
    }

    @Override
    public int compareTo(Cliente cl)
    {
        if (cl.nome != null && !(this.nome.contains(cl.nome)))
            return 0;

        if (cl.telefone != null && !(this.telefone.contains(cl.telefone)))
            return 0;

        if (cl.endereco != null && !(this.endereco.contains(cl.endereco)))
            return 0;

        return 1;
    }

    public void salvaCliente()
    {
        // ToDo - Grava cliente no banco
        DOCliente DOcl = new DOCliente();
        DOcl.salva();
        
        // Insere cliente na lista de memória
        lstCliente.add(this);
    }

}
