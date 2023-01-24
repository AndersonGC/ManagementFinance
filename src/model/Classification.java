package model;

public enum Classification {
    ENERGIA("Energia"),
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

    Classification(String value) {
        this.value = value;
    }

    public static Classification getClassification(String description) {

        switch (description) {
            case "Energia":
                return ENERGIA;
            case "Casa":
                return CASA;
            case "Compras":
                return COMPRAS;
            case "Saúde":
                return SAUDE;
            case "Automóvel":
                return AUTOMOVEL;
            case "Alimentação":
                return ALIMENTACAO;
            case "Bem estar":
                return BEM_ESTAR;
            case "Investimento":
                return INVESTIMENTO;
            case "Salário":
                return SALARIO;
            case "Outros":
                return OUTRO;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
