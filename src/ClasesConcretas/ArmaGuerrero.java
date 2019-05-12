/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;
import ClasesProducto.Arma;
/**
 *
 * @author estudiantes
 */
public class ArmaGuerrero extends Arma{

    @Override
    public String mostrarArma(int seleccion) {
        switch (seleccion) {
            case 1:
                arma = "PrimariaGuerrero1";
                break;
            case 2:
                arma = "PrimariaGuerrero2";
                break;
            case 3:
                arma = "PrimariaGuerrero3";
                break;
            default:
                break;
        }
        return arma;

    }

    
}
