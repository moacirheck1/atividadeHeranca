package contapagamento;

public class Usuario {

    private String nome;
    private String cpf_cnpj;
    private ContaBanco contaBanco;
    private TipoCliente tipo;

    public Usuario(String nome, String cpf_cnpj, ContaBanco contaBanco, TipoCliente tipo) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.contaBanco = contaBanco;
        this.tipo = tipo;
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public ContaBanco getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBanco contaBanco) {
        this.contaBanco = contaBanco;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario\n" + "{\nnome=" + nome + "\ncpf_cnpj=" + cpf_cnpj + "\nConta Banco" + contaBanco + "\ntipo=" + tipo+"\n}";
    }

   
    
}
