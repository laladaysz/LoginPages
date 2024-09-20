import Model.Produto;

import javax.swing.*;

public class ProdutoApp {

    public static void main(String[] args) {

        Produto produto = new Produto();

        String nome = JOptionPane.showInputDialog("Insira o nome do produto: ");
        String codigoSTR = JOptionPane.showInputDialog("Insira o código do produto: ");
        String valorSTR = JOptionPane.showInputDialog("Insira o valor do produto: ");

        Integer codigo = Integer.parseInt(codigoSTR);
        Double valor = Double.parseDouble(valorSTR);

        produto.setNome(nome);
        produto.setCodigo(codigo);
        produto.setValor(valor);
        produto.setPreco(valor);

        JOptionPane.showMessageDialog(null, produto.toString(), "Dados do produto: ", JOptionPane.INFORMATION_MESSAGE);
    }
}
