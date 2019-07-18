
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
//import PJ.Cliente;
//import PJ.Personaje;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Constructor.*;
import Cartas.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class VentanaSlectMazo extends JFrame implements ActionListener {

    JButton jugar = new JButton("jugar");
    Tablero tab = new Tablero();
    Personaje personaje1 = new Personaje();
    Personaje personaje2 = new Personaje();
    AgregaMazoBatl buscarMazo = new AgregaMazoBatl();
    SeleccionMazoPj selecCarta = new SeleccionMazoPj();

    ArrayList<JButton> cartas = new ArrayList();
    ArrayList<JButton> cartas2 = new ArrayList();
    ArrayList<JTextField> nombreCard = new ArrayList();
    JPanel jp = new JPanel();

    JTextArea claseCard = new JTextArea();
    JTextArea tipoCard = new JTextArea();
    JScrollPane jScrollPane = new JScrollPane(jp);

    JButton prueba = new JButton();

    public void mostrar() {
        crearCarta();
        setSize(1480, 700);
        setVisible(true);

    }
    String carta;

    public void crearCarta() {

        for (int k = 0; k < 60; k++) {
            JButton card = new JButton("carta " + k);
            cartas.add(card);
            jp.add(card);

        }
        for (int k = 0; k < 60; k++) {
            JButton card = new JButton("carta " + k);
            cartas2.add(card);
            jp.add(card);

        }
        buscarMazo.buscar(personaje1.getCuerpo());

        for (int j = 0; j < 30; j++) {
            cartas.get(j).setIcon(new ImageIcon(getClass().getResource("/ImgCartas/" + buscarMazo.selectCarta.get(j) + ".png")));
            cartas.get(j).setBounds(0, j * 300, 250, 300);
            cartas.get(j).addActionListener(this);

        }
        for (int k = 30; k < 60; k++) {
            cartas.get(k).setBounds(250, (k - 30) * 300, 250, 300);
            cartas.get(k).addActionListener(this);
            cartas.get(k).setIcon(new ImageIcon(getClass().getResource("/ImgCartas/" + buscarMazo.selectCarta.get(k) + ".png")));
        }
        buscarMazo.buscar(personaje2.getCuerpo());
        for (int k = 0; k < 30; k++) {
            cartas2.get(k).setBounds(500, (k ) * 300, 250, 300);
            cartas2.get(k).addActionListener(this);
            cartas2.get(k).setIcon(new ImageIcon(getClass().getResource("/ImgCartas/" + buscarMazo.selectCarta.get(k) + ".png")));
        }

        for (int k = 30; k < 60; k++) {
            cartas2.get(k).setBounds(750, (k-30 ) * 300, 250, 300);
            cartas2.get(k).addActionListener(this);
            cartas2.get(k).setIcon(new ImageIcon(getClass().getResource("/ImgCartas/" + buscarMazo.selectCarta.get(k) + ".png")));
        }

    }

    public VentanaSlectMazo() {

        jp.setPreferredSize(new Dimension(600, 9000));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        Container c = getContentPane();
        setTitle("Selección mazo");
        c.setLayout(null);
        jp.setLayout(null);
        jScrollPane.setBounds(10, 10, 1050, 650);
        c.add(jugar);
        jugar.setBounds(1220, 620, 100, 30);
        jugar.addActionListener(this);
        c.add(jScrollPane);
        for (int k = 0; k < 60; k++) {
            JTextField nombreCard = new JTextField();
            this.nombreCard.add(nombreCard);
            c.add(nombreCard);
        }
        for (int j = 0; j < 30; j++) {
            this.nombreCard.get(j).setBounds(1070, 5 + j * 20, 200, 20);
            this.nombreCard.get(j).setBackground(Color.WHITE);
        }
        for (int j = 30; j < 60; j++) {
            this.nombreCard.get(j).setBounds(1270, 5 + (j - 30) * 20, 200, 20);
            this.nombreCard.get(j).setBackground(Color.WHITE);
        }

        jp.setBackground(Color.black);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 60; i++) {

            if (e.getSource().equals(cartas.get(i))) {
                selecCarta.buscarCarta(personaje1.getCuerpo(), i);
            }

        }
        for (int j = 0; j < 60; j++) {
            if (e.getSource().equals(cartas2.get(j ))) {
                selecCarta.buscarCarta(personaje2.getCuerpo(), j);
            }
        }
        if (e.getSource().equals(jugar)) {
            if (tab != null) {
                tab.dispose();
            }

            tab = new Tablero();
            tab.setVisible(true);

//            
//            tab.personaje = this.personaje;
            tab.mostrar();
            this.dispose();
        }

    }

}
