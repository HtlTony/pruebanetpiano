
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class Hello Documentation of the Hello class
 */
public class Hello {

    //
    // Fields
    //
    //
    // Constructors
    //
    //Herrera improvement public Hello () { };
    //
    // Methods
    //
    //
    // Accessor methods
    //
    //
    // Other methods
    //
    /**
     * A comment about the Hello constructor
     *
     * @param args Parameter documentation
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Piano p = new Piano();
//        TeclaDo tdo = new TeclaDo();
//        TeclaRe tre = new TeclaRe();
//        TeclaMi tmi = new TeclaMi();
//        TeclaFa tfa = new TeclaFa();
//        TeclaSol tsol = new TeclaSol();        
//        TeclaLa tla = new TeclaLa();        
//        TeclaSi tsi = new TeclaSi();     
//        
//        p.setTeclaDo(tdo);
//        p.setTeclaRe(tre);
//        p.setTeclaMi(tmi);
//        p.setTeclaFa(tfa);
//        p.setTeclaSol(tsol);
//        p.setTeclaLa(tla);
//        p.setTeclaSi(tsi);        

        //J j = new JV();
        J j = new JH();
        p.j = j;

//        p.j.tdo = tdo;
//        p.j.tre = tre;
//        p.j.tmi = tmi;
//        p.j.tfa = tfa;
//        p.j.tsol = tsol;
//        p.j.tla = tla;
//        p.j.tsi = tsi;
        p.j.initC();
    }

}
