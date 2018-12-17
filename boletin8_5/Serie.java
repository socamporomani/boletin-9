/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_5;
import javax.swing.JOptionPane;
/**
 *
 * @author socamporomani
 */
public class Serie {
    int numero;
    public void pedir(){
       
      numero = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
    }
    public void serie1(){
        pedir();
        int contador=2;
        for(int i=0; i<numero; i++){
            System.out.print(contador + " + ");
            contador= contador+2;
            
        }
    }
    
    public void serie2(){
        pedir();
        int contador=1;
        for(int i=0; i<=numero/2; i++){
            System.out.print("-" + contador);
            contador=contador+1;
            System.out.print("+" + contador);
            contador=contador+1;
        }
    }
}
