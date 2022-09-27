package model;

public enum Classificacao {
    CASA("Casa"),
    COMPRAS("Compras"),  
    SAUDE("Saúde"),  
    AUTOMOVEL("Automóvel"), 
    ALIMENTACAO("Alimentação"),  
    BEM_ESTAR("Bem estar"), 
    INVESTIMENTO("Investimento"), 
    SALARIO("Salário"), 
    OUTRO("Outros");
    
    private String valor;
            
    Classificacao(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return valor;
    }
}


