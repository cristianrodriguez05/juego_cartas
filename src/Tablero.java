
import Cartas.PoolCartas;
import Constructor.Personaje;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

//import PJ.Cliente;
//import PJ.Personaje;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Tablero extends JFrame {

    Personaje personaje1 = new Personaje();
    Personaje personaje2 = new Personaje();
    PoolCartas mazo;
/////////////////////////////////// cartas 
    JLabel cartafon = new JLabel();
    JButton card1 = new JButton("1");
    JButton card2 = new JButton("2");
    JButton card3 = new JButton("3");
    JButton card4 = new JButton("4");
    JButton card5 = new JButton("5");

////enemigo 1
    JLabel armaduraenemigo1 = new JLabel();
    JLabel arma1enemigo1 = new JLabel();
    JLabel arma2enemigo1 = new JLabel();
    JLabel cuerpoenemigo1 = new JLabel();
    JLabel NomEnemigo1 = new JLabel("nomEne1");
    JLabel atkEnemi1 = new JLabel("ATK");
    JLabel defEnemi1 = new JLabel("def");
    JLabel atkMagEnemi1 = new JLabel("atkmag");
    JLabel defMagEnemi1 = new JLabel("defmag");
    JLabel vidaEnemi1 = new JLabel("vida");
    JLabel estadoEnemi1 = new JLabel("estado");
