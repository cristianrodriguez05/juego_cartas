/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;
import ClasesProducto.ArmaSecundaria;
/**
 *
 * @author estudiantes
 */
public class ArmaSecundariaArquero extends ArmaSecundaria{

    @Override
    public String mostrarArmaSecun(int seleccion) {
        switch (seleccion) {
            case 1:
                armaSecu = "SecundariaArquero1";
                break;
            case 2:
                armaSecu = "SecundariaArquero2";
                break;
            case 3:
                armaSecu = "SecundariaArquero3";
                break;
            default:
                break;
        }
        return armaSecu;

    }

    
}
