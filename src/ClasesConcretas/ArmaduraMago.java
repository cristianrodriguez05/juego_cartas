/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;
import ClasesProducto.Armadura;
/**
 *
 * @author estudiantes
 */
public class ArmaduraMago extends Armadura{

    @Override
    public String mostrarArmadura(int seleccion) {
        switch (seleccion) {
            case 1:
                armadura = "ArmaduraMaga1";
                break;
            case 2:
                armadura = "ArmaduraMaga2";
                break;
            case 3:
                armadura = "ArmaduraMaga3";
                break;
            default:
                break;
        }
        return armadura;

    }
    
}
