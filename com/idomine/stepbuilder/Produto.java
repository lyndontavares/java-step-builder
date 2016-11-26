package com.idomine.stepbuilder;

import java.util.Random;

public class Produto
{
    private long id;
    private String nome;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Produto()
    {
        this.id= new Random().nextLong();
    }

    public Produto(String nome)
    {
        this();
        this.nome = nome;
    }
    
    public static Produto of(String nome)
    {
        return new Produto(nome);
    }

    @Override
    public String toString()
    {
        return "Produto [id=" + id + ", nome=" + nome + "]";
    }

}
