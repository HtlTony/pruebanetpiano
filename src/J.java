
import java.awt.Dimension;
import java.awt.Image;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
abstract public class J extends JFrame {

//    public TeclaDo tdo;
//    public TeclaRe tre;
//    public TeclaMi tmi;
//    public TeclaFa tfa;
//    public TeclaSol tsol;
//    public TeclaLa tla;
//    public TeclaSi tsi;
//
//    JTButton jb;
//    JTButton jb2;
//    JTButton jb3;
//    JTButton jb4;
//    JTButton jb5;
//    JTButton jb6;
//    JTButton jb7;
    public J() {
    }

    public void initC() {
        JPanel jp = new JPanel();
        Constantes co = new Constantes();
        Iterator it = co.arrnotas.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
// http://elclubdelautodidacta.es/wp/wp-content/uploads/2011/09/tecladito-3.png
            String imgicon = Constantes.RUTAIMG + s.toLowerCase() + ".png";
            System.out.println("looking for " + imgicon);
            ImageIcon iconA = new ImageIcon(imgicon);
            Image icon = iconA.getImage().getScaledInstance(30, 300, Image.SCALE_SMOOTH);
            iconA.setImage(icon);
            JButton bu = new JButton("", iconA);
            bu.setPreferredSize(new Dimension(30, 300));

            try {
                Class classTecla = Class.forName("Tecla" + s);   //Carga dinámica de clases, esta instrucción puede instanciar las
                                                                 // diferentes teclas s carga el tono de la tecla
                Tecla tecla = (Tecla) classTecla.newInstance();

                Class classOrejas = Class.forName("Orejas" + s);  //esta clase implente actionListener 
                Orejas orejas = (Orejas) classOrejas.newInstance();

                orejas.add(tecla);

                bu.addActionListener(orejas);
                jp.add(bu);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger("Error en las orejas...");
            } catch (InstantiationException ex) {
                Logger.getLogger(J.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(J.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//        jb = new JTButton("DO");
//        OrejasDo orejaDo = new OrejasDo();
//        orejaDo.add(tdo);
//        jb.addActionListener(orejaDo);
//
//        jb2 = new JTButton("RE");
//        OrejasRe orejaRe = new OrejasRe();
//        orejaRe.add(tre);
//        jb2.addActionListener(orejaRe);
//
//        jb3 = new JTButton("MI");
//        OrejasMi orejaMi = new OrejasMi();
//        orejaMi.add(tmi);
//        jb3.addActionListener(orejaMi);
//
//        jb4 = new JTButton("FA");
//        OrejasFa orejaFa = new OrejasFa();
//        orejaFa.add(tfa);
//        jb4.addActionListener(orejaFa);
//
//        jb5 = new JTButton("SOL");
//        OrejasSol orejaSol = new OrejasSol();
//        orejaSol.add(tsol);
//        jb5.addActionListener(orejaSol);
//
//        jb6 = new JTButton("LA");
//        OrejasLa orejaLa = new OrejasLa();
//        orejaLa.add(tla);
//        jb6.addActionListener(orejaLa);
//
//        jb7 = new JTButton("SI");
//        //TeclaRe tre = new TeclaRe();
//        //jb2.setTecla(tre);
//        OrejasSi orejaSi = new OrejasSi();
//        orejaSi.add(tsi);
//        jb7.addActionListener(orejaSi);
//        
//        
//        JPanel jp = new JPanel();
//        jp.add(jb);
//        jp.add(jb2);
//        jp.add(jb3);
//        jp.add(jb4);
//        jp.add(jb5);
//        jp.add(jb6);
//        jp.add(jb7);

        add(jp);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }
}
