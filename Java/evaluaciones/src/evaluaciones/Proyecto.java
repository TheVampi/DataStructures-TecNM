package evaluaciones;

import java.io.BufferedReader;
import java.io.FileReader;

public class Proyecto extends Sistema{
    
    String folio, empresa, proyecto;
    float monto;
    static String ruta = "C:\\Users\\luisi\\Desktop\\DataStructures-TecNM\\Java\\evaluaciones\\proyectos.csv";
    static String separador = "\\|";
    
    //Constructores
    public Proyecto() {
    }
    
    public Proyecto(String v_folio, String v_empresa, String v_proyecto, float v_monto) {
        this.folio = v_folio; //La estructura tiene el siguiente formato v_empresa es el parametro que llega cuandp se lo mandamos;
        this.empresa = v_empresa;
        this.proyecto = v_proyecto;
        this.monto = v_monto;
    }
    
    
    public Proyecto(String v_folio) { 
        try ( BufferedReader bufferLectura = new BufferedReader(new FileReader(ruta))) { //Esta linea en el Buffered Reader se 
            String linea = bufferLectura.readLine(); //Aqui se lee la primer linea del archivo de proyecto
            while (linea != null) {
                String[] campos = new String[4]; //crea un arreglo de 4 elementos debido a que en cada elemento va a ir un campo
                campos = linea.split(separador);
                if (campos[0].equals(v_folio)) {
                    this.folio = campos[0];
                    this.empresa = campos[1];
                    this.proyecto = campos[2];
                    this.monto = Float.parseFloat(campos[3]);
                } 
                //Sirve para romper el ciclo:
                linea = bufferLectura.readLine(); //Esto lo que hace es saltar una linea y pues cuando llega al final del ciclo ya su valor es null
            } 
        } catch (Exception ex) {
            
        }
        
    }

    //Getters de atributos
    
    public String getFolio() {
        return this.folio;
    }
    
    public String getEmpresa() {
        return this.empresa;
    }
    
    public String getProyecto() {
        return this.proyecto;
    }
    
    public float getMonto() {
        return this.monto;
    }

    //Setters de atributos
    public void setFolio(String v_folio) {
        this.folio = v_folio;
    }
    
    public void setEmpresa(String v_empresa) {
        this.empresa = v_empresa;
    }
    
    public void setProyecto(String v_proyecto) {
        this.proyecto = v_proyecto;
    }
    
    public void setMonto(float v_monto) {
        this.monto = v_monto;
    }
    
}
