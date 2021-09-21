import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BirdRojo rojo =new BirdRojo("Fueguito",35);
        BirdAmarillo amarillo = new BirdAmarillo("Estala",45);
        BirdNegro negro = new BirdNegro("Camilo", 65);
        AngryBirds[] pajarosEnojados = {rojo,amarillo,negro};

        for(int i = 0; i< pajarosEnojados.length; i++){
            pajarosEnojados[i].imprimirCaracteristicas();
        }
        System.out.println("\n\n");
        System.out.println("Habilidad especial de: "+ pajarosEnojados[0].getNombre());
        rojo.llamarada();
        System.out.println("\nHabilidad especial de: "+ pajarosEnojados[1].getNombre());
        amarillo.disparoVeloz();
        System.out.println("\nHabilidad especial de: "+ pajarosEnojados[2].getNombre());
        negro.explocion();
        
    }
}
