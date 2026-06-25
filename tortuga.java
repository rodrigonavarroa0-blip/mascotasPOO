public class tortuga extends Mascota {
    
    // =========================
    // ATRIBUTOS ESPECÍFICOS DE TORTUGA
    // =========================
    
    private String especie;
    private int edad;
    
    // =========================
    // CONSTRUCTOR
    // =========================
    
    public tortuga(String nombre, int peso, boolean vacunado, String especie, int edad) {
        super(nombre, peso, vacunado);
        this.especie = especie;
        this.edad = edad;
        
        
        
}
    // =========================
    // SETTERS Y GETTERS
    // =========================
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // =========================
    // MÉTODO PARA MOSTRAR DATOS
    // =========================
    
    public void mostrarDatos() {
        System.out.println("\n===== DATOS DE LA TORTUGA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso + " kg");
        if (vacunado) {
            System.out.println(nombre + " está vacunado");
        } else {
            System.out.println(nombre + " no está vacunado");
        }
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");

}
    
    
    public static void(String[] args) {
        
        // Crear un objeto de la clase tortuga
        tortuga tortuga1 = new tortuga("Leonardo", 5, true, "Tortuga de tierra", 50);
        
        // Mostrar los datos de la tortuga
        tortuga1.mostrarDatos();
        
        // Hacer que la tortuga coma y duerma
        tortuga1.comer();
        tortuga1.dormir();
    }
}
