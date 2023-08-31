package colecciondin;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;


public class ColeccionDin {

    
    public static void main(String[] args) {
        /*ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b= new ArrayList<>();
        a.add("OnePlus");
        a.add("Apple");
        a.add("Samsung");
        
        b.add("Motorola");
        b.add("Xiaomi");
        
        b.addAll(a);*/
        //Array List concatena valores, no ordena y SI muestra los repetidos
        
        //TreeSet ordena y omite repetidos   
        TreeSet<String> aTree = new TreeSet<>(); 
        TreeSet<String> bTree = new TreeSet<>();
        
        aTree.add("OnePlus");
        aTree.add("Apple");
        aTree.add("Samsung");
        
        bTree.add("Motorola");
        bTree.add("Xiaomi");
        bTree.add("Samsung");
        
        bTree.addAll(aTree);
        
          
        System.out.println(bTree);
        
        //Hash set junta, elimina los repetidos, pero no los ordena
        HashSet<String> aHash = new HashSet<>(); 
        HashSet<String> bHash = new HashSet<>();
        aHash.add("OnePlus");
        aHash.add("Apple");
        aHash.add("Samsung");
        
        bHash.add("Motorola");
        bHash.add("Xiaomi");
        bHash.add("Samsung");
        System.out.println(bHash);
        
        Set<Integer> aSet = new HashSet<Integer>();
        Set<Integer> bSet = new HashSet<Integer>();
        //Se implementa union utilizando set, une los conjuntos y NO los repite
        aSet.addAll(Arrays.asList(1,2,3,4,5,6));
        bSet.addAll(Arrays.asList(5,6,7,8,9,10));
        
        Set<Integer> union = new HashSet<Integer>();
        union.addAll(aSet);
        union.addAll(bSet);
        System.out.println(union);
        //Ahora diferencia
        Set<Integer> diferencia = new HashSet<Integer>();
        diferencia.addAll(aSet);
        diferencia.removeAll(bSet);
        System.out.println(diferencia);
        
        //Ahora interseccion
        Set<Integer> interseccion= new HashSet<Integer>();
        interseccion.addAll(aSet);
        interseccion.addAll(bSet);
        interseccion.retainAll(bSet);
        System.out.println(interseccion);
        
        //Sacando complemento de A
        Set<Integer> complemento= new HashSet<Integer>();
        complemento.addAll(bSet);
        complemento.remove(aSet);
        System.out.println(complemento);
        
    }
    
}
