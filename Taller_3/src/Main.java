import javax.swing.*;
/*INTEGRANTES:
  Kenny Alejandro Garcés Cabrera
* Kamila Andrea Pineda Pacheco
* Angel Francisco Ramos Castillo*/
public class Main {
    public static void main (String []args){
        JFrame frame = new JFrame("Hilos" );
        frame.setSize(500,600);
        frame.setContentPane(new Semaforos().pnlSemaforos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
