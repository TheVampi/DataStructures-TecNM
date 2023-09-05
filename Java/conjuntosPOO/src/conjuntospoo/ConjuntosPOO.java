package conjuntospoo;

public class ConjuntosPOO {

    public static void main(String[] args) {
        /*String u = "1,2,3,4,5,6,7,8,9,10,11,12,13,14", a = "2,4,6,8,10,12,14", b = "1,2,3,5,8,13", c = "1,2,4,6,7,10,11,13";
        System.out.println("1"+"1");*/
        // Declaramos dos strings numéricos
        String primerNumero = "10";
        String segundoNumero = "20";

        // Recorremos los strings para obtener los dígitos
        int[] digitos1 = new int[primerNumero.length()];
        int[] digitos2 = new int[segundoNumero.length()];
        for (int i = 0; i < primerNumero.length(); i++) {
            digitos1[i] = primerNumero.charAt(i) - '0';
        }
        for (int i = 0; i < segundoNumero.length(); i++) {
            digitos2[i] = segundoNumero.charAt(i) - '0';
        }

        // Sumamos los dígitos de los strings
        int[] digitosSumados = new int[digitos1.length + digitos2.length];
        int acarreo = 0;
        for (int i = 0; i < digitos1.length; i++) {
            int suma = digitos1[i] + digitos2[i] + acarreo;
            acarreo = suma / 10;
            digitosSumados[i] = suma % 10;
        }

        // Si hay acarreo, lo agregamos al final del array
        if (acarreo > 0) {
            digitosSumados[digitos1.length] = acarreo;
        }

        // Convertimos el array de dígitos a un string
        String sumaEnString = "";
        for (int i = digitosSumados.length - 1; i >= 0; i--) {
            sumaEnString += digitosSumados[i];
        }

        // Imprimimos el resultado
        System.out.println("La suma de los números es: " + sumaEnString);

    }

}

class Conjunto {

    String[] convertir(String b) {
        String[] arr = b.split("\\,");
        return (arr);
    }

    String union(String a, String b) {
        String[] a1 = convertir(a);
        String[] a2 = convertir(b);

        //Creando un nuevo arreglo resultante
        String [] res = new String[a1.length+a2.length];
        
        return (null);
    }
}
