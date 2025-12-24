public class Director extends Person {
    protected int numberOfShows;

    public Director(String name, String surname, Gender gender,
                    int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    //метод для печати инфо о режиссере
    public void printDirector(Director director) {
        System.out.println(director.toString());
    }

    @Override
    public String toString() {
        return "Имя = " + name + "\n" +
                "Фамилия = " + surname + "\n";
    }
}
