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
public class Cliente implements Comparable<Cliente>
{
    static List<Cliente> lstCliente = new ArrayList<Cliente>();
    
    String nome;
    String telefone;
    String endereco;

    public Cliente(String nome, String telefone, String endereco)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        
        lstCliente.add(this);
    }
    
    public static List<Cliente> comparaFiltros(String nome, String telefone, String endereco)
    {
        // Lista de clientes do resultado da busca de acordo com os filtros
        List<Cliente> lstClienteBusca = new ArrayList<Cliente>();
        
        // Cria cliente com os filtros inseridos para comparação
        Cliente clFiltro = new Cliente(nome,telefone,endereco);
        
        for(Cliente cl : lstCliente)
            if (cl.compareTo(clFiltro) == 1)
                lstClienteBusca.add(cl);
        
        return lstClienteBusca;
    }

    @Override
    public int compareTo(Cliente cl)
    {
        if (!(this.nome.contains(cl.nome)) && cl.nome != null)
            return 0;
        
        if (!(this.telefone.contains(cl.telefone)) && cl.telefone != null)
            return 0;
        
        if (!(this.endereco.contains(cl.endereco)) && cl.endereco != null)
            return 0;
        
        return 1;
    }
    
}
