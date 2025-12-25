import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<Integer> actors = new ArrayList<>();

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                actors.add(i);
            }
        }

        if (actors.isEmpty()) {
            System.out.println("Актёра с фамилией " + surname + " в списке нет!");
            return;
        }

        if (actors.size() == 1) {
            listOfActors.set(actors.get(0), actor);
            System.out.println("Актёр с фамилией " + surname + " успешно заменён.");
        } else {
            System.out.println("Найдено несколько актёров с фамилией " + surname + ":");
            for (int j = 0; j < actors.size(); j++) {
                Actor currentActor = listOfActors.get(actors.get(j));
                System.out.println((j + 1) + ". " + currentActor.name + " " + currentActor.surname);
            }
            System.out.println("Введите номер для замены (1-" + actors.size() + "):");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt() - 1;

            if (choice >= 0 && choice < actors.size()) {
                listOfActors.set(actors.get(choice), actor);
                System.out.println("Актёр успешно заменён.");
            } else {
                System.out.println("Неверный выбор.");
            }
        }
    }
}



