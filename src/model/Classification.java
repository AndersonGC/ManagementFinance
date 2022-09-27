package model;

public enum Classification {
    CASA("Casa"),
    COMPRAS("Compras"),  
    SAUDE("Saúde"),  
    AUTOMOVEL("Automóvel"), 
    ALIMENTACAO("Alimentação"),  
    BEM_ESTAR("Bem estar"), 
    INVESTIMENTO("Investimento"), 
    SALARIO("Salário"), 
    OUTRO("Outros");
    
    private String value;
            
    Classification(String value){
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
}


