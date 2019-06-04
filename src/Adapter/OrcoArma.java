/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class OrcoArma implements Arma{

    @Override
    public ImageIcon tipoArma() {
        ImageIcon orcoArma = new ImageIcon("src/imagenes/ArmaOrco.jpg");
        return orcoArma;
    }

    @Override
    public String descripcion() {
        return "Los orcos consideran muy valiosas sus armas y por eso las venden a un precio algo alto."
                + " Segun ellos en cada arma están sus emociones cuando las crean, así cada arma "
                + " (vista por un orco) posee un significado explícito y es única.\n"
                + "\n"
                + " Se creó una mística hacha de madera que tenía la agudeza y densidad de un diamante."
                + " En manos del orco, fué el instrumento que causó la muerte de miles de demonios,"
                + " y le permitió lograr lo impensable contra su señor.";
    }
    
}
