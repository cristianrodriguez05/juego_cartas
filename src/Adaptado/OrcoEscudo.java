/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptado;

import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class OrcoEscudo implements Escudo {

    @Override
    public ImageIcon tipoEscudo() {
        ImageIcon orcoEscudo = new ImageIcon("src/imagenes/EscudoOrco.jpg");
        return orcoEscudo;
    }

    @Override
    public String descripcion() {
        return "Cualquier objeto que permite oponer al adversario una superficie detrás de la cual "
                + "se encuentra protección, puede ser llamada escudo con toda propiedad, y a veces "
                + "era de «fortuna», asegurando un protección mínima con un coste mínimo. Así, las "
                + "milicias helvecias disponían en los primeros tiempos de simples hatillos de paja.\n"
                + "\n"
                + "La madera prevaleció, como armazón, durante toda la Historia para su confección."
                + " Podía ser fabricado de diferentes maneras según la clase de protección del combatiente,"
                + " de un simple trenzado de mimbre, ligero y resistente a la perforación como en la pelta tracia";
    }

}
