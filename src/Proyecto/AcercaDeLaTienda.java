package Proyecto;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;

public class AcercaDeLaTienda extends JDialog implements ActionListener {

    private final JPanel contentPanel = new JPanel();
    private JButton btnCerrar;

    public static void main(String[] args) {
        try {
            AcercaDeLaTienda dialog = new AcercaDeLaTienda();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AcercaDeLaTienda() {
        setTitle("Acerca de Tienda");
        setBounds(100, 100, 402, 336);
        getContentPane().setLayout(null);

        JLabel lblTienda = new JLabel("Tienda");
        lblTienda.setFont(new Font("Times New Roman", Font.BOLD, 26));
        lblTienda.setBounds(144, 10, 91, 54);
        getContentPane().add(lblTienda);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 62, 368, 2);
        getContentPane().add(separator);

        JLabel lblJesusChavez = new JLabel("Javier Oliver Jesús Chávez Salas (202223981) ");
        lblJesusChavez.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblJesusChavez.setBounds(48, 110, 350, 26);
        getContentPane().add(lblJesusChavez);

        JLabel lblAutores = new JLabel("Autores");
        lblAutores.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblAutores.setBounds(166, 74, 81, 26);
        getContentPane().add(lblAutores);

        JLabel lblBetsyPantaleon = new JLabel("Betsy Flavia Pantaleon Almengor (202221310)");
        lblBetsyPantaleon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblBetsyPantaleon.setBounds(48, 146, 346, 26);
        getContentPane().add(lblBetsyPantaleon);

        JLabel lblJuniorRodriguez = new JLabel("Hidetochi Junior Rodriguez Sandoval (202224525)");
        lblJuniorRodriguez.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblJuniorRodriguez.setBounds(48, 182, 350, 26);
        getContentPane().add(lblJuniorRodriguez);

        JLabel lblMelannyAtoche = new JLabel("Melanny Yaret Atoche Soto");
        lblMelannyAtoche.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblMelannyAtoche.setBounds(58, 218, 350, 26);
        getContentPane().add(lblMelannyAtoche);

        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(this);
        btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        btnCerrar.setBounds(144, 266, 91, 26);
        getContentPane().add(btnCerrar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCerrar) {
            actionPerformedBtnCerrar(e);
        }
    }

    protected void actionPerformedBtnCerrar(ActionEvent e) {
        dispose();
    }
}
