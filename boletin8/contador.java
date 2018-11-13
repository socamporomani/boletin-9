/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8;

/**
 *
 * @author socamporomani
 */
public class contador {
    int cont;
    int contNegativo=0;
    int cont0;
    int contPositivo=0;

  
    public void numeros(){
        for(cont=-5; cont<5; cont++){
            if(cont==0){
                cont0++;
            }
            else if(cont<0){
                contNegativo++;
            }
            else
                contPositivo++;
        }
        System.out.println("0="+cont0);
        System.out.println("-="+contNegativo);
        System.out.println("+="+contPositivo);
    }
    
//    public void contar0(){
//        if ()
//    }
}
