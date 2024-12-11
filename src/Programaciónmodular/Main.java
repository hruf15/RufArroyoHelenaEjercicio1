package Programaciónmodular;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {
        System.out.println("Bienvenid@ a AboutMe 😊");

        Perfil helena = new Perfil();
        helena.setName("Helena");
        helena.setStory("\n - Educadora y Trabajadora Social.\n - Estudiante de DAM \n - Tengo 27 años");

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Padel");
        hobbies.add("Series");
        hobbies.add("Animales");
        hobbies.add("Viajar");
        hobbies.add("Compartir tiempo con amigos");
        helena.setHobbies(hobbies);

        ArrayList<String> food = new ArrayList<>();
        food.add("Comida italiana");
        food.add("comida tailandesa");
        food.add("comida mejicana");
        helena.setFoods(food);

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("Fan de Taylor Swift");
        funFacts.add("Tengo 4 animales de compañía");
        funFacts.add("me gusta cocinar pizzas");
        helena.setFunFacts(funFacts);

        System.out.println("\nA continuación te mostramos la información de tu perfil:\n");
        System.out.println(helena.toString());
        System.out.print("");

        ArrayList<Perfil> perfiles = new ArrayList<>();
        perfiles.add(helena);

    }
}
/*
        boolean exit = false;
        int menuConsola;

        /*
        do {
            System.out.println("Menú AboutMe");
            System.out.println("[1] Story ");
            System.out.println("[2] Favorites ");
            System.out.println("[3] Fun Fact ");
            System.out.println("[4] Salir ");

            if (input.hasNextInt()) {
                menuConsola = input.nextInt();
                input.nextLine();
                switch (menuConsola) {

                }
            }
        }
    }
    } */