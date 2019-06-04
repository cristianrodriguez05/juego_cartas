/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;



/**
 *
 * @author estudiantes
 */
public class Orco implements PersonajeFactory{

    @Override
    public Arma getArma() {
        return new OrcoArma();
    }

    @Override
    public Caballeria getCaballeria() {
        return new OrcoCaballeria();
    }

    @Override
    public Escudo getEscudo() {
        return new OrcoEscudo();
    }

    @Override
    public String imagen(int id) {
        return "src/Sprites/OrcoAtaque"+(id+1)+".PNG";
    }
    
}
