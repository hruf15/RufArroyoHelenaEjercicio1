package Programaciónmodular;

import java.util.ArrayList;

public class Perfil {

    private String name;
    private String story; //video demo I hay que añadir aqui CODE-GENERATE- TO STRING PARA LUEGO LLAMAR AL CODIGO (helena.toString()
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;

    @Override
    public String toString() {
        return "Perfil{" +
                "name='" + name + '\'' +
                ", story='" + story + '\'' +
                ", hobbies=" + hobbies +
                ", foods=" + foods +
                ", funFacts=" + funFacts +
                '}';
    }


    public Perfil (String name, String story, ArrayList<String> hobbies, ArrayList<String> foods, ArrayList<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStory(String story) {
        this.story = story;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }

    public void setFunFacts(ArrayList<String> funFacts) {
        this.funFacts = funFacts;
    }
}