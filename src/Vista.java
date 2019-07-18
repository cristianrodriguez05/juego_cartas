
import Constructor.ConstructorArquero;
import Constructor.ConstructorGuerrero;
import Constructor.ConstructorLadron;
import Constructor.ConstructorMago;
import Constructor.Director;
import Constructor.Personaje;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author estudiantes
 */
public class Vista extends JFrame implements ActionListener {

    Color colorventana = new Color(100, 45, 40);
    Color bordeSup = new Color(40, 40, 40);
    Color bordeinf = new Color(50, 45, 40);
    Color textA = new Color(0, 0, 0);
    Color letra = new Color(150, 150, 150);
    JButton prim_btnGuerrero = new JButton();
    JButton secu_btnGuerrero = new JButton();
    JButton prim_btnMago = new JButton();
    JButton secu_btnMago = new JButton();
    JButton prim_btnArquero = new JButton();
    JButton secu_btnArquero = new JButton();
    JButton prim_btnLadron = new JButton();
    JButton secu_btnLadron = new JButton();
    JButton selectPJ = new JButton();
// los iconos de opciones

    JButton prim_cintaarma = new JButton();
    JButton secu_cintaarma = new JButton();
    JButton prim_cintaarma2 = new JButton();
    JButton secu_cintaarma2 = new JButton();
    JButton prim_cintaarmadura = new JButton();
    JButton secu_cintaarmadura = new JButton();

    JTextArea prim_equipo = new JTextArea();
    JTextArea secu_equipo = new JTextArea();
    JButton prim_btnArmA = new JButton();
    JButton secu_btnArmA = new JButton();
    JButton prim_btnArmB = new JButton();
    JButton secu_btnArmB = new JButton();
    JButton prim_btnArmC = new JButton();
    JButton secu_btnArmC = new JButton();
    JButton prim_btnArm2A = new JButton();
    JButton secu_btnArm2A = new JButton();
    JButton prim_btnArm2B = new JButton();
    JButton secu_btnArm2B = new JButton();
    JButton prim_btnArm2C = new JButton();
    JButton secu_btnArm2C = new JButton();
    JButton prim_btnArmaduraA = new JButton();
    JButton secu_btnArmaduraA = new JButton();
    JButton prim_btnArmaduraB = new JButton();
    JButton secu_btnArmaduraB = new JButton();
    JButton prim_btnArmaduraC = new JButton();
    JButton secu_btnArmaduraC = new JButton();
    JTextArea prim_informacion = new JTextArea();
    JTextArea secu_informacion = new JTextArea();
    JLabel perga = new JLabel();
    JLabel fondo = new JLabel();
    //lo que se muestra en pergamino
    JLabel prim_pj = new JLabel();
    JLabel secu_pj = new JLabel();
    JLabel prim_arm1 = new JLabel();
    JLabel secu_arm1 = new JLabel();
    JLabel prim_arm2 = new JLabel();
    JLabel secu_arm2 = new JLabel();
    JLabel prim_armadura = new JLabel();
    JLabel secu_armadura = new JLabel();

    public Director prim_director = new Director();
    public Director secu_director = new Director();
    private Personaje prim_personaje = new Personaje();
    private Personaje secu_personaje = new Personaje();
    public static Vista vista;

    public static void main(String[] args) {

        vista = new Vista();
        vista.setSize(1370, 740);
        vista.setVisible(true);

    }

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Container c = getContentPane();
        setTitle("Catálogo de clases");
        c.setLayout(null);
        c.add(prim_informacion);
        c.add(prim_arm2);
        c.add(prim_arm1);
        c.add(prim_armadura);
        c.add(prim_pj);
        c.add(prim_cintaarma);
        c.add(prim_cintaarma2);
        c.add(prim_cintaarmadura);
        c.add(prim_btnArmA);
        c.add(prim_btnArmB);
        c.add(prim_btnArmC);
        c.add(prim_btnArm2A);
        c.add(prim_btnArm2B);
        c.add(prim_btnArm2C);
        c.add(prim_btnArmaduraA);
        c.add(prim_btnArmaduraB);
        c.add(prim_btnArmaduraC);
        c.add(prim_btnLadron);
        c.add(prim_btnArquero);
        c.add(prim_btnMago);
        c.add(prim_btnGuerrero);
        c.add(prim_equipo);
        c.add(secu_informacion);
        c.add(secu_arm2);
        c.add(secu_arm1);
        c.add(secu_armadura);
        c.add(secu_pj);
        c.add(secu_cintaarma);
        c.add(secu_cintaarma2);
        c.add(secu_cintaarmadura);
        c.add(secu_btnArmA);
        c.add(secu_btnArmB);
        c.add(secu_btnArmC);
        c.add(secu_btnArm2A);
        c.add(secu_btnArm2B);
        c.add(secu_btnArm2C);
        c.add(secu_btnArmaduraA);
        c.add(secu_btnArmaduraB);
        c.add(secu_btnArmaduraC);
        c.add(secu_btnLadron);
        c.add(secu_btnArquero);
        c.add(secu_btnMago);
        c.add(secu_btnGuerrero);
        c.add(secu_equipo);
        c.add(perga);
        c.add(fondo);
        c.add(selectPJ);

