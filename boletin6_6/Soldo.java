/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;
import javax.swing.JOptionPane;
/**
 *
 * @author socamporomani
 */
public class Soldo {
    int trabajadores;
    float soldo;
    public void personal(){
    
    trabajadores=Integer.parseInt(JOptionPane.showInputDialog("¿Cúantos trabajadores tiene la empresa?"));
    LeeSoldo();
}
    public void LeeSoldo(){
     int contA =0;
     int contB=0;
//        do{


//           
//       }while(soldo<0);
for(int i=0; i<=trabajadores-1;i++){
    soldo=Float.parseFloat(JOptionPane.showInputDialog("introduce el sueldo"));
       if (soldo>=1000 && soldo<=1750){
           contA++;
       } else if(soldo<1000 && soldo !=0){
           contB++;
       }
      else 
       LeeSoldo();
}
        System.out.println(trabajadores);
JOptionPane.showMessageDialog(null, "Número Total traballadores: " + trabajadores
                + "\nNúmero de traballadoresque ganan entre 1000 e 1750 €: " + contA
                + "\nPorcentaje de traballadores que ganan menos de 1000 €: " + ((contB * 100) / trabajadores) + "%");
    }
    
}