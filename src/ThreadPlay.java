/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
import java.io.*;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ThreadPlay extends Thread {

    private String filename; // The name of the file to play
    private boolean finished; // A flag showing that the thread has finished

    public ThreadPlay(String fname) {
        filename = fname;
        finished = false;
    }

    public static void main(String[] args) {
        ThreadPlay s1 = new ThreadPlay(Constantes.RUTA + "do.wav");
        ThreadPlay s2 = new ThreadPlay(Constantes.RUTA + "mi.wav");
        s1.start();
        s2.start();

        while (!s1.finished || !s2.finished);

        System.exit(0); // Java Sound bug fix...
    }

    public void run() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filename));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            //clip.loop(Clip.LOOP_CONTINUOUSLY); // There are several different amounts of time you can loop it, so you can change this if you want, or you can just use clip.stop() whenever you want.
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
