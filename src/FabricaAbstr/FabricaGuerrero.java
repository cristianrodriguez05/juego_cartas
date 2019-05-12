/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstr;


import ClasesConcretas.AccionGuerreroAtacando;
import ClasesConcretas.AccionGuerreroQuieto;
import ClasesConcretas.ArmaGuerrero;
import ClasesConcretas.ArmaSecundariaGuerrero;
import ClasesConcretas.ArmaduraGuerrero;
import ClasesConcretas.CuerpoGuerrero;
import ClasesConcretas.LeyendaGuerrero;
import ClasesConcretas.MonturaGuerrero;
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
public class FabricaGuerrero extends FabricaAbstractaPJ {

    @Override
    public Arma crearArma() {
        return new ArmaGuerrero();
    }

    @Override
    public ArmaSecundaria crearArmaSecu() {
        return new ArmaSecundariaGuerrero();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraGuerrero();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoGuerrero();
    }

    @Override
    public Leyenda crearLeyenda() {
        return new LeyendaGuerrero();   
    }

    @Override
    public Montura crearMontura() {
        return new MonturaGuerrero();
    }

    @Override
    public Atacando crearAtacar() {
        return new AccionGuerreroAtacando();
    }

    @Override
    public Quieto crearQuieto() {
        return new AccionGuerreroQuieto();
    }

    
}
