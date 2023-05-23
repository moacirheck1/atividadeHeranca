package contapagamento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Venda extends TransacaoComercial {

//    Usuario usuario = new Usuario();
    Produto produto = new Produto();
    private String ncomprador = "";
    private String nvendedor = "";
    private String  produtos="";

    TipoCliente tipo;

    public Venda(Usuario usuario, Produto produto) {
        super(usuario, produto);
        
    }
    
   

 

    @Override
    public void negocio(Usuario comprador, Usuario vendedor, Produto produto) {

        if (comprador.getTipo() == tipo.CPF) {
            if (comprador.getContaBanco().tranferencia(vendedor, produto.getPreco() * 1.02)) {
                JOptionPane.showMessageDialog(null, "Venda finalizada para " + comprador.getNome());
                ncomprador += comprador.getNome();
                nvendedor += vendedor.getNome();
                produtos+=produto.getNome()+" ";

            } else {
                JOptionPane.showMessageDialog(null, "Venda nao realizada");
            }

        }
        if (comprador.getTipo() == tipo.CNPJ) {
            if (comprador.getContaBanco().tranferencia(vendedor, produto.getPreco())) {
                JOptionPane.showConfirmDialog(null, "Venda finalizada");
            } else {
                JOptionPane.showMessageDialog(null, "Venda nao realizada");

            }

        }

    }

    @Override
    public String toString() {

        return "Venda\n" + "Vendedor=" + nvendedor + "\nComprador=" + ncomprador + "\nProduto=" + produtos;
    }

}
