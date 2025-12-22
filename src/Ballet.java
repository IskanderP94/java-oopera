import java.util.ArrayList;

public class Ballet extends MusicalShow {
    protected static String choreographer;

    public Ballet (String title, int duration, Director director, String musicAuthor,
                   String librettoText, String choreographer) {
        super (title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
    @Override
    public void printActors() {
        System.out.println("Список актеров балета:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }

}
