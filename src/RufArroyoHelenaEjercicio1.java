import java.util.Random;
import java.util.Scanner;
public class RufArroyoHelenaEjercicio1 {
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

        int[][] matriz = new int[(numeroFilas)][(numeroColumnas)];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(9 + 1 - 1) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        {
            System.out.println("Presiona enter para continuar");
            input.nextLine();
            boolean exit = false;
            int opcionMenu;

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
                            int filasEscogidas = -1;
                            int columnasEscogidas = -1;
                            while (filasEscogidas < 0 || filasEscogidas > (numeroFilas-1)) {
                                System.out.println("Introduce la primera coordenada detonar la bomba entre 0 - " + (numeroFilas - 1));
                                if (input.hasNextInt()) {
                                    filasEscogidas = input.nextInt();
                                    if (filasEscogidas < 0 || filasEscogidas >= (numeroFilas - 1)) {
                                        System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero entre 0 - " + (numeroFilas - 1));
                                         input.nextInt();
                                    }
                                } else {
                                    System.out.println("El número/carácter introducido no es válido");
                                    input.next();
                                }
                            }
                            while (columnasEscogidas <= 0 || columnasEscogidas >= numeroColumnas) {
                                System.out.println("Introduce la segunda coordenada para detonar la bomba entre 0 - " + (numeroColumnas - 1));
                                if (input.hasNextInt()) {
                                    columnasEscogidas = input.nextInt();
                                    if (columnasEscogidas < 0 || columnasEscogidas >= numeroColumnas) {
                                        System.out.println("Has escogido un numero incorrecto.\nPor favor vuelve a introducir un numero entre 0 - " + (numeroColumnas - 1));
                                        break;
                                    }
                                } else {
                                    System.out.println("El número/carácter introducido no es válido");
                                    input.next();
                                }
                            }
                            int valorColumna = 0;
                            int valorFila = 0;
                            for (int i = 0; i < matriz[filasEscogidas].length; i++) {
                                valorFila += matriz[filasEscogidas][i];
                            }
                            for (int i = 0; i < matriz.length; i++) {
                                valorColumna += matriz[i][columnasEscogidas];
                            }
                            int valorBomba = valorFila + valorColumna - matriz[filasEscogidas][columnasEscogidas];
                            System.out.println("El valor de la explosión es de: " + valorBomba);

                            for (int i = 0; i < matriz.length; i++) {
                                matriz[filasEscogidas][i] = 0;
                            }

                            for (int i = 0; i < matriz.length; i++) {
                                matriz[i][columnasEscogidas] = 0;
                            }
                            System.out.println("¡Aquí tienes tu matriz después de la explosión!");
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz[i].length; j++) {
                                    System.out.print(matriz[i][j] + " ");
                                }
                                System.out.println();

                            }
                            System.out.println("Juego Finalizado\nGracias por participar");
                            exit = true;
                                break;

                        case 1:
                            System.out.println("¡Aquí tienes tu matriz!");
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz[i].length; j++) {
                                    System.out.print(matriz[i][j] + " ");
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

