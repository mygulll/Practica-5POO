import java.awt.*;

public class AngryBirds {
    String nombre;
    int indiceDeAtaque;
    float eficaciaDeAtaque;
    String color;
    float velocidad; //km/hr
    float indiceDeVida;
    String categoria;

    public AngryBirds(String nombre, int indiceDeAtaque) {
        setNombre(nombre);
        setIndiceDeAtaque(indiceDeAtaque);
        this.eficaciaDeAtaque = (float)(Math.random()*100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndiceDeAtaque() {
        return indiceDeAtaque;
    }

    public void setIndiceDeAtaque(int indiceDeAtaque) {
        this.indiceDeAtaque = indiceDeAtaque;
    }

    public float getEficaciaDeAtaque() {
        return eficaciaDeAtaque;
    }

    public void setEficaciaDeAtaque(float eficaciaDeAtaque) {
        this.eficaciaDeAtaque = eficaciaDeAtaque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getIndiceDeVida() {
        return indiceDeVida;
    }

    public void setIndiceDeVida(float indiceDeVida) {
        this.indiceDeVida = indiceDeVida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void imprimirCaracteristicas(){
        System.out.println("*** Tipo de pajaro "+ getCategoria()+" ***");
        System.out.println("Nombre: "+getNombre()+"\nIndice de Ataque: "+getIndiceDeAtaque()+"\nVelocidad: "+getVelocidad()
        +"\nColor: "+ getColor());
    }
}
