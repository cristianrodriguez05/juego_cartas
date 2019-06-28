/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;
import ClasesConcretas.ArmaArquero;
import ClasesConcretas.ArmaSecundariaArquero;
import ClasesConcretas.ArmaduraArquero;
import ClasesConcretas.CuerpoArquero;
import ClasesConcretas.LeyendaArquero;
/**
 *
 * @author estudiantes
 */
public class ConstructorArquero extends Constructor{

    @Override
    public void construirPersonaje() {
        arma=new ArmaArquero();
        armaSecu=new ArmaSecundariaArquero();
        armadura=new ArmaduraArquero();
        cuerpo=new CuerpoArquero();
        leyenda= new LeyendaArquero();
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
