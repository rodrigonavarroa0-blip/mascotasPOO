import java.util.*;

public class perro extends Mascota {

    // =========================
    // ATRIBUTOS ESPECÍFICOS DE PERRO
    // =========================
    
    private String raza;
    private double altura;
    private int edad;
    

    // =========================
    // CONSTRUCTOR
    // =========================
    // Se ejecuta automáticamente al crear el objeto

    public perro(String raza, String nombre, double altura, int peso, int edad, boolean vacunado) {
        
        // Llamar al constructor de la clase padre
        super(nombre, peso, vacunado);
        
        this.raza = raza;
        this.altura = altura;
        this.edad = edad;
    }

    // =========================
    // SETTERS Y GETTERS
    // =========================

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

    // =========================
    // MÉTODO PARA MOSTRAR DATOS
    // =========================

    
    public void mostrarDatos() {

        System.out.println("\n===== DATOS DEL PERRO =====");

        System.out.println("La raza de " + nombre + " es: " + raza);

        System.out.println("El peso de " + nombre + " es: "
                + peso + " kg");

        System.out.println("La altura de " + nombre + " es: "
                + altura + " metros");

        System.out.println("La edad de " + nombre + " es: "
                + edad + " año/s");


        if (vacunado) {

            System.out.println(nombre + " está vacunado");

        } else {

            System.out.println(nombre + " no está vacunado");
        }
    }

    // =========================
    // MÉTODOS DEL OBJETO
    // =========================

    public void ladrar() {

        System.out.println("Waff waff");
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean vacuna1;

        // PEDIR DATOS

        System.out.println("Dime la raza del primer perro:");
        String raza1 = sc.nextLine();

        System.out.println("Dime el nombre del primer perro:");
        String nombre1 = sc.nextLine();

        System.out.println("Dime el peso del primer perro:");
        int peso1 = sc.nextInt();

        System.out.println("Dime la altura del primer perro:");
        double altura1 = sc.nextDouble();

        System.out.println("Dime la edad del primer perro:");
        int edad1 = sc.nextInt();

        System.out.println("¿Está vacunado? (1 = sí, 0 = no)");
        int tof = sc.nextInt();

        // CONVERTIR int -> boolean

        if (tof == 1) {

            vacuna1 = true;

        } else {

            vacuna1 = false;
        }

        // CREAR OBJETO

        perro perro1 = new perro(
                raza1,
                nombre1,
                altura1,
                peso1,
                edad1,
                vacuna1
        );

        // USAR MÉTODOS DEL OBJETO

        perro1.ladrar();
        perro1.comer();
        perro1.dormir();
        perro1.mostrarDatos();


        System.out.println("Quieres cambiar los valores del perro? (1 = sí, 0 = no)");
 int tof2 = sc.nextInt();
 if (tof2 == 1) {
System.out.println("    ¿Qué quieres cambiar? (1 = raza, 2 = peso, 3 = altura)");
int opcion = sc.nextInt();
switch (opcion) {
    case 1:
        System.out.println("Dime la nueva raza del perro:");
        sc.nextLine(); // Limpiar el buffer
        String nuevaRaza = sc.nextLine();
        perro1.setRaza(nuevaRaza); // Actualizar el nombre también
        break;
    case 2:
        System.out.println("Dime el nuevo peso del perro:");
        int nuevoPeso = sc.nextInt();
        perro1.setPeso(nuevoPeso);
        break;
    case 3:
        System.out.println("Dime la nueva altura del perro:");
        double nuevaAltura = sc.nextDouble();
        perro1.setAltura(nuevaAltura);
        break;
    }
    sc.close();
}
}
}
