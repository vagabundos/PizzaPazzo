/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Gauss
 */
public abstract class Produto
{
    private String descricao;
    private float preco;
    private final int id;
    
    public Produto(String descricao, float preco, int id)
    {
        this.descricao = descricao;
        this.preco = preco;
        this.id = id;
    }
    
    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public float getPreco()
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    
    
}
