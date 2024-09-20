import javax.swing.*;

public class ClienteAppJOp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String codigoStr = JOptionPane.showInputDialog("Digite o código do cliente:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");

        Integer codigo = Integer.parseInt(codigoStr);

        cliente.setNome(nome);
        cliente.setCodigo(codigo);
        cliente.setCpf(cpf);

        JOptionPane.showMessageDialog(null, cliente.toString(), "Dados do cliente", JOptionPane.INFORMATION_MESSAGE);


    }
}
