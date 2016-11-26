package com.idomine.stepbuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Padrão StepBuilder
 * 
 * @author Lyndon Tavares
 *
 */
public class Fatura
{
    private long id;
    private Date data;
    private Pessoa pessoa;
    private List<FaturaItem> itens;
    private Situacao situacao;

    public static InformeData Builder()
    {
        return new Builder();
    }

    public interface InformeData
    {
        InformePessoa informeData(Date data);
    }

    public interface InformePessoa
    {
        InformeItem informePessoa(String nome);
    }

    public interface InformeItem
    {
        InformeItem addItem(String item, double quant, double valor);

        Build fecharFatura();
    }

    public interface Build
    {
        Fatura build();
    }

    public static class Builder implements InformeData, InformePessoa, InformeItem, Build
    {

        private Date data;
        private Pessoa pessoa;
        private List<FaturaItem> itens;
        private Situacao situacao;

        public Builder()
        {
            itens = new ArrayList<>();
        }

        @Override
        public Fatura build()
        {
            return new Fatura(data, pessoa, itens, situacao);
        }

        @Override
        public InformePessoa informeData(Date data)
        {
            Objects.requireNonNull(data);
            this.data = data;
            return this;
        }

        @Override
        public InformeItem informePessoa(String nome)
        {
            Objects.requireNonNull(nome);
            pessoa = Pessoa.of(nome);
            return this;
        }

        @Override
        public InformeItem addItem(String item, double quant, double valor)
        {
            Objects.requireNonNull(item);
            itens.add(new FaturaItem(Produto.of(item), quant, valor));
            return this;
        }

        @Override
        public Build fecharFatura()
        {
            situacao = Situacao.Aberta;
            return this;
        }

    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public Pessoa getPessoa()
    {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

    public List<FaturaItem> getItens()
    {
        return itens;
    }

    public void setItens(List<FaturaItem> itens)
    {
        this.itens = itens;
    }

    public Situacao getSituacao()
    {
        return situacao;
    }

    public void setSituacao(Situacao situacao)
    {
        this.situacao = situacao;
    }

    private Fatura()
    {
        this.id = new Random().nextLong();
    }

    public Fatura(Date data, Pessoa pessoa, List<FaturaItem> itens, Situacao situacao)
    {
        this();
        this.data = data;
        this.pessoa = pessoa;
        this.itens = itens;
        this.situacao = situacao;
    }

    @Override
    public String toString()
    {
        return "Fatura [id=" + id + ", data=" + data + ", pessoa=" + pessoa + ", itens=" + itens + ", situacao="
                + situacao + "]";
    }

}
