import javax.swing.*;
import java.awt.*;

public class Interfaz2
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new JFrame("Inicio Sesion 2");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450, 300);

            //Separamos en paneles para organizar mejor la interfaz
            JPanel panelPrincipal = new JPanel(new BorderLayout());
            JPanel panelCentro = new JPanel(new GridLayout(4, 2, 5, 5));

            JLabel logo = new JLabel("MiApp", SwingConstants.CENTER);
            logo.setFont(new Font("Arial", Font.BOLD, 22));
            logo.setForeground(Color.RED);

            //Centramos el texto
            JLabel lblUsuario = new JLabel("Usuario:",SwingConstants.CENTER );
            JTextField txtUsuario = new JTextField();

            //Centramos el texto
            JLabel lblPass = new JLabel("Contraseña:", SwingConstants.CENTER);
            JPasswordField txtPass = new JPasswordField();

            //Añadimos ComboBox para seleccionar el idioma
            JCheckBox chkTerminos = new JCheckBox("Aceptar términos y condiciones");
            JRadioButton recordar = new JRadioButton("Recordar usuario");
            JComboBox<String> idiomas = new JComboBox<>(new String[]{"Español", "Inglés", "Chino"});

            JButton btnAcceder = new JButton("Acceder");
            btnAcceder.setBackground(Color.RED);
            btnAcceder.setForeground(Color.WHITE);

            panelCentro.add(lblUsuario);
            panelCentro.add(txtUsuario);
            panelCentro.add(lblPass);
            panelCentro.add(txtPass);
            panelCentro.add(new JLabel("Idioma:"));
            panelCentro.add(idiomas);
            panelCentro.add(chkTerminos);
            panelCentro.add(recordar);

            panelPrincipal.add(logo, BorderLayout.NORTH);
            panelPrincipal.add(panelCentro, BorderLayout.CENTER);
            panelPrincipal.add(btnAcceder, BorderLayout.SOUTH);

            frame.setContentPane(panelPrincipal);
            frame.setVisible(true);
        });
    }
}
