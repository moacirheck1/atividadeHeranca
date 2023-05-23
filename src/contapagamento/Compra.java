
package contapagamento;

import javax.swing.JOptionPane;

public class Compra extends TransacaoComercial{
TipoCliente tipo;

    public Compra(Usuario usuario, Produto produto) {
        super(usuario, produto);
    }
  

    @Override
    public void negocio(Usuario comprador, Usuario vendedor, Produto produto) {
      
      
      if (comprador.getTipo() == tipo.CNPJ) {
              if(comprador.getContaBanco().tranferencia(vendedor, produto.getPreco())){
            JOptionPane.showMessageDialog(null,"Compra realizada");
        }else
            JOptionPane.showMessageDialog(null,"Compra nao finalizada");
                  
    }else
           JOptionPane.showMessageDialog(null,"Compra permitida apenas para CNPJ");
          

 
    }   
}
