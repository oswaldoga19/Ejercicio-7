// Archivo: VentanaComparador.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaComparador extends JFrame {
    private JTextField aTextField;
    private JTextField bTextField;
    private JLabel resultadoLabel;

    public VentanaComparador() {
        setTitle("Comparador de Números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel aLabel = new JLabel("A:");
        aTextField = new JTextField();
        JLabel bLabel = new JLabel("B:");
        bTextField = new JTextField();
        JButton compararButton = new JButton("Comparar");
        resultadoLabel = new JLabel();

        compararButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(aTextField.getText());
                    double b = Double.parseDouble(bTextField.getText());
                    String resultado = ComparadorNumeros.comparar(a, b);
                    resultadoLabel.setText(resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Ingresa valores numéricos válidos.");
                }
            }
        });

        panel.add(aLabel);
        panel.add(aTextField);
        panel.add(bLabel);
        panel.add(bTextField);
        panel.add(compararButton);
        panel.add(resultadoLabel);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaComparador();
    }
}
