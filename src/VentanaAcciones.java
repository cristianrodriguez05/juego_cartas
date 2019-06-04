
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
import Constructor.Director;
import Constructor.Personaje;
import Decorator.Fuego;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class VentanaAcciones extends JFrame implements ActionListener {

    JButton accion = new JButton();
    JLabel estado = new JLabel();
    JLabel poderSobrePJ = new JLabel();
    JButton inicio = new JButton();
    JButton poder = new JButton();
    public Director director = new Director();
    public Personaje personaje = new Personaje();
    int i, ii;
    Timer tiempo, tiempo2;

    public void mostrar() {
        setSize(200, 200);
        setVisible(true);

    }

    public VentanaAcciones() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        Container c = getContentPane();
        setTitle("Catálogo de clases");
        c.setLayout(null);
        c.add(poder);
        c.add(accion);
        c.add(poderSobrePJ);
        c.add(estado);
        c.add(inicio);
        accion.setEnabled(false);
        poder.setEnabled(false);
        accion.addActionListener(this);
        inicio.addActionListener(this);
        poder.addActionListener(this);
        accion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/botonAtaque.png")));
        inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iniciodeanimacion.png")));
        poder.setIcon(new ImageIcon(getClass().getResource("/Imagenes/botonPoder.png")));
        inicio.setBorder(null);
        accion.setBounds(10, 120, 70, 40);
        inicio.setBounds(40, 10, 100, 100);
        poderSobrePJ.setBounds(40, 10, 100, 100);
        estado.setBounds(40, 10, 100, 100);
        poder.setBounds(120, 120, 70, 40);

    }

    public void actualizarImagenes() {
        personaje = director.getPersonaje();
        personaje.getAccionAtacando();

        ActionListener oye = new ActionListener() {
            public void actionPerformed(ActionEvent ej) {

                switch (i) {
                    case 1:
                        accion.setEnabled(false);
                        estado.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionAtacando() + i + ".png")));
                        System.out.println("/Imagenes/" + personaje.getAccionAtacando() + i + ".png");
                        break;
                    case 2:

                        estado.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionAtacando() + i + ".png")));
                        System.out.println("/Imagenes/" + personaje.getAccionAtacando() + i + ".png");
                        break;

                    case 3:

                        estado.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionAtacando() + i + ".png")));
                        System.out.println("/Imagenes/" + personaje.getAccionAtacando() + i + ".png");

                        break;
                    case 4:

                        personaje.getAccionQuieto();
                        estado.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionQuieto() + ".png")));
                        tiempo.stop();
                        i = 0;
                        accion.setEnabled(true);
                        break;

                }
                i++;
            }
        };

        tiempo = new Timer(200, oye);

        tiempo.start();

    }

    public void actualizarImagenesConst() {
        personaje = director.getPersonaje();
        personaje= new Fuego(personaje);
        personaje.getAccionAtacando();

        ActionListener oye = new ActionListener() {
            public void actionPerformed(ActionEvent ej) {
                switch (ii) {
                    case 1:

                        poderSobrePJ.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionPoder() + ii + ".png")));

                        break;
                    case 2:
                        poderSobrePJ.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionPoder() + ii + ".png")));
                        break;

                    case 3:

                        poderSobrePJ.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionPoder() + ii + ".png")));
                        break;
                        
                    case 4:
                        poderSobrePJ.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionPoder() + ii + ".png")));
                        ii = 0;
                        break;

                }
                ii++;
            }
        };

        tiempo2 = new Timer(200, oye);

        tiempo2.start();

    }

    public void quieto() {
        personaje.getAccionQuieto();
        estado.setIcon(new ImageIcon(getClass().getResource("/Sprite/" + personaje.getAccionQuieto() + ".png")));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(accion)) {
            director.añadirAccionatacando();
            director.añadirAccionQuieto();
            actualizarImagenes();

        }
        if (e.getSource().equals(inicio)) {
            director.añadirAccionQuieto();
            quieto();
            accion.setEnabled(true);
            poder.setEnabled(true);
            inicio.setVisible(false);
        }
        if (e.getSource().equals(poder)) {
            actualizarImagenesConst();
        }

    }

}

