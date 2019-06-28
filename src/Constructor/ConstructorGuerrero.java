/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import ClasesConcretas.ArmaGuerrero;
import ClasesConcretas.ArmaSecundariaGuerrero;
import ClasesConcretas.ArmaduraGuerrero;
import ClasesConcretas.CuerpoGuerrero;
import ClasesConcretas.LeyendaGuerrero;

/**
 *
 * @author estudiantes
 */
public class ConstructorGuerrero extends Constructor{

    @Override
    public void construirPersonaje() {
        arma = new ArmaGuerrero();
        armaSecu = new ArmaSecundariaGuerrero();
        armadura = new ArmaduraGuerrero();
        cuerpo = new CuerpoGuerrero();
        leyenda = new LeyendaGuerrero();
    }

    @Override
    public void construirArma(int sel) {
        personaje.setArma(arma.mostrarArma(sel));
    }

    @Override
    public void construirArmSecu(int sel) {
        personaje.setArmaSecu(armaSecu.mostrarArmaSecun(sel));
    }

    @Override
    public void construirCuerpo() {
        personaje.setCuerpo(cuerpo.mostrarCuerpo());
    }

    @Override
    public void construirArmadura(int sel) {
        personaje.setArmadura(armadura.mostrarArmadura(sel));
    }

    @Override
    public void construirLeyenda() {
       // System.out.println("ok");
         personaje.setLeyenda(leyenda.mostrarLeyenda());
    }

}
