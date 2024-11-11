import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bomber Man");
        Scanner input = new Scanner(System.in);

        int numeroColumnas = 0;
        int numeroFilas = 0;

        while (numeroFilas < 1 || numeroFilas > 9) {
            System.out.println("Introduce número de filas del 1-9:   ");
            if (input.hasNextInt()) {
                numeroFilas = input.nextInt();
                if (numeroFilas < 1 || numeroFilas > 9) {
                    System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero del 1-9");
                }

            } else {
                System.out.println("Carácter no válido.\nIntroduce de nuevo un número");
                input.nextLine();
            }
        }
            System.out.println("Has escogido " + numeroFilas + " filas");

            while (numeroColumnas < 1 || numeroColumnas > 9) {
                System.out.println("Introduce número de columnas del 1-9: ");
                numeroColumnas = input.nextInt();
                if (numeroColumnas < 1 || numeroColumnas > 9) {
                    System.out.println("Has escogido un número incorrecto.\nPor favor, vuelve a introducir un número entre 1 y 9.");
                }
            } /* tengo pendiente a partir de aqui crear un bucle para los caracteres no numericos */
            System.out.println("Has escogido " + numeroColumnas + " columnas");


            System.out.println("¡Muchas gracias!\nAquí tienes tu matriz:");

            int[][] array = new int[(numeroFilas)][(numeroColumnas)];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = new Random().nextInt(9 + 1 - 1) + 1;
                }
            }


            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();

            }
            {
                input.nextLine();
                boolean exit = false;
                int opcionMenu = 0;

                do {
                    System.out.println("Selecciona una opción");
                    System.out.println("[2] Poner Bomba");
                    System.out.println("[1] Mostrar Matriz");
                    System.out.println("[0] Salir");
                    if (input.hasNextInt()) {
                        opcionMenu = input.nextInt();
                        input.nextLine();
                        switch (opcionMenu) {
                            case 2:
                                System.out.println("Has seleccionado Poner Bomba");
                                break;
                            case 1:
                                System.out.println("Mostrar Matriz");
                                break;
                            case 0:
                                System.out.println("¡Hasta Luego!");
                                break;

                            default:
                                System.out.println("Error. Opción no válida");
                        }
                    } else {
                        System.out.println("Error. Opción no válida");
                        input.nextLine();
                    }
                } while (!exit);
            }
        }
    }



        /*
        for (int i = 0; i < juego.length; i++) {
        for (int j = 0; j < juego[i].length; j++) {
        System.out.print(juego[i][j] + " ");
            }
                    System.out.println();
}
*/
