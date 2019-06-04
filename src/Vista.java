
import Constructor.ConstructorArquero;
import Constructor.AdaptadorConstructorOrco;
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

    VentanaAcciones ven;
    Color colorventana = new Color(100, 45, 40);
    Color bordeSup = new Color(40, 40, 40);
    Color bordeinf = new Color(50, 45, 40);
    Color textA = new Color(0, 0, 0);
    Color letra = new Color(150, 150, 150);
    JButton btnGuerrero = new JButton();
    JButton btnMago = new JButton();
    JButton btnArquero = new JButton();
    JButton btnLadron = new JButton();
    JButton btnOrco = new JButton();
    JButton selectPJ = new JButton();
// los iconos de opciones

    JButton cintaarma = new JButton();
    JButton cintaarma2 = new JButton();
    JButton cintaarmadura = new JButton();
    JButton cintamontura = new JButton();

    JTextArea equipo = new JTextArea();
    JButton btnArmA = new JButton();
    JButton btnArmB = new JButton();
    JButton btnArmC = new JButton();
    JButton btnArm2A = new JButton();
    JButton btnArm2B = new JButton();
    JButton btnArm2C = new JButton();
    JButton btnMontura = new JButton();
    JButton btnArmaduraA = new JButton();
    JButton btnArmaduraB = new JButton();
    JButton btnArmaduraC = new JButton();
    JTextArea informacion = new JTextArea();
    JLabel perga = new JLabel();
    JLabel fondo = new JLabel();
    //lo que se muestra en pergamino
    JLabel Personaje = new JLabel();
    JLabel arm1 = new JLabel();
    JLabel arm2 = new JLabel();
    JLabel armadura = new JLabel();
    JLabel montura = new JLabel();

    public Director director = new Director();
    private Personaje personaje = new Personaje();
    public static Vista vista;

    public static void main(String[] args) {

        vista = new Vista();
        vista.setSize(1200, 720);
        vista.setVisible(true);

    }

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Container c = getContentPane();
        setTitle("Catálogo de clases");
        c.setLayout(null);
        c.add(informacion);
        c.add(selectPJ);
        c.add(arm2);
        c.add(arm1);
        c.add(armadura);
        c.add(Personaje);
        c.add(montura);
        c.add(cintaarma);
        c.add(cintaarma2);
        c.add(cintaarmadura);
        c.add(cintamontura);
        c.add(btnArmA);
        c.add(btnArmB);
        c.add(btnArmC);
        c.add(btnArm2A);
        c.add(btnArm2B);
        c.add(btnArm2C);
        c.add(btnArmaduraA);
        c.add(btnArmaduraB);
        c.add(btnArmaduraC);
        c.add(btnMontura);
        c.add(btnLadron);
        c.add(btnOrco);
        c.add(btnArquero);
        c.add(btnMago);
        c.add(btnGuerrero);
        c.add(equipo);
        c.add(perga);
        c.add(fondo);

        btnGuerrero.addActionListener(this);
        btnArquero.addActionListener(this);
        btnLadron.addActionListener(this);
        btnMago.addActionListener(this);
        btnOrco.addActionListener(this);
        btnArmA.addActionListener(this);
        btnArmB.addActionListener(this);
        btnArmC.addActionListener(this);
        btnArm2A.addActionListener(this);
        btnArm2B.addActionListener(this);
        btnArm2C.addActionListener(this);
        btnArmaduraA.addActionListener(this);
        btnArmaduraB.addActionListener(this);
        btnArmaduraC.addActionListener(this);
        btnMontura.addActionListener(this);
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

        cintaarma.setBackground(Color.black);
        cintaarma.setBorder(null);
        cintaarma.setBounds(45, 205, 270, 40);
        cintaarma.setIcon(iconoEscalado4);

        btnArmA.setBackground(Color.black);
        btnArmA.setBorder(null);
        btnArmA.setBounds(55, 255, 60, 60);
        btnArmA.setIcon(iconoEscalado1);

        btnArmB.setBackground(Color.black);
        btnArmB.setBorder(null);
        btnArmB.setBounds(155, 245, 60, 60);
        btnArmB.setIcon(iconoEscalado2);

        btnArmC.setBackground(Color.black);
        btnArmC.setBorder(null);
        btnArmC.setBounds(255, 255, 60, 60);
        btnArmC.setIcon(iconoEscalado3);

        ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/cintaarmasecundaria.png"));
        Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(270, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
        cintaarma2.setBackground(Color.black);
        cintaarma2.setBorder(null);
        cintaarma2.setBounds(45, 325, 270, 40);
        cintaarma2.setIcon(iconoEscalado5);

        btnArm2A.setBackground(Color.black);
        btnArm2A.setBorder(null);
        btnArm2A.setBounds(55, 375, 60, 60);
        btnArm2A.setIcon(iconoEscalado1);

        btnArm2B.setBackground(Color.black);
        btnArm2B.setBorder(null);
        btnArm2B.setBounds(155, 365, 60, 60);
        btnArm2B.setIcon(iconoEscalado2);

        btnArm2C.setBackground(Color.black);
        btnArm2C.setBorder(null);
        btnArm2C.setBounds(255, 375, 60, 60);
        btnArm2C.setIcon(iconoEscalado3);

        ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/cintaarmadura.png"));
        Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(270, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado6 = new ImageIcon(imgEscalada6);
        cintaarmadura.setBackground(Color.black);
        cintaarmadura.setBorder(null);
        cintaarmadura.setBounds(45, 445, 270, 40);
        cintaarmadura.setIcon(iconoEscalado6);

        btnArmaduraA.setBackground(Color.black);
        btnArmaduraA.setBorder(null);
        btnArmaduraA.setBounds(55, 495, 60, 60);
        btnArmaduraA.setIcon(iconoEscalado1);

        btnArmaduraB.setBackground(Color.black);
        btnArmaduraB.setBorder(null);
        btnArmaduraB.setBounds(155, 485, 60, 60);
        btnArmaduraB.setIcon(iconoEscalado2);

        btnArmaduraC.setBackground(Color.black);
        btnArmaduraC.setBorder(null);
        btnArmaduraC.setBounds(255, 495, 60, 60);
        btnArmaduraC.setIcon(iconoEscalado3);

        ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/Imagenes/cintamontura.png"));
        Image imgEscalada7 = imgIcon7.getImage().getScaledInstance(270, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado7 = new ImageIcon(imgEscalada7);
        cintamontura.setBackground(Color.black);
        cintamontura.setBorder(null);
        cintamontura.setBounds(45, 565, 270, 40);
        cintamontura.setIcon(iconoEscalado7);

        ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/Imagenes/sellocaballo.png"));
        Image imgEscalada8 = imgIcon8.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        Icon iconoEscalado8 = new ImageIcon(imgEscalada8);
        btnMontura.setBackground(Color.black);
        btnMontura.setBorder(null);
        btnMontura.setBounds(150, 605, 70, 70);
        btnMontura.setIcon(iconoEscalado8);

        ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/Imagenes/icono_guerrero.png"));
        Image imgEscalada9 = imgIcon9.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado9 = new ImageIcon(imgEscalada9);
        btnGuerrero.setBackground(Color.black);
        btnGuerrero.setBorder(null);
        btnGuerrero.setBounds(30, 5, 300, 40);
        btnGuerrero.setIcon(iconoEscalado9);

        ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/Imagenes/icono_arquero.png"));
        Image imgEscalada11 = imgIcon11.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado11 = new ImageIcon(imgEscalada11);
        btnArquero.setBackground(Color.black);
        btnArquero.setBorder(null);
        btnArquero.setBounds(30, 45, 300, 40);
        btnArquero.setIcon(iconoEscalado11);

        ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/Imagenes/icono_ladron.png"));
        Image imgEscalada12 = imgIcon12.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado12 = new ImageIcon(imgEscalada12);
        btnLadron.setBackground(Color.black);
        btnLadron.setBorder(null);
        btnLadron.setBounds(30, 85, 300, 40);
        btnLadron.setIcon(iconoEscalado12);

        ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/Imagenes/icono_maga.png"));
        Image imgEscalada10 = imgIcon10.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado10 = new ImageIcon(imgEscalada10);
        btnMago.setBackground(Color.black);
        btnMago.setBorder(null);
        btnMago.setBounds(30, 125, 300, 40);
        btnMago.setIcon(iconoEscalado10);
        
        ImageIcon imgIcon13 = new ImageIcon(getClass().getResource("/Imagenes/icono_orco.png"));
        Image imgEscalada13 = imgIcon13.getImage().getScaledInstance(300, 40, Image.SCALE_SMOOTH);
        Icon iconoEscalado13 = new ImageIcon(imgEscalada13);
        btnOrco.setBackground(Color.black);
        btnOrco.setBorder(null);
        btnOrco.setBounds(30, 165, 300, 40);
        btnOrco.setIcon(iconoEscalado13);

        selectPJ.setIcon(new ImageIcon(getClass().getResource("/Imagenes/select.png")));
        selectPJ.setBorder(null);
        selectPJ.setBounds(405, 80, 250, 42);

        equipo.setBounds(25, 5, 310, 670);
        equipo.setBackground(textA);
        equipo.setEnabled(false);

        perga.setBounds(350, 5, 750, 700);
        perga.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pergamino.png")));

        fondo.setBounds(0, -300, 1900, 1226);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/tabla.png")));

    }

    public void actualizarImagenes() {

        arm1.setBounds(380, 120, 306, 450);
        arm1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + personaje.getArma() + ".png")));

        arm2.setBounds(380, 120, 306, 450);
        arm2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + personaje.getArmaSecu() + ".png")));

        armadura.setBounds(380, 120, 306, 450);
        armadura.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + personaje.getArmadura() + ".png")));

        Personaje.setBounds(380, 120, 306, 450);
        Personaje.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + personaje.getCuerpo() + ".png")));

        ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/Imagenes/" + personaje.getMontura() + ".png"));
        Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(440, 500, Image.SCALE_SMOOTH);
        Icon iconoEscalado1 = new ImageIcon(imgEscalada1);
        montura.setBounds(650, 70, 440, 500);
        montura.setIcon(iconoEscalado1);
        informacion.setLocation(410, 575);
        informacion.setSize(620, 50);
        informacion.setEnabled(false);
        informacion.setBackground(textA);
        informacion.setDisabledTextColor(Color.WHITE);
        informacion.setFont(new Font("Monospaced", Font.ITALIC, 10));
        informacion.setLineWrap(true);
        informacion.setText(personaje.getLeyenda());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuerrero) {

            director.setConstructor(new ConstructorGuerrero());
            director.construirPersonaje();
            director.añadirLeyenda();
            personaje = director.getPersonaje();

            actualizarImagenes();

        } else if (e.getSource() == btnArquero) {
            director.setConstructor(new ConstructorArquero());
            director.construirPersonaje();
            director.añadirLeyenda();
            personaje = director.getPersonaje();

            actualizarImagenes();

        } else if (e.getSource() == btnMago) {
            director.setConstructor(new ConstructorMago());
            director.construirPersonaje();
            director.añadirLeyenda();
            personaje = director.getPersonaje();

            actualizarImagenes();

        } else if (e.getSource() == btnLadron) {
            director.setConstructor(new ConstructorLadron());
            director.construirPersonaje();
            director.añadirLeyenda();
            personaje = director.getPersonaje();

            actualizarImagenes();

        } else if (e.getSource() == btnOrco) {
            director.setConstructor(new AdaptadorConstructorOrco());
            director.construirPersonaje();
            director.añadirLeyenda();
            personaje = director.getPersonaje();

            actualizarImagenes();

        }else if (e.getSource() == btnArmA) {

            director.añadirArma(1);
            actualizarImagenes();

        } else if (e.getSource() == btnArmB) {

            director.añadirArma(2);
            actualizarImagenes();

        } else if (e.getSource() == btnArmC) {

            director.añadirArma(3);
            actualizarImagenes();

        } else if (e.getSource() == btnArm2A) {

            director.añadirArmaSecu(1);
            actualizarImagenes();

        } else if (e.getSource() == btnArm2B) {

            director.añadirArmaSecu(2);
            actualizarImagenes();

        } else if (e.getSource() == btnArm2C) {

            director.añadirArmaSecu(3);
            actualizarImagenes();

        } else if (e.getSource() == btnArmaduraA) {

            director.añadirArmadura(1);
            actualizarImagenes();

        } else if (e.getSource() == btnArmaduraB) {

            director.añadirArmadura(2);
            actualizarImagenes();

        } else if (e.getSource() == btnArmaduraC) {

            director.añadirArmadura(3);
            actualizarImagenes();

        } else if (e.getSource() == btnMontura) {

            director.añadirMontura();
            actualizarImagenes();

        } else if (e.getSource().equals(selectPJ)) {
            if (ven != null) {//si existe una venta, la cierra.
                ven.dispose();
            }

            ven = new VentanaAcciones(); //crea la ventana y la muestra     
            ven.setVisible(true);

            ven.director = this.director;
            ven.personaje = this.personaje;

            ven.mostrar();
            ven.inicio.setEnabled(true);

        }
    }
}
