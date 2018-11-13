/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;
import javax.swing.JOptionPane;
/**
 *
 * @author socamporomani
 */
public class Area {
    float base=0;
    float altura;
    public void pedir(){
        do{
        base=Float.parseFloat(JOptionPane.showInputDialog("base"));
        }while(base<=0);
        do{
        altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));
        }while(altura<=0);
        
    }
    public void calculo(){
        float areaTotal;
        pedir();
        areaTotal=base*altura;
        System.out.println(areaTotal);
    }

    
}


