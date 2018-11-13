/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

/**
 *
 * @author socamporomani
 */
public class calculo {
    int cont;
    int sumatorio=0;
    double multiplica=1;
    public void calcular(){
        for(cont=10; cont<91; cont++){
            sumatorio=cont+sumatorio;
            System.out.println(sumatorio);
            multiplica=cont*multiplica;
            System.out.println(multiplica);
            
        }
    }
}
