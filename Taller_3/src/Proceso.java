import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.*;
public class Proceso implements Runnable{

    JPanel lblRojo;
    JPanel lblAmarillo;
    JPanel lblVerde;
    int contador = 0;

    public Proceso(JPanel entrada1, JPanel entrada2, JPanel entrada3){

        this.lblRojo = entrada1;
        this.lblAmarillo = entrada2;
        this.lblVerde = entrada3;
    }

    @Override
    public void run(){
        while (true){

            contador++;


            if(contador==1){
                lblRojo.setBackground(new Color(145,27,39));
                lblAmarillo.setBackground(new Color(179,163,5));
                lblVerde.setBackground(Color.green);
            }

            if(contador==5){
                lblRojo.setBackground(new Color(145,27,39));
                lblAmarillo.setBackground(Color.yellow);
                lblVerde.setBackground(new Color(12,109,0));
            }

            if(contador==7){
                lblRojo.setBackground(Color.red);
                lblAmarillo.setBackground(new Color(179,163,5));
                lblVerde.setBackground(new Color(12,109,0));
            }

            if(contador==9){
                lblRojo.setBackground(Color.red);
                lblAmarillo.setBackground(new Color(179,163,5));
                lblVerde.setBackground(new Color(12,109,0));
            }
            if(contador==11){
                lblRojo.setBackground(new Color(145,27,39));
                lblAmarillo.setBackground(new Color(179,163,5));
                lblVerde.setBackground(Color.green);
            }
            if(contador==11){
                contador=0;
            }
            try{
                sleep(1000);
            }catch (Exception e){
            }
        }
    }
    public void start(){
        new Thread(this).start();
    }
}
