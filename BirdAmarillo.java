public class BirdAmarillo extends AngryBirds{
    public BirdAmarillo(String nombre, int indiceDeAtaque) {
        super(nombre, indiceDeAtaque);
        setVelocidad(100);
        setColor("Amarillo");
        setCategoria("Ataque Rapido");
    }

    public void disparoVeloz(){
        System.out.println("Ha desaparecido, no lo podemos ver, Es muy rapido.");
        System.out.printf("Produce un daño acumulado por la velocidad de %.2f\n", getVelocidad()+(indiceDeAtaque * eficaciaDeAtaque));
    }
}
