/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstr;

import ClasesConcretas.AccionLadronAtacando;
import ClasesConcretas.AccionLadronQuieto;
import ClasesConcretas.ArmaLadron;
import ClasesConcretas.ArmaSecundariaLadron;
import ClasesConcretas.ArmaduraLadron;
import ClasesConcretas.CuerpoLadron;
import ClasesConcretas.LeyendaLadron;
import ClasesConcretas.MonturaLadron;
import ClasesProducto.Arma;
import ClasesProducto.ArmaSecundaria;
import ClasesProducto.Armadura;
import ClasesProducto.Atacando;
import ClasesProducto.Cuerpo;
import ClasesProducto.Leyenda;
import ClasesProducto.Montura;
import ClasesProducto.Quieto;

/**
 *
 * @author estudiantes
 */
public class FabricaLadron extends FabricaAbstractaPJ {

    @Override
    public Arma crearArma() {
        return new ArmaLadron();
    }

    @Override
    public ArmaSecundaria crearArmaSecu() {
        return new ArmaSecundariaLadron();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraLadron();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoLadron();
    }

    @Override
    public Leyenda crearLeyenda() {
        return new LeyendaLadron();   
    }

    @Override
    public Montura crearMontura() {
        return new MonturaLadron();
    }

    @Override
    public Atacando crearAtacar() {
        return new AccionLadronAtacando();
    }

    @Override
    public Quieto crearQuieto() {
        return new AccionLadronQuieto();
    }

    
}
