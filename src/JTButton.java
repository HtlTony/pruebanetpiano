
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Profesor
 */
public class JTButton extends JButton {

    Tecla t;

    JTButton() {

    }

    JTButton(String aaa) {
        super(aaa);
    }

    public void setTecla(Tecla t) {
        this.t = t;
    }
}
