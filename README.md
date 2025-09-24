# Proyecto de Interfaces de Usuario en Java Swing
Este proyecto es una serie de interfaces de usuario desarrolladas en Java Swing, que demuestran la evolución de un diseño simple a una aplicación más compleja y funcional.

Cada archivo Java representa una etapa de este proceso, introduciendo nuevos componentes y patrones de diseño para mejorar la organización y la experiencia del usuario.

# Fases del Proyecto
##Interfaz 1 (InicioSesion.java)
La versión inicial del proyecto. Es un formulario básico de inicio de sesión que utiliza un GridLayout para una distribución simple y lineal de los componentes.

### Componentes: 
JFrame, JLabel, JTextField, JPasswordField, JCheckBox y JButton.

### Diseño: 
Un GridLayout que organiza los elementos en una cuadrícula.

## Interfaz 2 (Interfaz2.java)
Esta versión mejora la organización al introducir el uso de paneles. La interfaz se divide lógicamente en secciones usando JPanel con diferentes Layouts, lo que permite un diseño más estructurado.

### Componentes Adicionales: 
JRadioButton para opciones y JComboBox para selección de idiomas.

### Diseño: 
Se utiliza BorderLayout para el panel principal, lo que permite dividir la interfaz en zonas (superior, central, inferior), mejorando la separación de los elementos visuales.

## Interfaz 3 (Interfaz3.java)
La versión más completa, que introduce funcionalidades avanzadas y una estructura de código modular. La interfaz es más dinámica y amigable, mostrando una aplicación más moderna.

## Componentes Adicionales:

### JTabbedPane: 
Permite navegar entre la vista de "Login" y la de "Registro" en la misma ventana.

### JProgressBar: 
Proporciona una barra de progreso visual para indicar el estado de una tarea.

### JSpinner: 
Un campo para la selección de valores numéricos de forma controlada.

#### Diseño y Funcionalidad:

La lógica de la interfaz se divide en métodos separados (createLoginPanel, createRegistrationPanel), lo que mejora la legibilidad y la reutilización del código.

Se añade un Timer para simular la animación de la barra de progreso, lo que mejora la interactividad.

# Cómo Ejecutar el Proyecto
Para compilar y ejecutar las interfaces, puedes usar tu IDE favorito (como IntelliJ IDEA, Eclipse o Visual Studio Code).

Abre el proyecto.

Ejecuta la clase principal de la interfaz que desees ver (InicioSesion.java, Interfaz2.java o Interfaz3.java).
