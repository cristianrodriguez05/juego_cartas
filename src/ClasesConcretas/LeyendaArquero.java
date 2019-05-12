/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesProducto.Leyenda;

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class LeyendaArquero extends Leyenda {

    @Override
    public String mostrarLeyenda() {
        System.out.println("ok");
        return "El arquero tiene su precisión similar a la de un águila lo que le permite ser "
                + "capaz de ver a su objetivo a una gran distancia, infringiendo un "
                + "gran daño gracias a su velocidad de lanzamiento,"
                + "su único problema son los ataques de cuerpo a cuerpo y los mágicos.";

    }

}
