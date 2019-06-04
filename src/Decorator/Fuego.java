/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;
import Constructor.*;
/**
 *
 * @author acer1
 */

public class Fuego extends Decorador_personaje {
    
    private Personaje personaje;
    
    public Fuego(Personaje pj){
        this.personaje=pj;
                
    }

    @Override
    public String getAccionPoder() {
        return personaje.getAccionPoder() + "Fuego";
    }
}