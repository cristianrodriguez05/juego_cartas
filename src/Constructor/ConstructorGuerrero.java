/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import ClasesConcretas.AccionGuerreroAtacando;
import ClasesConcretas.AccionGuerreroQuieto;
import ClasesConcretas.ArmaGuerrero;
import ClasesConcretas.ArmaSecundariaGuerrero;
import ClasesConcretas.ArmaduraGuerrero;
import ClasesConcretas.CuerpoGuerrero;
import ClasesConcretas.LeyendaGuerrero;
import ClasesConcretas.MonturaGuerrero;
import FabricaAbstr.*;

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
        montura = new MonturaGuerrero();
        cuerpo = new CuerpoGuerrero();
        leyenda = new LeyendaGuerrero();
        quieto = new AccionGuerreroQuieto();
        atacando=new AccionGuerreroAtacando();
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
    public void construirMontu() {
        personaje.setMontura(montura.mostrarMontura());
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

    @Override
    public void construirQuieto() {
        personaje.setAccionQuieto(quieto.quieto());
    }

    @Override
    public void construirAtacar() {
        personaje.setAccionAtacando(atacando.atacar());
    }

}
