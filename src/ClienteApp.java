import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cadastro de cliente");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome: ");
        JTextField nomeText = new JTextField();

        JLabel codigoLabel = new JLabel("Código: ");
        JTextField codigoText = new JTextField();

        JLabel CPFLabel = new JLabel("CPF: ");
        JTextField CPFText = new JTextField();

        JButton btnCadastrar = new JButton("Cadastrar cliente");
        JButton btnMostrar = new JButton("Mostrar cliente");

        frame.add(nomeLabel);
        frame.add(nomeText);

        frame.add(codigoLabel);
        frame.add(codigoText);

        frame.add(CPFLabel);
        frame.add(CPFText);

        frame.add(btnCadastrar);
        frame.add(btnMostrar);

        Cliente cliente = new Cliente();

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeText.getText();
                Integer codigo = Integer.parseInt(codigoText.getText());
                String cpf = CPFText.getText();

                cliente.setNome(nome);
                cliente.setCodigo(codigo);
                cliente.setCpf(cpf);

                JOptionPane.showMessageDialog(frame, "Cliente cadastrado com sucesso!");
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, cliente.toString());
            }
        });

        frame.setVisible(true);

    }
}
