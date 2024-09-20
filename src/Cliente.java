public class Cliente {

    private String nome;
    private Integer codigo;
    private String cpf;

    public Cliente(String nome, Integer codigo, String CPF) {
        this.nome = nome;
        this.codigo = codigo;
        this.cpf = cpf;
    }

    public Cliente() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Cliente: \nnome: " +nome+ "\ncódigo: " +codigo+ "\nCPF: " +cpf;
    }
}
