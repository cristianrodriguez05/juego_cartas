/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;
import Adaptado.Orco;
import ClasesConcretas.AccionOrcoAtacando;
import ClasesConcretas.AccionOrcoQuieto;
import ClasesConcretas.CuerpoOrco;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author estudiantes
 */
public class AdaptadorConstructorOrco extends Constructor{
    
    Orco  orco = new Orco();
    
    
    @Override
    public void construirPersonaje() {
        cuerpo=new CuerpoOrco();
        quieto = new AccionOrcoQuieto();
        atacando=new AccionOrcoAtacando();
    }

    @Override
    public void construirArma(int sel) {
        ImageIcon armaorco=orco.getArma().tipoArma();
        String orcoarma = armaorco.getDescription();
        String[] partes = orcoarma.split("/");
        String string = partes[2];
        string = string.substring(0, string.length() - 4);
        personaje.setArma(string);
    }

    @Override
    public void construirArmSecu(int sel) {
        ImageIcon armasecuorco=orco.getEscudo().tipoEscudo();
        String orcoarmasecu = armasecuorco.getDescription();
        String[] partes = orcoarmasecu.split("/");
        String string = partes[2];
        string = string.substring(0, string.length() - 4);
        personaje.setArmaSecu(string);
    }

    @Override
    public void construirMontu() {
        ImageIcon monturaorco=orco.getCaballeria().tipoCaballeria();
        String orcomontura = monturaorco.getDescription();
        String[] partes = orcomontura.split("/");
        String string = partes[2];
        string = string.substring(0, string.length() - 4);
        personaje.setMontura(string);
    }

    @Override
    public void construirCuerpo() {
        personaje.setCuerpo(cuerpo.mostrarCuerpo());
    }

    @Override
    public void construirArmadura(int sel) {
    }

    @Override
    public void construirLeyenda() {
       // System.out.println("ok");
         personaje.setLeyenda(orco.getCaballeria().descripcion());
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
