package programacionii_semanaiv;

/**
 *
 * @author Gianina
 */
public class Empleado {

    //Declaro los atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    //Constructor 1: recibe todos los parámetros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    //Constructor 2: recibe nombre y puesto, asigno salario x defecto y un id cada vez q se incrementa el totalempleados
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 10.000;
        totalEmpleados++;
        this.id = totalEmpleados;

    }
    
    //Agrego Getters y Setters
    
    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getPuesto() {
        return puesto;
    }

    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

   
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }

   
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    
    public static void setTotalEmpleados(int aTotalEmpleados) {
        totalEmpleados = aTotalEmpleados;
    }
    
  
//Métodos sobrecargados
    public void actualizarSalario( double porcentaje){
       double aumento = salario / (porcentaje / 100);
       salario += aumento;
}

    public void actualizarSalario(int cantidad) {
        salario += cantidad;
    }
    
    public static void mostrarTotalEmpleados(){
        System.out.println("La cantidad de empleados es de: " + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
}
