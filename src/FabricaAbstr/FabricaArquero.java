/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstr;


import ClasesConcretas.AccionArqueroAtacando;
import ClasesConcretas.AccionArqueroQuieto;
import ClasesConcretas.ArmaArquero;
import ClasesConcretas.ArmaSecundariaArquero;
import ClasesConcretas.ArmaduraArquero;
import ClasesConcretas.CuerpoArquero;
import ClasesConcretas.LeyendaArquero;
import ClasesConcretas.MonturaArquero;
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
public class FabricaArquero extends FabricaAbstractaPJ {

    @Override
    public Arma crearArma() {
        return new ArmaArquero();
    }

    @Override
    public ArmaSecundaria crearArmaSecu() {
        return new ArmaSecundariaArquero();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraArquero();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoArquero();
    }

    @Override
    public Leyenda crearLeyenda() {
        return new LeyendaArquero();   
    }

    @Override
    public Montura crearMontura() {
        return new MonturaArquero();
    }

    @Override
    public Atacando crearAtacar() {
        return new AccionArqueroAtacando();
    }

    @Override
    public Quieto crearQuieto() {
        return new AccionArqueroQuieto();
    }

    
}
