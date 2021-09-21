import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Los primeros dos arrays son formas de inicializar
        int [] array1;
        array1 = new int[] {1,2,3,4,5};
        int [] array2 = {1,2,3,4,5};

        //El ejercicio inicia aqui.
        int [] array3 = new int[5];
        int [] array4 = new int[5];
        for (int i = 0; i<5; i++){
            array4[i] = (int) (Math.random()*10);
        }
        //Impresion
        System.out.println("***Array 1***");
        for(int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }
        System.out.println("***Array 2***");
        for (int j : array4) {
            System.out.println(j);
        }
        //Otra forma de impresion podria ser:
        System.out.println("***Array 3***");
        System.out.println(Arrays.toString(array1));

    }
}
