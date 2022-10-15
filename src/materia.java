
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author santa
 */
public class materia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mensaje de inicio para indicar que realiza el aplicativo
        String salto = System.getProperty("line.separator"); //agregamos un salto de linea para facilitar la lectura de la cadena de texto.
        System.out.println("Aplicacion que permite obtener el promedio de notas" + salto + "de acuerdo con la cantidad de estudiantes de una materia");
        //creamos el metodo para hacer la conexion con el metodo main.
        int cantEst; //declaramos la variable cantidadEstutiantr
        int mat; //declaramos la variable mat= materia
        double nota; //Decalramos la 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita la cantidad de estudiantes: ");// obtenemos la cantidad de estudiantes 
        cantEst = entrada.nextInt();
        // elaboracion Do While para ingreso de notas de las materias.
        int cuentaMaterias = 0;
        do {
            // manejo de excepciones para evitar el ingreso de datos no permitidos o solicitados.
            try {
                //realizamos la seleccion de la materia
                System.out.println("Seleccione la materia: ");
                System.out.println("1. Matematicas");
                System.out.println("2. Español");
                System.out.println("3. Ingles");
                mat = entrada.nextInt();
                switch (mat) {
                    case 1 ->  {
                        double sumaNota= 0, promedio;
                        for (int cuenta = 1; cuenta <= cantEst; cuenta++) {
                            System.out.println("Ingrese la nota del estudiante: " + cuenta);
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                sumaNota += nota;
                            }
                        }//cierre de ciclo for
                        promedio = sumaNota / cantEst;
                        System.out.println("El promedio de matematicas es: " + promedio);
                    }//cierre case 1
                    case 2 ->  {
                        double sumaNota = 0, promedio;
                        for (int cuenta = 1; cuenta <= cantEst; cuenta++) {
                            System.out.println("Ingrese la nota del estudiante: " + cuenta);
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                sumaNota += nota;
                            }
                        }//cierre de ciclo for
                        promedio = sumaNota / cantEst;
                        System.out.println("El promedio de Español es: " + promedio);
                    } //cierre case 2
                    case 3 ->  {
                        double sumaNota = 0, promedio;
                        for (int cuenta = 1; cuenta <= cantEst; cuenta++) {
                            System.out.println("Ingrese la nota del estudiante: " + cuenta);
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                sumaNota += nota;
                            }
                            //Cierre case 3
                        }//cierre de ciclo for
                        promedio = sumaNota / cantEst;
                        System.out.println("El promedio de ingles es: " + promedio);
                    }
                }
                //Caso 1 para matematicas
                // caso 2 para materia Español
                // caso 3 para materia Ingles
                cuentaMaterias += 1;
            } catch (Exception e) {
                System.out.println("Debe usar la coma para los decimales. :)");
                break;
            }
        } // cierre ciclo Do
        while (cuentaMaterias < 3);
    }
}// finalizacion del aplicativo