        prim_btnGuerrero.addActionListener(this);
        prim_btnArquero.addActionListener(this);
        prim_btnLadron.addActionListener(this);
        prim_btnMago.addActionListener(this);
        prim_btnArmA.addActionListener(this);
        prim_btnArmB.addActionListener(this);
        prim_btnArmC.addActionListener(this);
        prim_btnArm2A.addActionListener(this);
        prim_btnArm2B.addActionListener(this);
        prim_btnArm2C.addActionListener(this);
        prim_btnArmaduraA.addActionListener(this);
        prim_btnArmaduraB.addActionListener(this);
        prim_btnArmaduraC.addActionListener(this);
        secu_btnGuerrero.addActionListener(this);
        secu_btnArquero.addActionListener(this);
        secu_btnLadron.addActionListener(this);
        secu_btnMago.addActionListener(this);
        secu_btnArmA.addActionListener(this);
        secu_btnArmB.addActionListener(this);
        secu_btnArmC.addActionListener(this);
        secu_btnArm2A.addActionListener(this);
        secu_btnArm2B.addActionListener(this);
        secu_btnArm2C.addActionListener(this);
        secu_btnArmaduraA.addActionListener(this);
        secu_btnArmaduraB.addActionListener(this);
        secu_btnArmaduraC.addActionListener(this);
        selectPJ.addActionListener(this);

        ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/Imagenes/sello1.png"));
        Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        Icon iconoEscalado1 = new ImageIcon(imgEscalada1);

        ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/sello2.png"));
        Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);

        ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/sello3.png"));
        Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);

        ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/cintaarma.png"));
        Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(270, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);

        prim_cintaarma.setBackground(Color.black);
        prim_cintaarma.setBorder(null);
        prim_cintaarma.setBounds(20, 175, 270, 40);
        prim_cintaarma.setIcon(iconoEscalado4);

        prim_btnArmA.setBackground(Color.black);
        prim_btnArmA.setBorder(null);
        prim_btnArmA.setBounds(30, 225, 60, 60);
        prim_btnArmA.setIcon(iconoEscalado1);

        prim_btnArmB.setBackground(Color.black);
        prim_btnArmB.setBorder(null);
        prim_btnArmB.setBounds(130, 215, 60, 60);
        prim_btnArmB.setIcon(iconoEscalado2);

        prim_btnArmC.setBackground(Color.black);
        prim_btnArmC.setBorder(null);
        prim_btnArmC.setBounds(230, 225, 60, 60);
        prim_btnArmC.setIcon(iconoEscalado3);

        secu_cintaarma.setBackground(Color.black);
        secu_cintaarma.setBorder(null);
        secu_cintaarma.setBounds(1075, 175, 270, 40);
        secu_cintaarma.setIcon(iconoEscalado4);

        secu_btnArmA.setBackground(Color.black);
        secu_btnArmA.setBorder(null);
        secu_btnArmA.setBounds(1085, 225, 60, 60);
        secu_btnArmA.setIcon(iconoEscalado1);

        secu_btnArmB.setBackground(Color.black);
        secu_btnArmB.setBorder(null);
        secu_btnArmB.setBounds(1185, 215, 60, 60);
        secu_btnArmB.setIcon(iconoEscalado2);

        secu_btnArmC.setBackground(Color.black);
        secu_btnArmC.setBorder(null);
        secu_btnArmC.setBounds(1285, 225, 60, 60);
        secu_btnArmC.setIcon(iconoEscalado3);

        ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/cintaarmasecundaria.png"));
        Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(270, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);

        prim_cintaarma2.setBackground(Color.black);
        prim_cintaarma2.setBorder(null);
        prim_cintaarma2.setBounds(20, 295, 270, 40);
        prim_cintaarma2.setIcon(iconoEscalado5);

        prim_btnArm2A.setBackground(Color.black);
        prim_btnArm2A.setBorder(null);
        prim_btnArm2A.setBounds(30, 345, 60, 60);
        prim_btnArm2A.setIcon(iconoEscalado1);

        prim_btnArm2B.setBackground(Color.black);
        prim_btnArm2B.setBorder(null);
        prim_btnArm2B.setBounds(130, 335, 60, 60);
        prim_btnArm2B.setIcon(iconoEscalado2);

        prim_btnArm2C.setBackground(Color.black);
        prim_btnArm2C.setBorder(null);
        prim_btnArm2C.setBounds(230, 345, 60, 60);
        prim_btnArm2C.setIcon(iconoEscalado3);

        secu_cintaarma2.setBackground(Color.black);
        secu_cintaarma2.setBorder(null);
        secu_cintaarma2.setBounds(1075, 295, 270, 40);
        secu_cintaarma2.setIcon(iconoEscalado5);

        secu_btnArm2A.setBackground(Color.black);
        secu_btnArm2A.setBorder(null);
        secu_btnArm2A.setBounds(1085, 345, 60, 60);
        secu_btnArm2A.setIcon(iconoEscalado1);

        secu_btnArm2B.setBackground(Color.black);
        secu_btnArm2B.setBorder(null);
        secu_btnArm2B.setBounds(1185, 335, 60, 60);
        secu_btnArm2B.setIcon(iconoEscalado2);

        secu_btnArm2C.setBackground(Color.black);
        secu_btnArm2C.setBorder(null);
        secu_btnArm2C.setBounds(1285, 345, 60, 60);
        secu_btnArm2C.setIcon(iconoEscalado3);

        ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/cintaarmadura.png"));
        Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(270, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado6 = new ImageIcon(imgEscalada6);

        prim_cintaarmadura.setBackground(Color.black);
        prim_cintaarmadura.setBorder(null);
        prim_cintaarmadura.setBounds(20, 415, 270, 40);
        prim_cintaarmadura.setIcon(iconoEscalado6);

        prim_btnArmaduraA.setBackground(Color.black);
        prim_btnArmaduraA.setBorder(null);
        prim_btnArmaduraA.setBounds(30, 465, 60, 60);
        prim_btnArmaduraA.setIcon(iconoEscalado1);

        prim_btnArmaduraB.setBackground(Color.black);
        prim_btnArmaduraB.setBorder(null);
        prim_btnArmaduraB.setBounds(130, 455, 60, 60);
        prim_btnArmaduraB.setIcon(iconoEscalado2);

        prim_btnArmaduraC.setBackground(Color.black);
        prim_btnArmaduraC.setBorder(null);
        prim_btnArmaduraC.setBounds(230, 465, 60, 60);
        prim_btnArmaduraC.setIcon(iconoEscalado3);

        secu_cintaarmadura.setBackground(Color.black);
        secu_cintaarmadura.setBorder(null);
        secu_cintaarmadura.setBounds(1075, 415, 270, 40);
        secu_cintaarmadura.setIcon(iconoEscalado6);

        secu_btnArmaduraA.setBackground(Color.black);
        secu_btnArmaduraA.setBorder(null);
        secu_btnArmaduraA.setBounds(1085, 465, 60, 60);
        secu_btnArmaduraA.setIcon(iconoEscalado1);

        secu_btnArmaduraB.setBackground(Color.black);
        secu_btnArmaduraB.setBorder(null);
        secu_btnArmaduraB.setBounds(1185, 455, 60, 60);
        secu_btnArmaduraB.setIcon(iconoEscalado2);

        secu_btnArmaduraC.setBackground(Color.black);
        secu_btnArmaduraC.setBorder(null);
        secu_btnArmaduraC.setBounds(1285, 465, 60, 60);
        secu_btnArmaduraC.setIcon(iconoEscalado3);

        ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/Imagenes/icono_guerrero.png"));
        Image imgEscalada9 = imgIcon9.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado9 = new ImageIcon(imgEscalada9);
        prim_btnGuerrero.setBackground(Color.black);
        prim_btnGuerrero.setBorder(null);
        prim_btnGuerrero.setBounds(5, 5, 300, 40);
        prim_btnGuerrero.setIcon(iconoEscalado9);
        secu_btnGuerrero.setBackground(Color.black);
        secu_btnGuerrero.setBorder(null);
        secu_btnGuerrero.setBounds(1060, 5, 300, 40);
        secu_btnGuerrero.setIcon(iconoEscalado9);

        ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/Imagenes/icono_arquero.png"));
        Image imgEscalada11 = imgIcon11.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado11 = new ImageIcon(imgEscalada11);
        prim_btnArquero.setBackground(Color.black);
        prim_btnArquero.setBorder(null);
        prim_btnArquero.setBounds(5, 45, 300, 40);
        prim_btnArquero.setIcon(iconoEscalado11);
        secu_btnArquero.setBackground(Color.black);
        secu_btnArquero.setBorder(null);
        secu_btnArquero.setBounds(1060, 45, 300, 40);
        secu_btnArquero.setIcon(iconoEscalado11);

        ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/Imagenes/icono_ladron.png"));
        Image imgEscalada12 = imgIcon12.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado12 = new ImageIcon(imgEscalada12);
        prim_btnLadron.setBackground(Color.black);
        prim_btnLadron.setBorder(null);
        prim_btnLadron.setBounds(5, 85, 300, 40);
        prim_btnLadron.setIcon(iconoEscalado12);
        secu_btnLadron.setBackground(Color.black);
        secu_btnLadron.setBorder(null);
        secu_btnLadron.setBounds(1060, 85, 300, 40);
        secu_btnLadron.setIcon(iconoEscalado12);

        ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/Imagenes/icono_maga.png"));
        Image imgEscalada10 = imgIcon10.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado10 = new ImageIcon(imgEscalada10);
        prim_btnMago.setBackground(Color.black);
        prim_btnMago.setBorder(null);
        prim_btnMago.setBounds(5, 125, 300, 40);
        prim_btnMago.setIcon(iconoEscalado10);
        secu_btnMago.setBackground(Color.black);
        secu_btnMago.setBorder(null);
        secu_btnMago.setBounds(1060, 125, 300, 40);
        secu_btnMago.setIcon(iconoEscalado10);

        prim_equipo.setBounds(5, 5, 300, 670);
        prim_equipo.setBackground(textA);
        prim_equipo.setEnabled(false);
        secu_equipo.setBounds(1060, 5, 300, 670);
        secu_equipo.setBackground(textA);
        secu_equipo.setEnabled(false);

        perga.setBounds(305, 5, 750, 700);
        perga.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pergamino.png")));

        fondo.setBounds(0, -300, 1900, 1226);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/tablas.png")));

        selectPJ.setIcon(new ImageIcon(getClass().getResource("/Imagenes/select.png")));
        selectPJ.setBorder(null);
        selectPJ.setBounds(560, 60, 250, 42);

    }

    public void prim_actualizarImagenes() {

        prim_arm1.setBounds(350, 120, 306, 450);
        prim_arm1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + prim_personaje.getArma() + ".png")));

        prim_arm2.setBounds(350, 120, 306, 450);
        prim_arm2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + prim_personaje.getArmaSecu() + ".png")));

        prim_armadura.setBounds(350, 120, 306, 450);
        prim_armadura.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + prim_personaje.getArmadura() + ".png")));

        prim_pj.setBounds(350, 120, 306, 450);
        prim_pj.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + prim_personaje.getCuerpo() + ".png")));

        prim_informacion.setLocation(310, 610);
        prim_informacion.setSize(370, 95);
        prim_informacion.setEnabled(false);
        prim_informacion.setBackground(textA);
        prim_informacion.setDisabledTextColor(Color.WHITE);
        prim_informacion.setFont(new Font("Monospaced", Font.ITALIC, 12));
        prim_informacion.setLineWrap(true);
        prim_informacion.setText(prim_personaje.getLeyenda());
    }

    public void secu_actualizarImagenes() {

        secu_arm1.setBounds(700, 120, 306, 450);
        secu_arm1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + secu_personaje.getArma() + ".png")));

        secu_arm2.setBounds(700, 120, 306, 450);
        secu_arm2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + secu_personaje.getArmaSecu() + ".png")));

        secu_armadura.setBounds(700, 120, 306, 450);
        secu_armadura.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + secu_personaje.getArmadura() + ".png")));

        secu_pj.setBounds(700, 120, 306, 450);
        secu_pj.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + secu_personaje.getCuerpo() + ".png")));

        secu_informacion.setLocation(685, 610);
        secu_informacion.setSize(370, 95);
        secu_informacion.setEnabled(false);
        secu_informacion.setBackground(textA);
        secu_informacion.setDisabledTextColor(Color.WHITE);
        secu_informacion.setFont(new Font("Monospaced", Font.ITALIC, 12));
        secu_informacion.setLineWrap(true);
        secu_informacion.setText(secu_personaje.getLeyenda());
    }
    VentanaSlectMazo ven = new VentanaSlectMazo();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prim_btnGuerrero) {

            prim_director.setConstructor(new ConstructorGuerrero());
            prim_director.construirPersonaje();
            prim_director.añadirLeyenda();
            prim_personaje = prim_director.getPersonaje();

            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArquero) {
            prim_director.setConstructor(new ConstructorArquero());
            prim_director.construirPersonaje();
            prim_director.añadirLeyenda();
            prim_personaje = prim_director.getPersonaje();

            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnMago) {
            prim_director.setConstructor(new ConstructorMago());
            prim_director.construirPersonaje();
            prim_director.añadirLeyenda();
            prim_personaje = prim_director.getPersonaje();

            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnLadron) {
            prim_director.setConstructor(new ConstructorLadron());
            prim_director.construirPersonaje();
            prim_director.añadirLeyenda();
            prim_personaje = prim_director.getPersonaje();

            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArmA) {

            prim_director.añadirArma(1);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArmB) {

            prim_director.añadirArma(2);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArmC) {

            prim_director.añadirArma(3);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArm2A) {

            prim_director.añadirArmaSecu(1);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArm2B) {

            prim_director.añadirArmaSecu(2);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArm2C) {

            prim_director.añadirArmaSecu(3);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArmaduraA) {

            prim_director.añadirArmadura(1);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArmaduraB) {

            prim_director.añadirArmadura(2);
            prim_actualizarImagenes();

        } else if (e.getSource() == prim_btnArmaduraC) {

            prim_director.añadirArmadura(3);
            prim_actualizarImagenes();

        } else if (e.getSource() == secu_btnGuerrero) {

            secu_director.setConstructor(new ConstructorGuerrero());
            secu_director.construirPersonaje();
            secu_director.añadirLeyenda();
            secu_personaje = secu_director.getPersonaje();

            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArquero) {
            secu_director.setConstructor(new ConstructorArquero());
            secu_director.construirPersonaje();
            secu_director.añadirLeyenda();
            secu_personaje = secu_director.getPersonaje();

            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnMago) {
            secu_director.setConstructor(new ConstructorMago());
            secu_director.construirPersonaje();
            secu_director.añadirLeyenda();
            secu_personaje = secu_director.getPersonaje();

            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnLadron) {
            secu_director.setConstructor(new ConstructorLadron());
            secu_director.construirPersonaje();
            secu_director.añadirLeyenda();
            secu_personaje = secu_director.getPersonaje();

            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArmA) {

            secu_director.añadirArma(1);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArmB) {

            secu_director.añadirArma(2);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArmC) {

            secu_director.añadirArma(3);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArm2A) {

            secu_director.añadirArmaSecu(1);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArm2B) {

            secu_director.añadirArmaSecu(2);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArm2C) {

            secu_director.añadirArmaSecu(3);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArmaduraA) {

            secu_director.añadirArmadura(1);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArmaduraB) {

            secu_director.añadirArmadura(2);
            secu_actualizarImagenes();

        } else if (e.getSource() == secu_btnArmaduraC) {

            secu_director.añadirArmadura(3);
            secu_actualizarImagenes();

        } else if (e.getSource().equals(selectPJ)) {
            if (ven != null) {//si existe una venta, la cierra.
                ven.dispose();
            }

            ven = new VentanaSlectMazo(); //crea la ventana y la muestra     
            ven.setVisible(true);

            ven.personaje2 = this.secu_personaje;
            ven.personaje1 = this.prim_personaje;
            ven.mostrar();
            this.dispose();

        }
    }
}
