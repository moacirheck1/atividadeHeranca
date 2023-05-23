package contapagamento;

import javax.swing.JOptionPane;

public class ContaBanco {

    TipoCliente tipo;
    private String numConta;
    private double saldo;

    public ContaBanco(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBanco() {
    }

    public boolean tranferencia(Usuario usuario, double valor) {
        if (desconta(valor)) {
            usuario.getContaBanco().setSaldo(usuario.getContaBanco().getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Tranferencia Realizada");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficientem no else depois do desconta valor");
            return false;
        }
    }

    public void saque(double valor) {
        if (desconta(valor)) {
            JOptionPane.showMessageDialog(null, "Saque realizado");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

    public boolean desconta(double valor) {
        if ( valor<= this.saldo ) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\n" + "numConta=" + numConta + "\nsaldo=" + saldo;
    }

}
