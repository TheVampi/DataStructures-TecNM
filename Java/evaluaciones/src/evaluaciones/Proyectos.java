package evaluaciones;

import static evaluaciones.Proyecto.ruta;
import static evaluaciones.Proyecto.separador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Proyectos extends Proyecto {

    ArrayList<Proyecto> lista = new ArrayList<>();

    public Proyectos() {
    }

    public Proyectos(String v_folio) {
        super(v_folio);
    }

    public void getAll() {
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

    public void getAllEmpresa(String v) {
        lista.clear();
        try ( BufferedReader bufferLectura = new BufferedReader(new FileReader(ruta))) {
            String linea = bufferLectura.readLine();
            while (linea != null) {
                String[] campos = new String[4];

                campos = linea.split(separador);
                if (v.equals(campos[1])) {
                    this.folio = campos[0];
                    lista.add(new Proyecto(this.folio));
                }

                //Sirve para romper el ciclo:
                linea = bufferLectura.readLine();
            }
        } catch (Exception ex) {

        }
    }

    public void writeAll() {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (int i = 0; i < lista.size(); i++) {
                String s = String.format("%s|%s|%s|%s\n",
                        lista.get(i).getFolio(),
                        lista.get(i).getEmpresa(),
                        lista.get(i).getProyecto(),
                        String.valueOf(lista.get(i).getMonto()));
                bw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
