import javax.swing.*;
import java.awt.*;

public class InicioSesion
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new JFrame("Interfaz1");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 250);
            frame.setLayout(new GridLayout(5, 2, 5, 5));

            //Etiqueta con Nombre de la aplicacion
            JLabel logo = new JLabel("Inicio de Sesion", SwingConstants.CENTER);
            logo.setFont(new Font("Arial", Font.BOLD, 20));
            logo.setForeground(Color.BLUE);

            //Etiqueta con texto para usuario
            JLabel lblUsuario = new JLabel("Usuario:");
            JTextField txtUsuario = new JTextField();

            //Etiqueta con texto para contraseña
            JLabel lblPass = new JLabel("Contraseña:");
            JPasswordField txtPass = new JPasswordField();

            //Checkbox para aceptar terminos y contidiones
            JCheckBox chkTerminos = new JCheckBox("Aceptar términos y condiciones");

            //Boton para acceder
            JButton btnAcceder = new JButton("Acceder");

            //Abrimos la interfaz
            frame.add(logo);
            frame.add(new JLabel(""));
            frame.add(lblUsuario);
            frame.add(txtUsuario);
            frame.add(lblPass);
            frame.add(txtPass);
            frame.add(chkTerminos);
            frame.add(new JLabel(""));
            frame.add(btnAcceder);
            frame.setVisible(true);
        });
    }
}

