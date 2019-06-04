/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class OrcoCaballeria implements Caballeria{

    @Override
    public ImageIcon tipoCaballeria() {
        ImageIcon orcoCaballeria=new ImageIcon("src/imagenes/CaballeriaOrco.jpg");
        return orcoCaballeria;
    }

    @Override
    public String descripcion() {
        return "En lo más alto de las laderas de las Montañas de los Lamentos viven los Dientes Martirio,"
                + " unas bestias cavernarias que siempre han atraído la atención de los Ogros."
                + " Las manadas de estos agresivos depredadores están lideradas por el ejemplar más grande del grupo.";
    }
    
}
