/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstr;

import ClasesConcretas.AccionMagaAtacando;
import ClasesConcretas.AccionMagaQuieto;
import ClasesConcretas.ArmaMago;
import ClasesConcretas.ArmaSecundariaMago;
import ClasesConcretas.ArmaduraMago;
import ClasesConcretas.CuerpoMago;
import ClasesConcretas.LeyendaMago;
import ClasesConcretas.MonturaMago;
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
public class FabricaMago extends FabricaAbstractaPJ {

    @Override
    public Arma crearArma() {
        return new ArmaMago();
    }

    @Override
    public ArmaSecundaria crearArmaSecu() {
        return new ArmaSecundariaMago();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraMago();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoMago();
    }

    @Override
    public Leyenda crearLeyenda() {
        return new LeyendaMago();   
    }

    @Override
    public Montura crearMontura() {
        return new MonturaMago();
    }

    @Override
    public Atacando crearAtacar() {
        return new AccionMagaAtacando();
    }

    @Override
    public Quieto crearQuieto() {
        return new AccionMagaQuieto();
    }

    
}
