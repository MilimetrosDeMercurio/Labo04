/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novos;
import java.util.ArrayList;
/**
 *
 * @author María Lourdes
 */
public class Nave {
    public Obstaculo obstaculo;
    public ArrayList <Puntaje> puntaje;
    public ArrayList <Planeta> planeta;
    
    //Devuelve el sentido en el que se mueve la nave
    public int IdentificarDireccion(int numero){
    return numero;
    }
    //Ejecuta la acción de disparar para destruir un objeto
    public void Disparar(){}
    
//Identifica las coordenadas de los planetas y los acumula en el puntaje
    public void AdquirirPlanetas(){}
    //Muestra la nave el pantalla
    public void mostrarNave(){}
    
}
