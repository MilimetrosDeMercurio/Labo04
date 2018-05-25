/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;

/**
 *
 * @author Margarita
 */
public abstract class DecimalBinario implements Convertor {
    
    public String convertir(Integer e) {
        String binario="";
        while (e>=1){
            binario+=e%2;
            e=e/2;
        }
        binario+=e;
        binario = new StringBuilder(binario).reverse().toString();
        return binario;
}

   
    
    
}
