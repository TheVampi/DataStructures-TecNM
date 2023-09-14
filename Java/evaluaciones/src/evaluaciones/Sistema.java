package evaluaciones;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 *
 * @author luisi
 */
public class Sistema {
    
    //Este es un metodo para generar aleatorios
    public int aleatorio(int numMenor, int numMayor) {
        int num;
        num = (int) (Math.random() * (numMayor - numMenor + 1)) + numMenor;
        return (num);
    }

    public void escribirArchivo(ArrayList arr, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            for(int i = 0 ; i<arr.size();i++){
                
            }
        } catch (Exception ex) {

        }

    }

}
