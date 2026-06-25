public class gato extends Mascota {

    private String raza;
    private double altura;
    private int edad;

    public gato(String raza, String nombre, double altura, int peso, int edad, boolean vacunado) {
        super(nombre, peso, vacunado);
        this.raza = raza;
        this.altura = altura;
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getRaza() {
        return raza;
    }

    public double getAltura() {
        return altura;
    }

    public void mostrarDatos() {
        System.out.println("\n===== DATOS DEL GATO =====");
        System.out.println("La raza de " + getNombre() + " es: " + raza);
        System.out.println("El peso de " + getNombre() + " es: " + getPeso() + " kg");
        System.out.println("La altura de " + getNombre() + " es: " + altura + " metros");
        System.out.println("La edad de " + getNombre() + " es: " + edad + " año/s");
        if (isVacunado()) {
            System.out.println(getNombre() + " está vacunado");
        } else {
            System.out.println(getNombre() + " no está vacunado");
        }
    }

    public void maullar() {
        System.out.println("Miau miau");
    }
}
