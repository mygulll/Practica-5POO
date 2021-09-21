public class BirdRojo extends AngryBirds{
    float fireAttact = (float)(Math.random()*100);
    public BirdRojo(String nombre, int indiceDeAtaque) {
        super(nombre, indiceDeAtaque);
        setVelocidad(70);
        setColor("rojo");
        setCategoria("Ataque acumulativo");
    }

    public void llamarada(){
        System.out.printf("Daño por fuego activado, recibes una proporcio de daño por fuego de %.2f\n", fireAttact+indiceDeAtaque
                *eficaciaDeAtaque);
    }


}
