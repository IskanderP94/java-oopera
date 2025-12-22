import java.util.ArrayList;

public class MusicalShow extends Show {
    protected static String musicAuthor;
    protected String librettoText;

    public MusicalShow (String title, int duration, Director director, String musicAuthor,
                        String librettoText) {
        super (title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
//печатаем текст либретто (???может статичный???)
    public void printLibretto() {
        System.out.println(librettoText);
    }
}
