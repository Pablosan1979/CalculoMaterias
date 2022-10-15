
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author santa
 */
public class operaciones {

    //creamos el metodo para hacer la conexion con el metodo main.
    public void calcular() {
        int cantidadEstudiantes = 0;
        int materia = 0;
        double nota = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita la cantidad de estudiantes: ");
        cantidadEstudiantes = entrada.nextInt();
        // elaboracion Do While para ingreso de notas de las materias.
        int cuentaMaterias = 0;
        do {
            // manejo de excepciones
            try {
                System.out.println("Digite el numero de la materia: ");
                System.out.println("1. Matematicas");
                System.out.println("2. Español");
                System.out.println("3. Ingles");
                materia = entrada.nextInt();
                switch (materia) {
                    //Caso 1 para matematicas
                    case 1: {
                        double sumaNota = 0, promedio = 0;
                        for (int cuenta = 1; cuenta <= cantidadEstudiantes; cuenta++) {
                            System.out.println("Ingrese la nota del estudiante: " + cuenta);
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                sumaNota = sumaNota + nota;
                            }
                        }//cierre de ciclo for
                        promedio = sumaNota / cantidadEstudiantes;
                        System.out.println("El promedio de la materia de matematicas es: " + promedio);
                        break;
                    }//cierre case 1
                    // caso 2 para materia Español
                    case 2: {
                        double sumaNota = 0, promedio = 0;
                        for (int cuenta = 1; cuenta <= cantidadEstudiantes; cuenta++) {
                            System.out.println("Ingrese la nota del estudiante: " + cuenta);
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                sumaNota = sumaNota + nota;
                            }
                        }//cierre de ciclo for
                        promedio = sumaNota / cantidadEstudiantes;
                        System.out.println("El promedio de notas de la materia de Español es: " + promedio);
                        break;
                    } //cierre case 2
                    // caso 3 para materia Ingles
                    case 3: {
                        double sumaNota = 0, promedio = 0;
                        for (int cuenta = 1; cuenta <= cantidadEstudiantes; cuenta++) {
                            System.out.println("Ingrese la nota del estudiante: " + cuenta);
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                sumaNota = sumaNota + nota;
                            }
                        }//cierre de ciclo for
                        promedio = sumaNota / cantidadEstudiantes;
                        System.out.println("El promedio de notas de la materia de ingles es: " + promedio);
                        break;
                    }
                }
                cuentaMaterias += 1;
            } catch (Exception e) {
                System.out.println("Debe usar la coma para los decimales. :)");
                break;
            }
        } // cierre ciclo Do
        while (cuentaMaterias < 3);
    }
}
