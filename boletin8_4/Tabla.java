/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_4;
import javax.swing.JOptionPane;
/**
 *
 * @author socamporomani
 */
public class Tabla {
    int numero;
    public void pedir(){
        numero=Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
    }
    public void tabla(){
        int cont=0;
        pedir();
        for(cont=0; cont<10; cont++){
            System.out.println(numero+"*"+cont+"="+cont*numero);
        }
    }
}
