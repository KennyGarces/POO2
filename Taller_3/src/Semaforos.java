import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Semaforos {
    public JPanel pnlSemaforos;
    private JPanel pnlS1;
    private JPanel pnlS2;
    private JPanel lblRojo;
    private JPanel lblAmarillo;
    private JPanel lblVerde;
    private JPanel lblRojo2;
    private JPanel lblAmarillo2;
    private JPanel lblVerde2;
    private JButton iniciarButton;

    public Semaforos() {
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Proceso objeto = new Proceso(lblRojo,lblAmarillo,lblVerde);
                objeto.start();

                Proceso2 objeto2 = new Proceso2(lblRojo2,lblAmarillo2,lblVerde2);
                objeto2.start();
            }
        });
    }
}
