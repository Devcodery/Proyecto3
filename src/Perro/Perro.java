package Perro;

public class Perro {
        // atributos
        String nombre;
        int edad;

        // constructor
        public Perro(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // método
        public void ladrar() {
            System.out.println(nombre + " está ladrando");
        }

}
