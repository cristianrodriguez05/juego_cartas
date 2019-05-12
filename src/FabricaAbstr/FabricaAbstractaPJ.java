/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstr;

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
public abstract class  FabricaAbstractaPJ {
    
    public abstract Arma crearArma();
    public abstract ArmaSecundaria crearArmaSecu();
    public abstract Armadura crearArmadura();
    public abstract Cuerpo crearCuerpo();
    public abstract Leyenda crearLeyenda();
    public abstract Montura crearMontura();   
    public abstract Atacando crearAtacar();
    public abstract Quieto crearQuieto();
    
    
}