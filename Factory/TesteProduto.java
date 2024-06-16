package Main.Factory;

import Main.Factory.Solution.ProdutoFactory;

public class TesteProduto {
    public static void main(String[] args) {
    Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
    Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

    System.out.println(produtoDigital);
    System.out.println(produtoFisico);
    }

}
