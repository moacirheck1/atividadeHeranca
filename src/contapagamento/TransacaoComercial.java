package contapagamento;

public abstract class TransacaoComercial {

    private Usuario usuario;
    private Produto produto;

    public TransacaoComercial(Usuario usuario, Produto produto) {
        this.usuario = usuario;
        this.produto = produto;
      
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public abstract void negocio(Usuario usuario,Usuario usuario1, Produto produto);

    @Override
    public String toString() {
        return "TransacaoComercial\n" + "usuario="  + ", produto=" + produto + '}';
    }
    
}