////enemigo 2
    JLabel cuerpoenemigo2 = new JLabel();
    JLabel armaduraenemigo2 = new JLabel();
    JLabel arma1enemigo2 = new JLabel();
    JLabel arma2enemigo2 = new JLabel();
    JLabel NomEnemigo2 = new JLabel("nomEne1");
    JLabel atkEnemi2 = new JLabel("ATK");
    JLabel defEnemi2 = new JLabel("def");
    JLabel atkMagEnemi2 = new JLabel("atkmag");
    JLabel defMagEnemi2 = new JLabel("defmag");
    JLabel vidaEnemi2 = new JLabel("vida");
    JLabel estadoEnemi2 = new JLabel("estado");
    ///////pj1
    JLabel cuerpopj1 = new JLabel();
    JLabel armadurapj1 = new JLabel();
    JLabel arma1pj1 = new JLabel();
    JLabel arma2pj1 = new JLabel();
    JLabel Nompj1 = new JLabel("nompj1");
    JLabel atkpj1 = new JLabel("ATK");
    JLabel defpj1 = new JLabel("def");
    JLabel atkMagpj1 = new JLabel("atkmag");
    JLabel defMagpf1 = new JLabel("defmag");
    JLabel vidapj1 = new JLabel("vida");
    JLabel estadopj1 = new JLabel("estado");
    /////////////////////// pj2 
    JLabel cuerpopj2 = new JLabel();
    JLabel armadurapj2 = new JLabel();
    JLabel arma1pj2 = new JLabel();
    JLabel arma2pj2 = new JLabel();
    JLabel Nompj2 = new JLabel("nompj1");
    JLabel atkpj2 = new JLabel("ATK");
    JLabel defpj2 = new JLabel("def");
    JLabel atkMagpj2 = new JLabel("atkmag");
    JLabel defMagpf2 = new JLabel("defmag");
    JLabel vidapj2 = new JLabel("vida");
    JLabel estadopj2 = new JLabel("estado");
    ///////////////////// montura
    JLabel cuerpoMon = new JLabel();
    JLabel NomMontura = new JLabel("nompj1");
    JLabel atkmont = new JLabel("ATK");
    JLabel defmot = new JLabel("def");
    JLabel atkMagmont = new JLabel("atkmag");
    JLabel defMagmont = new JLabel("defmag");
    JLabel vidamontu = new JLabel("vida");
    JLabel estadomontu = new JLabel("estado");

    public Tablero() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Container c = getContentPane();
        ///////////////////////////////enemigo1
        c.add(NomEnemigo1);
        NomEnemigo1.setBounds(10, 10, 170, 20);
        NomEnemigo1.setBackground(Color.red);
        NomEnemigo1.setOpaque(true);

        c.add(atkEnemi1);
        atkEnemi1.setBounds(10, 30, 170, 20);
        atkEnemi1.setBackground(Color.red);
        atkEnemi1.setOpaque(true);

        c.add(atkMagEnemi1);
        atkMagEnemi1.setBounds(10, 50, 170, 20);
        atkMagEnemi1.setBackground(Color.red);
        atkMagEnemi1.setOpaque(true);

        c.add(defEnemi1);
        defEnemi1.setBounds(10, 70, 170, 20);
        defEnemi1.setBackground(Color.red);
        defEnemi1.setOpaque(true);

        c.add(defMagEnemi1);
        defMagEnemi1.setBounds(10, 90, 170, 20);
        defMagEnemi1.setBackground(Color.red);
        defMagEnemi1.setOpaque(true);

        c.add(vidaEnemi1);
        vidaEnemi1.setBounds(10, 110, 170, 20);
        vidaEnemi1.setBackground(Color.red);
        vidaEnemi1.setOpaque(true);

        c.add(estadoEnemi1);
        estadoEnemi1.setBounds(10, 130, 170, 20);
        estadoEnemi1.setBackground(Color.red);
        estadoEnemi1.setOpaque(true);

        c.add(armaduraenemigo1);
        armaduraenemigo1.setBounds(300, 10, 70, 100);
        armaduraenemigo1.setBackground(Color.black);
        armaduraenemigo1.setOpaque(true);

        c.add(arma1enemigo1);
        arma1enemigo1.setBounds(250, 110, 70, 100);
        arma1enemigo1.setBackground(Color.black);
        arma1enemigo1.setOpaque(true);

        c.add(arma2enemigo1);
        arma2enemigo1.setBounds(350, 110, 70, 100);
        arma2enemigo1.setBackground(Color.black);
        arma2enemigo1.setOpaque(true);

        c.add(cuerpoenemigo1);
        cuerpoenemigo1.setBounds(500, 10, 140, 200);
        cuerpoenemigo1.setBackground(Color.black);
        cuerpoenemigo1.setOpaque(true);
        //////////////////////////////////////segundo enemigo
        c.add(NomEnemigo2);
        NomEnemigo2.setBounds(1200, 10, 170, 20);
        NomEnemigo2.setBackground(Color.red);
        NomEnemigo2.setOpaque(true);

        c.add(atkEnemi2);
        atkEnemi2.setBounds(1200, 30, 170, 20);
        atkEnemi2.setBackground(Color.red);
        atkEnemi2.setOpaque(true);

        c.add(atkMagEnemi2);
        atkMagEnemi2.setBounds(1200, 50, 170, 20);
        atkMagEnemi2.setBackground(Color.red);
        atkMagEnemi2.setOpaque(true);

        c.add(defEnemi2);
        defEnemi2.setBounds(1200, 70, 170, 20);
        defEnemi2.setBackground(Color.red);
        defEnemi2.setOpaque(true);

        c.add(defMagEnemi2);
        defMagEnemi2.setBounds(1200, 90, 170, 20);
        defMagEnemi2.setBackground(Color.red);
        defMagEnemi2.setOpaque(true);

        c.add(vidaEnemi2);
        vidaEnemi2.setBounds(1200, 110, 170, 20);
        vidaEnemi2.setBackground(Color.red);
        vidaEnemi2.setOpaque(true);

        c.add(estadoEnemi2);
        estadoEnemi2.setBounds(1200, 130, 170, 20);
        estadoEnemi2.setBackground(Color.red);
        estadoEnemi2.setOpaque(true);

        c.add(armaduraenemigo2);
        armaduraenemigo2.setBounds(1000, 10, 70, 100);
        armaduraenemigo2.setBackground(Color.black);
        armaduraenemigo2.setOpaque(true);

        c.add(arma1enemigo2);
        arma1enemigo2.setBounds(950, 110, 70, 100);
        arma1enemigo2.setBackground(Color.black);
        arma1enemigo2.setOpaque(true);

        c.add(arma2enemigo2);
        arma2enemigo2.setBounds(1050, 110, 70, 100);
        arma2enemigo2.setBackground(Color.black);
        arma2enemigo2.setOpaque(true);

        c.add(cuerpoenemigo2);
        cuerpoenemigo2.setBounds(720, 10, 140, 200);
        cuerpoenemigo2.setBackground(Color.black);
        cuerpoenemigo2.setOpaque(true);
        /////////////////////////cartas
        c.add(cartafon);
        cartafon.setBounds(10, 480, 167, 200);
        cartafon.setBackground(Color.blue);
        cartafon.setOpaque(true);

        c.add(card1);
        card1.setBounds(180, 480, 167, 200);

        c.add(card2);
        card2.setBounds(350, 480, 167, 200);

        c.add(card3);
        card3.setBounds(520, 480, 167, 200);

        c.add(card4);
        card4.setBounds(690, 480, 167, 200);

        c.add(card5);
        card5.setBounds(860, 480, 167, 200);

        ///////////////////////////////personaje 1
        c.add(Nompj1);
        Nompj1.setBounds(10, 290, 170, 20);
        Nompj1.setBackground(Color.red);
        Nompj1.setOpaque(true);

        c.add(atkpj1);
        atkpj1.setBounds(10, 310, 170, 20);
        atkpj1.setBackground(Color.red);
        atkpj1.setOpaque(true);

        c.add(atkMagpj1);
        atkMagpj1.setBounds(10, 330, 170, 20);
        atkMagpj1.setBackground(Color.red);
        atkMagpj1.setOpaque(true);

        c.add(defpj1);
        defpj1.setBounds(10, 350, 170, 20);
        defpj1.setBackground(Color.red);
        defpj1.setOpaque(true);

        c.add(defMagpf1);
        defMagpf1.setBounds(10, 370, 170, 20);
        defMagpf1.setBackground(Color.red);
        defMagpf1.setOpaque(true);

        c.add(vidapj1);
        vidapj1.setBounds(10, 390, 170, 20);
        vidapj1.setBackground(Color.red);
        vidapj1.setOpaque(true);

        c.add(estadopj1);
        estadopj1.setBounds(10, 410, 170, 20);
        estadopj1.setBackground(Color.red);
        estadopj1.setOpaque(true);

        c.add(armadurapj1);
        armadurapj1.setBounds(250, 350, 70, 100);
        armadurapj1.setBackground(Color.black);
        armadurapj1.setOpaque(true);

        c.add(arma1pj1);
        arma1pj1.setBounds(200, 250, 70, 100);
        arma1pj1.setBackground(Color.black);
        arma1pj1.setOpaque(true);

        c.add(arma2pj1);
        arma2pj1.setBounds(300, 250, 70, 100);
        arma2pj1.setBackground(Color.black);
        arma2pj1.setOpaque(true);

        c.add(cuerpopj1);
        cuerpopj1.setBounds(400, 250, 140, 200);
        cuerpopj1.setBackground(Color.black);
        cuerpopj1.setOpaque(true);

        /////////////////////// pj2
        c.add(Nompj2);
        Nompj2.setBounds(1200, 290, 170, 20);
        Nompj2.setBackground(Color.green);
        Nompj2.setOpaque(true);

        c.add(atkpj2);
        atkpj2.setBounds(1200, 310, 170, 20);
        atkpj2.setBackground(Color.green);
        atkpj2.setOpaque(true);

        c.add(atkMagpj2);
        atkMagpj2.setBounds(1200, 330, 170, 20);
        atkMagpj2.setBackground(Color.green);
        atkMagpj2.setOpaque(true);

        c.add(defpj2);
        defpj2.setBounds(1200, 350, 170, 20);
        defpj2.setBackground(Color.green);
        defpj2.setOpaque(true);

        c.add(defMagpf2);
        defMagpf2.setBounds(1200, 370, 170, 20);
        defMagpf2.setBackground(Color.green);
        defMagpf2.setOpaque(true);

        c.add(vidapj2);
        vidapj2.setBounds(1200, 390, 170, 20);
        vidapj2.setBackground(Color.green);
        vidapj2.setOpaque(true);

        c.add(estadopj2);
        estadopj2.setBounds(1200, 410, 170, 20);
        estadopj2.setBackground(Color.green);
        estadopj2.setOpaque(true);

        c.add(armadurapj2);
        armadurapj2.setBounds(1050, 350, 70, 100);
        armadurapj2.setBackground(Color.yellow);
        armadurapj2.setOpaque(true);

        c.add(arma1pj2);
        arma1pj2.setBounds(1000, 250, 70, 100);
        arma1pj2.setBackground(Color.yellow);
        arma1pj2.setOpaque(true);

        c.add(arma2pj2);
        arma2pj2.setBounds(1100, 250, 70, 100);
        arma2pj2.setBackground(Color.yellow);
        arma2pj2.setOpaque(true);

        c.add(cuerpopj2);
        cuerpopj2.setBounds(800, 250, 140, 200);
        cuerpopj2.setBackground(Color.yellow);
        cuerpopj2.setOpaque(true);
        /////////////////// montura 
        c.add(cuerpoMon);
        cuerpoMon.setBounds(565, 250, 200, 200);
        cuerpoMon.setBackground(Color.gray);
        cuerpoMon.setOpaque(true);

        c.add(NomMontura);
        NomMontura.setBounds(1200, 450, 170, 20);
        NomMontura.setBackground(Color.gray);
        NomMontura.setOpaque(true);

        c.add(atkmont);
        atkmont.setBounds(1200, 470, 170, 20);
        atkmont.setBackground(Color.gray);
        atkmont.setOpaque(true);

        c.add(atkMagmont);
        atkMagmont.setBounds(1200, 490, 170, 20);
        atkMagmont.setBackground(Color.gray);
        atkMagmont.setOpaque(true);

        c.add(defmot);
        defmot.setBounds(1200, 510, 170, 20);
        defmot.setBackground(Color.gray);
        defmot.setOpaque(true);

        c.add(defMagmont);
        defMagmont.setBounds(1200, 530, 170, 20);
        defMagmont.setBackground(Color.gray);
        defMagmont.setOpaque(true);

        c.add(vidamontu);
        vidamontu.setBounds(1200, 550, 170, 20);
        vidamontu.setBackground(Color.gray);
        vidamontu.setOpaque(true);

        c.add(estadomontu);
        estadomontu.setBounds(1200, 570, 170, 20);
        estadomontu.setBackground(Color.gray);
        estadomontu.setOpaque(true);
    }

    public void mostrar() {
        setSize(1480, 730);
        setVisible(true);

    }

}
