package Model;

public class Produto {

    private String nome;
    private Integer codigo;
    private Double valor;
    private Double preco;

    public Produto(String nome, Integer codigo, Double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public void setPreco(Double valor) {
        this.preco = valor * 1.2;
    }

    public Produto() {}

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCodigo (Integer codigo) {
        this.codigo = codigo;
    }

    public void setValor (Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: \nNome: "+nome+"\nCódigo: "+codigo+"\nValor: "+valor+"R$\nPreço: "+preco+"R$";
    }

}
