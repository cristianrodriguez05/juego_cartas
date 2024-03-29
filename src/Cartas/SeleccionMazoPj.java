package Cartas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SeleccionMazoPj                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              {

    Carta carta = new Carta();

    public void buscarCarta(String nombre, int ref) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(nombre + ".txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int num = ref;
            while ((linea = br.readLine()) != null) {
                String[] index = linea.split("[\\(\\)]");
                if (ref == Integer.parseInt(index[1])) {
                    System.out.println(index[1]);
                    break;
                }
            }

            String[] partes = linea.split("\\.");
            this.carta.imagen = partes[0];
            this.carta.nombre = partes[1];
            this.carta.clase = partes[2];
            this.carta.tipo = partes[3];
            this.carta.ataque = partes[4];
            this.carta.ataquemagico =partes[5];
            this.carta.defensa = partes[6];
            this.carta.defensamagica =partes[7];
            this.carta.vida = partes[8];
            this.carta.buff = Boolean.parseBoolean(partes[9]);
            this.carta.debuff = Boolean.parseBoolean(partes[10]);
            this.carta.estado = partes[11];
            this.carta.efectTurnos = Integer.parseInt(partes[12]);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {

            }
        }
    }

    public Carta getCarta() {
        return carta;
    }
}
