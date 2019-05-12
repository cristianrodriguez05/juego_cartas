/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;

/**
 *
 * @author acer1
 */
public class Director {

    private Constructor constructor;

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public Personaje getPersonaje() {
        return constructor.getPersonaje();
    }

    public void construirPersonaje() {
        constructor.construirPersonaje();
        constructor.construirCuerpo();
    }

    public void añadirArma(int sel) {
        constructor.construirArma(sel);
    }

    public void añadirArmaSecu(int sel) {
        constructor.construirArmSecu(sel);
    }

    public void añadirArmadura(int sel) {
        constructor.construirArmadura(sel);
    }

    public void añadirMontura() {
        constructor.construirMontu();
    }

    public void añadirLeyenda() {
        constructor.construirLeyenda();
    }

    public void añadirAccionQuieto() {
        constructor.construirQuieto();

    }

    public void añadirAccionatacando() {
        constructor.construirAtacar();
    }
}
