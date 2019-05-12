/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;

import ClasesConcretas.AccionMagaAtacando;
import ClasesConcretas.AccionMagaQuieto;
import ClasesConcretas.ArmaMago;
import ClasesConcretas.ArmaSecundariaMago;
import ClasesConcretas.ArmaduraMago;
import ClasesConcretas.CuerpoMago;
import ClasesConcretas.LeyendaMago;
import ClasesConcretas.MonturaMago;

/**
 *
 * @author estudiantes
 */
public class ConstructorMago extends Constructor{

    @Override
    public void construirPersonaje() {
        arma = new ArmaMago();
        armaSecu = new ArmaSecundariaMago();
        armadura = new ArmaduraMago();
        montura = new MonturaMago();
        cuerpo = new CuerpoMago();
        leyenda = new LeyendaMago();
        quieto = new AccionMagaQuieto();
        atacando=new AccionMagaAtacando();
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
