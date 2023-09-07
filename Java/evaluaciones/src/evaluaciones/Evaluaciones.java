/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluaciones;

/**
 *
 * @author luisi
 */
public class Evaluaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto();
        Proyecto p2 = new Proyecto("Z","Cookiefy","Produccion galletas",100000);
        System.out.println(p2.getEmpresa());
        Proyecto p3 = new Proyecto("C");
        System.out.println(p3.getProyecto());
        Proyectos p4 = new Proyectos();
        p4.getAll();
        for (int i =0; i<p4.lista.size();i++){
            System.out.println(p4.lista.get(i).getProyecto());
        }
    }
    
}


