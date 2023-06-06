
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class OrejasMi extends Orejas {

//    public void add(Tecla t) {
//        this.t = t;
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Oreja MI <<< " + this.getClass().getName() + " >>>");
        //por herencia 
        t.play();
    }
}
