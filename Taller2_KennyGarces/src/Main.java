import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame RegistroV = new JFrame("Registro Vehicular");
        RegistroV.setContentPane(new Registro().pnlMain);
        RegistroV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegistroV.setVisible(true);
    }

}
