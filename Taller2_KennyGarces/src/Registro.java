import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Registro {
    private JLabel lblVehiculo;
    private JRadioButton rbtMOTO;
    private JRadioButton rbtCARRO;
    private JLabel lblRVEHICULO;
    private JLabel lblMARCA;
    private JLabel lblMODELO;
    private JTextField txtMarca;
    private JLabel lblPLACA;
    private JTextField txtModelo;
    private JTextField txtPlaca;
    private JLabel lblENTRADA;
    private JTextField txtFechaE;
    private JLabel lblFechaE;
    private JLabel lblHoraE;
    private JTextField txtHoraE;
    private JLabel LBLSalida;
    private JLabel lblFechaS;
    private JTextField txtFechaS;
    private JLabel lblHoraS;
    private JTextField txtHoraS;
    private JButton btnCalcularPrecio;
    public JPanel pnlMain;
    private JLabel lblphoto;

    private JLabel lblPHora;
    private JTextField txtPHoras;
    private JLabel lblfec;
    private JLabel lblHor;
    private JLabel lblFec;
    private JLabel lblhor;

    private String TipoVehiculo;


    public Registro() {

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbtMOTO);
        buttonGroup.add(rbtCARRO);

        rbtMOTO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {TipoVehiculo = "MOTO";
                }
        });
        rbtCARRO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {TipoVehiculo = "CARRO";

            }

        });

        btnCalcularPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtModelo.getText().isEmpty() && !txtPlaca.getText().isEmpty() && !txtMarca.getText().isEmpty() && !txtFechaE.getText().isEmpty() && !txtFechaS.getText().isEmpty() && !txtHoraE.getText().isEmpty()&& !txtHoraS.getText().isEmpty()&&!txtPHoras.getText().isEmpty()){
                    JOptionPane.showMessageDialog(new JFrame(), "VEHICULO: "+ TipoVehiculo.toString()+"\nPRECIO TARIFA-HORA:"+txtPHoras.getText()+"\nMODELO: " + txtModelo.getText() + "\nPLACA: " + txtPlaca.getText()+ "\nMARCA: "+ txtMarca.getText()
                                 + "\nFECHA Y HORA DE ENTRADA: F: "+txtFechaE.getText()+" H: "+txtHoraE.getText() + "\nFECHA Y HORA DE SALIDA: F: "+txtFechaS.getText()+" H: "+txtHoraS.getText());

                }
            }
        });

        btnCalcularPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        double Tarifa = Double.parseDouble(txtPHoras.getText());
                        SimpleDateFormat format = new  SimpleDateFormat("HH:mm:ss");
                        Date firstHour = format.parse(txtHoraE.getText());
                        Date secondHour = format.parse(txtHoraS.getText());
                        long timeDiff = Math.abs(secondHour.getTime()-firstHour.getTime());
                        long hours = TimeUnit.HOURS.convert(timeDiff, TimeUnit.MILLISECONDS);
                        SimpleDateFormat format1 = new  SimpleDateFormat("dd/MM/yyyy");
                        Date firstDate = format1.parse(txtFechaE.getText());
                        Date secondDate = format1.parse(txtFechaS.getText());
                        long timeDiff1 = Math.abs(secondDate.getTime()-firstDate.getTime());
                        long days = TimeUnit.HOURS.convert(timeDiff1, TimeUnit.MILLISECONDS);
                        JOptionPane.showMessageDialog(new JFrame(),"El valor de la tarifa es: "+ (hours+days)*Tarifa);


                    }catch (Exception ex){
                    JOptionPane.showMessageDialog(new JFrame(), "Error: Asegurense de que el formato de la fecha y la hora sean validos.");
                }
            }
        });

    }
}
