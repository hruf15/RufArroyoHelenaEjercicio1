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
                System.out.println("¡ERROR! Carácter no válido.\nIntroduce de nuevo un número");
                input.nextLine();
            }
        }
        System.out.println("Has escogido " + numeroFilas + " filas");

        while (numeroColumnas < 1 || numeroColumnas > 9) {
            System.out.println("Introduce número de columnas del 1-9: ");
            if (input.hasNextInt()) {
                numeroColumnas = input.nextInt();
                if (numeroColumnas < 1 || numeroColumnas > 9) {
                    System.out.println("Has escogido un número incorrecto.\nPor favor, vuelve a introducir un número entre 1 y 9.");
                }
            } else {
                System.out.println("¡ERROR! Carácter no válido.");
                System.out.println("Introduce de nuevo un número");
                input.next();
            }
        }
            System.out.print("Has escogido " + numeroColumnas + " columnas");
                input.nextLine();

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
                System.out.println("Presiona enter para continuar");
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
                                int x = 0;
                                int y = 0;
                                /*while (x < 1 || y > 9) {
                                    System.out.println("Introduce dos coordenadas para hacer explotar la bomba.\n Recuerda que debe ser un número del 1-9");
                                    if (input.hasNextInt()) {
                                        x = input.nextInt();
                                        if (x < 1 || x > 9) {
                                            System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero del 1-9"); */
                                while (x < 1 || x > 9) {
                                    System.out.println("Introduce la primera coordenada detonar la bomba:   ");
                                     if (input.hasNextInt()) {
                                        x = input.nextInt();
                                        if (x < 1 || x > 9) {
                                            System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero del 1-9");
                                        }
                                    }
                                }
                                while (y < 1 || y > 9) {
                                    System.out.println("Introduce la segunda coordenada para detonar la bomba:   ");
                                    if (input.hasNextInt()) {
                                        y = input.nextInt();
                                        if (y < 1 || y > 9) {
                                            System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero del 1-9");
                                        }
                                    } //desde aqui tengo pendiente añadir la explosión de la bomba
                                }
                                break;
                            case 1:
                                System.out.println("¡Aquí tienes tu matriz!");
                                for (int i = 0; i < array.length; i++) {
                                    for (int j = 0; j < array[i].length; j++) {
                                        System.out.print(array[i][j] + " ");
                                                                           }
                                    System.out.println();
                                }
                                break;
                            case 0:
                                System.out.println("¡Hasta Luego!");
                                exit = true;
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

