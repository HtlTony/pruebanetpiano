
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
public abstract class Orejas implements ActionListener {

    Tecla t = null;

    public void add(Tecla t) {
        this.t = t;
    }

    @Override
    abstract public void actionPerformed(ActionEvent e);

}
