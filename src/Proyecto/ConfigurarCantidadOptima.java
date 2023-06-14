package Proyecto;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarCantidadOptima extends JDialog implements ActionListener {

    private final JPanel contentPanel = new JPanel();
    private static JTextField txtCantidadOptima;
    private JButton btnCancelar;
    private JButton btnAceptar;

    public static void main(String[] args) {
        try {
            ConfigurarCantidadOptima dialog = new ConfigurarCantidadOptima();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ConfigurarCantidadOptima() {
        setTitle("Configurar cantidad óptima");
        setBounds(100, 100, 450, 126);
        getContentPane().setLayout(null);

        JLabel lblCantidadOptima = new JLabel("Cantidad óptima de unidades vendidas");
        lblCantidadOptima.setBounds(10, 21, 279, 18);
        lblCantidadOptima.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        getContentPane().add(lblCantidadOptima);

        txtCantidadOptima = new JTextField();
        txtCantidadOptima.setBounds(207, 19, 96, 19);
        txtCantidadOptima.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        txtCantidadOptima.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        getContentPane().add(txtCantidadOptima);
        txtCantidadOptima.setColumns(10);

        txtCantidadOptima.setText(MenúCerámicos.cantidadOptima + "");

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);
        btnAceptar.setBounds(344, 18, 85, 21);
        btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        getContentPane().add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        btnCancelar.setBounds(344, 49, 85, 21);
        btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        getContentPane().add(btnCancelar);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            actionPerformedBtnAceptar(e);
        }
        if (e.getSource() == btnCancelar) {
            actionPerformedBtnCancelar(e);
        }
    }

    protected void actionPerformedBtnCancelar(ActionEvent e) {
        dispose();
    }

    protected void actionPerformedBtnAceptar(ActionEvent e) {
        MenúCerámicos.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
    }
}
