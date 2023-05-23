package contapagamento;

public class Main {

    public static void main(String[] args) {

        ContaBanco contaloja = new ContaBanco("9876", 10000);
        ContaBanco contaMoacir = new ContaBanco("5432",2000);
        Usuario loja = new Usuario("Loja", "98747576754", contaloja, TipoCliente.CNPJ);
        Usuario moacir = new Usuario("Moacir", "03030303030", contaMoacir, TipoCliente.CPF);
        Produto notebook = new Produto("Notebook", 1800);
        Compra compra=new Compra(loja, notebook);
        compra.negocio(moacir, loja, notebook);
        Venda venda=new Venda( loja, notebook);
        venda.negocio(moacir, loja, notebook);
        System.out.println(moacir);
        System.out.println(loja);
        System.out.println(venda);
    }

}
