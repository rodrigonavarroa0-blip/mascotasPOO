import java.util.Scanner;

public class Mascota {

    protected String nombre;
    protected int peso;
    protected boolean vacunado;
    
    // =========================
    // CONSTRUCTOR
    // =========================
    public Mascota(String nombre, int peso, boolean vacunado) {
        this.nombre = nombre;
        this.peso = peso;
        this.vacunado = vacunado;
    }
    
    // =========================
    // SETTERS Y GETTERS
    // =========================
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public boolean isVacunado() {
        return vacunado;
    }
    
    // =========================
    // MÉTODO PARA MOSTRAR DATOS
    // =========================
    
    public void mostrarDatos() {
        System.out.println("\n===== DATOS DE LA MASCOTA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso + " kg");
        if (vacunado) {
            System.out.println(nombre + " está vacunado");
        } else {
            System.out.println(nombre + " no está vacunado");
        }
    }

    public void comer() {
        System.out.println("Niam niam");
    }

    public void dormir() {
        System.out.println("Z Z Z Z...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crear una mascota");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Peso (kg): ");
        int peso = sc.nextInt();

        System.out.print("¿Vacunado? (1 = sí, 0 = no): ");
        boolean vacunado = sc.nextInt() == 1;

        Mascota mascota = new Mascota(nombre, peso, vacunado);
        mascota.mostrarDatos();
        mascota.comer();
        mascota.dormir();

        sc.close();
    }
}
