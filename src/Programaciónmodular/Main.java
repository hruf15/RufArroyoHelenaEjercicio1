package Programaciónmodular;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {
        System.out.println("Bienvenid@ a AboutMe 😊");

        Perfil helena = new Perfil();
        helena.setName("Helena Ruf Arroyo");
        helena.setStory("\n - Educadora y Trabajadora Social.\n - Estudiante de DAM \n - Tengo 27 años");

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("🎾 Padel");
        hobbies.add("📺 Series");
        hobbies.add("🐈 Animales");
        hobbies.add("🛩️ Viajar");
        hobbies.add("🙏 Compartir tiempo con amigos");
        helena.setHobbies(hobbies);

        ArrayList<String> food = new ArrayList<>();
        food.add("🍝 Comida italiana");
        food.add("🍜 comida tailandesa");
        food.add("🌮 comida mejicana");
        helena.setFoods(food);

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("🎼 Fan de Taylor Swift");
        funFacts.add("Tengo 4 animales de compañía: 😺Kweetnie 😸Croqueta 😼Viruta 🐶Arya");
        funFacts.add("🍕 me gusta cocinar pizzas");
        helena.setFunFacts(funFacts);

        System.out.println("\nA continuación te mostramos la información de tu perfil:\n");
        System.out.println(helena.toString());
        System.out.print("");

        ArrayList<Perfil> perfiles = new ArrayList<>();
        perfiles.add(helena);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú AboutMe [" + helena.getName() + "]");
            System.out.println("[1] 📖 Story ");
            System.out.println("[2] 🎳 Hobbies ");
            System.out.println("[3] 🍕 Foods ");
            System.out.println("[4] 😂 Fun Facts ");
            System.out.println("[5] 📤 Salir ");
            System.out.println("Selecciona una opción: ");

            if (scanner.hasNextInt()) {
                int opcionMenu = scanner.nextInt();
                scanner.nextLine();

                switch (opcionMenu) {
                    case 1:
                        System.out.println("\nStory: " + helena.getStory());
                        break;
                    case 2:
                        System.out.println("\nHobbies: " + helena.getHobbies());
                        break;
                    case 3:
                        System.out.println("\nFoods: " + helena.getFoods());
                        break;
                    case 4:
                        System.out.println("\nFun Facts" + helena.getFunFacts());
                        break;
                    case 5:
                        System.out.println(("Gracias por visitar el perfil. Hasta pronto 🙌"));
                        exit = true;
                        break;
                }
            }else{
                System.out.println("Opción no válida. Ingresa un número del 1-5");
                scanner.nextLine();
            }
        }
    }
}