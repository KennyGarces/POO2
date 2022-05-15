import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Proceso2 implements Runnable{

    JPanel lblRojo2;
    JPanel lblAmarillo2;
    JPanel lblVerde2;
    int contador = 0;

    public Proceso2(JPanel entrada4, JPanel entrada5, JPanel entrada6){

        this.lblRojo2 = entrada4;
        this.lblAmarillo2 = entrada5;
        this.lblVerde2 = entrada6;
    }

    @Override
    public void run(){
        while (true){

            contador++;

            if(contador==1){
                lblRojo2.setBackground(Color.red);
                lblAmarillo2.setBackground(new Color(179,163,5));
                lblVerde2.setBackground(new Color(12,109,0));
            }

            if(contador==5){
                lblRojo2.setBackground(Color.red);
                lblAmarillo2.setBackground(new Color(179,163,5));
                lblVerde2.setBackground(new Color(12,109,0));
            }

            if(contador==7){
                lblRojo2.setBackground(new Color(145,27,39));
                lblAmarillo2.setBackground(new Color(179,163,5));
                lblVerde2.setBackground(Color.green);
            }

            if(contador==9){
                lblRojo2.setBackground(new Color(145,27,39));
                lblAmarillo2.setBackground(Color.yellow);
                lblVerde2.setBackground(new Color(12,109,0));
            }
            if(contador==11){
                lblRojo2.setBackground(Color.red);
                lblAmarillo2.setBackground(new Color(179,163,5));
                lblVerde2.setBackground(new Color(12,109,0));
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

