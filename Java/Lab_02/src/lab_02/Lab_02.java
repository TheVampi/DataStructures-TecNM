package lab_02;

public class Lab_02 {

    public static void main(String[] args) {
        //Asignando los arrays en un string
        String var_u = "1,2,3,4,5,6,7,8,9,10,11,12,13,14";
        String var_a = "2,4,6,8,10,12,14";
        String var_b = "1,2,3,5,8,13";
        String var_c = "1,2,4,6,7,10,11,13";

        //Quitando las comas y asignandolos a su arreglo
        String[] conjunto_u = var_u.split("\\,");
        
        String[] conjunto_a = var_a.split("\\,");
        String[] conjunto_b = var_b.split("\\,");
        String[] conjunto_c = var_c.split("\\,");
        

        //Mostrando el array u
        mostrar(conjunto_u, "Conjunto U");

        //Mostrando el array a
        mostrar(conjunto_a, "Conjunto A");

        //Mostrando el array b
        mostrar(conjunto_b, "Conjunto B");

        //Mostrando el array c
        mostrar(conjunto_c, "Conjunto C");
        
        //EJERCICIO #1
        mostrar(complemento(conjunto_a,conjunto_u),"Ejercicio #1 Complemento de A");
    }

    //Metodo para mostrar arrays
    static void mostrar(String[] array, String text) {
        System.out.println(text);
        for (String v : array) {
            if (v != null) {
                System.out.println(v);
            }

        }
    }

    //Metodo para sacar complemento
    static String[] complemento(String[] arr, String[] uni) {
        String[] newArr = new String[uni.length];
        newArr = uni;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < uni.length; j++) {
                if (arr[i].equals(uni[j])) {
                    newArr[j] = null;
                }

            }
        }

        return (newArr);
    }

}
