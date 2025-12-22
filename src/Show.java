import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    //метод для печати актеров
    public void printActors() {
        System.out.println("Список актеров спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();

    }

    //метод для добавления актера
    public void addAnActor(Actor actor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(actor);
            return;
        }
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            return;
        }
        for (Actor actor1 : listOfActors) {
            if (actor1.equals(actor)) {
                System.out.println("Такой актёр уже есть!");
            }
        }
    }

    //метод для замены актера
    public void changeActor(Actor actor, String surname) {
        for (Actor actor1 : listOfActors) {
            if (!actor1.surname.equals(surname)) {
                System.out.println("Такого актера в списке нет!" + "\n");
                return;
            } else {
                listOfActors.remove(actor1);
                listOfActors.add(actor);
                return;

            }
        }
    }
}

