package com.idomine.stepbuilder;

import java.util.Random;

public class FaturaItem
{

    private long id;
    private Produto produto;
    private Double quantidade;
    private Double valorUnitario;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Produto getProduto()
    {
        return produto;
    }

    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }

    public Double getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(Double quantidade)
    {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario()
    {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario)
    {
        this.valorUnitario = valorUnitario;
    }

    public FaturaItem()
    {
        this.setId(new Random().nextLong());
    }

    public FaturaItem(Produto produto, Double quantidade, Double valorUnitario)
    {
        this();
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString()
    {
        return "FaturaItem [produto=" + produto + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario
                + "]";
    }

}
