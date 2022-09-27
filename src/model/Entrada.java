package model;

import java.util.Date;


public class Entrada {
    
    private String nome;
    private Classificacao classificacao;
    private Double valor;
    private String diaEntrada;
    private Date diaCadastro;
    
    private long id;
    
   
   public Entrada(String nome, Classificacao classificacao, Double valor, String diaEntrada, Date diaCadastro){
       this.nome = nome;
       this.classificacao = classificacao;
       this.valor = valor;
       this.diaEntrada = diaEntrada;
       this.diaCadastro = diaCadastro;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDiaEntrada() {
        return diaEntrada;
    }

    public void setDiaEntrada(String diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public Date getDiaCadastro() {
        return diaCadastro;
    }

    public void setDiaCadastro(Date diaCadastro) {
        this.diaCadastro = diaCadastro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entrada{" + "nome=" + nome + ", classificacao=" + classificacao + ", valor=" + valor + ", diaEntrada=" + diaEntrada + ", diaCadastro=" + diaCadastro + ", id=" + id + '}';
    }
    
    
    
}
