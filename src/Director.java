public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender,
                    int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
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
