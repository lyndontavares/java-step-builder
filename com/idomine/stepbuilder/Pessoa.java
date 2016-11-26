package com.idomine.stepbuilder;

import java.util.Random;

public class Pessoa
{
    private long id;
    private String Nome;

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
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public Pessoa()
    {
        this.id = new Random().nextLong();
    }

    public Pessoa(String nome)
    {
        this();
        Nome = nome;
    }

    public static Pessoa of(String nome)
    {
        return new Pessoa(nome);
    }
    
    @Override
    public String toString()
    {
        return "Pessoa [id=" + id + ", Nome=" + Nome + "]";
    }


}
