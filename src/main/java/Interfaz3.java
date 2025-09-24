import javax.swing.*;
import java.awt.*;

public class Interfaz3
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new JFrame("Interfaz3");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);

            // JTabbedPane para poder seleccionar entre login y registrarte
            JTabbedPane tabbedPane = new JTabbedPane();

            // Panel login
            JPanel loginPanel = createLoginPanel();

            // Panel registrar
            JPanel registrationPanel = createRegistrationPanel();

            //Los añadimos y les ponemos el nombre
            tabbedPane.addTab("Login", loginPanel);
            tabbedPane.addTab("Registro", registrationPanel);

            // JProgressBar
            JProgressBar progressBar = new JProgressBar();
            progressBar.setStringPainted(true);
            progressBar.setValue(0);

            // JSpinner para seleccionar la edad
            JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 1, 100, 1));
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)ageSpinner.getEditor();
            spinnerEditor.getTextField().setEditable(true); // make the text field editable

            // Layout para el mainframe
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(tabbedPane, BorderLayout.CENTER);

            // Panel para colocar los botones
            JPanel bottomPanel = new JPanel(new FlowLayout());
            bottomPanel.add(new JLabel("Edad:"));
            bottomPanel.add(ageSpinner);
            bottomPanel.add(new JLabel("Cargando..."));
            bottomPanel.add(progressBar);
            mainPanel.add(bottomPanel, BorderLayout.SOUTH);

            // Simulamos el progreso de la barra de carga
            Timer timer = new Timer(500, e ->
            {
                int value = progressBar.getValue();
                if (value < 100)
                {
                    progressBar.setValue(value + 10);
                    if (value > 50)
                {
                    progressBar.setValue(value + 5);
                }
                }  else
                {
                    ((Timer)e.getSource()).stop();
                }
            });
            timer.start();

            frame.setContentPane(mainPanel);
            frame.setVisible(true);
        });
    }

    //Se crean el metodo JPanel para elergir la ventana de inicio de sesion
    private static JPanel createLoginPanel()
    {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel centerPanel = new JPanel(new GridLayout(4, 2, 5, 5));

        JLabel logo = new JLabel("MiApp", SwingConstants.CENTER);
        logo.setFont(new Font("Arial", Font.BOLD, 22));
        logo.setForeground(Color.RED);

        JLabel lblUsuario = new JLabel("Usuario:", SwingConstants.CENTER);
        JTextField txtUsuario = new JTextField();

        JLabel lblPass = new JLabel("Contraseña:", SwingConstants.CENTER);
        JPasswordField txtPass = new JPasswordField();

        JCheckBox chkTerminos = new JCheckBox("Aceptar términos y condiciones");
        JRadioButton recordar = new JRadioButton("Recordar usuario");
        JComboBox<String> idiomas = new JComboBox<>(new String[]{"Español", "Inglés", "Chino"});

        JButton btnAcceder = new JButton("Acceder");
        btnAcceder.setBackground(Color.RED);
        btnAcceder.setForeground(Color.WHITE);

        centerPanel.add(lblUsuario);
        centerPanel.add(txtUsuario);
        centerPanel.add(lblPass);
        centerPanel.add(txtPass);
        centerPanel.add(new JLabel("Idioma:"));
        centerPanel.add(idiomas);
        centerPanel.add(chkTerminos);
        centerPanel.add(recordar);
        panel.add(logo, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(btnAcceder, BorderLayout.SOUTH);

        return panel;
    }

    //Se crean el metodo JPanel para elergir la ventana de registrarse
    private static JPanel createRegistrationPanel()
    {
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));

        panel.add(new JLabel("Nombre:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Apellido:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Usuario:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Contraseña:"));
        panel.add(new JPasswordField());

        panel.add(new JLabel("Confirmar Contraseña:"));
        panel.add(new JPasswordField());

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBackground(Color.BLUE);
        btnRegistrar.setForeground(Color.WHITE);
        panel.add(new JLabel());
        panel.add(btnRegistrar);

        return panel;
    }
}