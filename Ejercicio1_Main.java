package programacionii_semanaiv;

/**
 * 4
 *
 * @author Gianina
 */
public class Ejercicio1_Main {

    public static void main(String[] args) {

       
            // Instancio empleados con constructor completo (id, nombre, puesto, salario)
            Empleado empleado1 = new Empleado(1, "Mateo López", "Programador", 20000);
            Empleado empleado2 = new Empleado(2, "Gianina Azcurra", "Programadora", 20000);
            Empleado empleado3 = new Empleado(3, "Felipe Acosta", "Project Manager", 40000);

            // Instancio empleados con constructor que asigna id automático y salario por defecto
            Empleado empleado4 = new Empleado("Maximiliano Rodriguez", "Scrum Master");
            Empleado empleado5 = new Empleado("Jimena Monteverde", "CM");

            // Aplicando aumentos de salario
            empleado1.actualizarSalario(50);   // 50% de aumento
            empleado2.actualizarSalario(5);    // 5% de aumento
            empleado3.actualizarSalario(200);  // 200% de aumento
            empleado4.actualizarSalario(100);  // 100% de aumento
            empleado5.actualizarSalario(5000); // aumento fijo

            // Imprimiendo información de cada empleado
            System.out.println(empleado1);
            System.out.println(empleado2);
            System.out.println(empleado3);
            System.out.println(empleado4);
            System.out.println(empleado5);

            // Mostrando el total de empleados
            Empleado.mostrarTotalEmpleados();
        }
    }

