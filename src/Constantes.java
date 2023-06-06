
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class Constantes {
		/*
		* Cambiar las rutas de para relacionar los archivos en el directorio
		*	formato : "C:\\Users\\profesor\\..."
		*/
    //public static String RUTA = "/home/usuario/Downloads/HelloProject/src/";
    public static String RUTA = "C:\\Users\\ANTHONY\\Documents\\LPOO\\HelloPianoProject\\src\\";
    public static String RUTAIMG = "C:\\Users\\ANTHONY\\Documents\\LPOO\\HelloPianoProject\\src\\";
    public static ArrayList<String> arrnotas = new ArrayList<String>();

    Constantes() {
        arrnotas.add("Do");
        arrnotas.add("Re");
        arrnotas.add("Mi");
        arrnotas.add("Fa");
        arrnotas.add("Sol");
        arrnotas.add("La");
        arrnotas.add("Si");
    }
}
