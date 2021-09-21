public class BirdNegro  extends AngryBirds{

    public BirdNegro(String nombre, int indiceDeAtaque) {
        super(nombre, indiceDeAtaque);
        setVelocidad(45);
        setColor("Negro");
        setIndiceDeVida(100);
        setCategoria("Tanque");
    }

    public void explocion(){
        System.out.println(nombre+ "Ha usado la habilidad de BlackBird Explocion!!!");
        System.out.println("Produce un 30% mas de daño\n Daño inicia: "+indiceDeAtaque+"\n Daño actual "+indiceDeAtaque*1.3);
    }
}
