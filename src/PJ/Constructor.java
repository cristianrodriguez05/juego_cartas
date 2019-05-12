/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;
import ClasesProducto.*;
/**
 *
 * @author estudiantes
 */
public abstract class  Constructor {
    protected Personaje personaje=new Personaje();
    protected Arma arma;
    protected ArmaSecundaria armaSecu;
    protected Armadura armadura;
    protected Montura montura;
    protected Cuerpo cuerpo;
    protected Leyenda leyenda;  
    protected Quieto quieto;
    protected Atacando atacando;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public abstract void construirPersonaje();
    public abstract void construirArma(int sel);
    public abstract void construirArmSecu(int sel);
    public abstract void construirMontu();
    public abstract void construirCuerpo();
    public abstract void construirArmadura(int sel);
    public abstract void construirLeyenda();   
    public abstract void construirAtacar();
    public abstract void construirQuieto();
}