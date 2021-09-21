public class Ejercicio3 {
    public static void main(String[] args) {

        Avisos[] avisosArray1 = new Avisos[3];
        for(int i = 0; i < avisosArray1.length; i++){
           avisosArray1[i] = new Avisos();
        }

        Avisos[] avisosArray2 = new Avisos[] {new Avisos(), new Avisos(), new Avisos()};

    }
}

class Avisos{
    public static int cantidadDeClases = 0;
    public Avisos() {
        cantidadDeClases++;
        System.out.println("Se ha creado la clase aviso No. "+cantidadDeClases);
    }
}
