/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
class TeclaLa extends Tecla {

    @Override
    public void play() {
        super.play(); //optional
        System.out.println("Tecla LA...");
//        MakeSound ms = new MakeSound();
        //ms.playSound("C:\\Users\\oscar\\Downloads\\DoReMiFaSolLaSi\\la.wav");
        new ThreadPlay(Constantes.RUTA + "la.wav").start();
    }
}
