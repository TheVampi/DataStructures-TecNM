
package evaluaciones;

import static evaluaciones.Proyecto.ruta;
import static evaluaciones.Proyecto.separador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Proyectos extends Proyecto{
    ArrayList <Proyecto> lista = new ArrayList<>();
    public Proyectos(){
        
    }
    public Proyectos(String v_folio){
        super (v_folio);
    }
    public void getAll(){
        try ( BufferedReader bufferLectura = new BufferedReader(new FileReader(ruta))) {
            String linea = bufferLectura.readLine();
            while (linea != null) {
                String[] campos = new String[4];
                campos = linea.split(separador);
                this.folio = campos[0];
                lista.add(new Proyecto(this.folio));
                //Sirve para romper el ciclo:
                linea = bufferLectura.readLine();
            } 
        } catch (Exception ex) {
            
        }
    }
    
}
