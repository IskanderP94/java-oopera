import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    //метод для печати актеров
    public void printActors(String show) {
        switch (show) {
            case ("Спектакль"):
                System.out.println("Список актеров спектакля:");
                break;
            case ("Опера"):
                System.out.println("Список актеров оперы:");
                break;
            case ("Балет"):
                System.out.println("Список актеров балета:");
                break;
            default:
                System.out.println("Список актеров постановки:");
        }
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

    public void changeActor(Actor actor, String surname) {
        boolean isFound = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                if (isFound) {
                    System.out.println("Актёр с фамилией " + surname + " уже заменён." + "\n");
                    continue;
                }
                listOfActors.set(i, actor);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Актера с фамилией " + surname + " в списке нет!");
        }
    }
}

