public class Theatre {

    public static void main(String[] args) {

        Actor actor0 = new Actor("Брэд", "Питт", Gender.MALE, 180);
        Actor actor1 = new Actor("Леонардо", "Ди Каприо", Gender.MALE, 183);
        Actor actor2 = new Actor("Энтони", "Хопкинс", Gender.MALE, 175);
        Actor actor3 = new Actor("Юрий", "Никулин", Gender.MALE, 179);
        Actor actor4 = new Actor("Владимир", "Никулин", Gender.MALE, 176);
        Actor actor5 = new Actor("Питер", "Питт", Gender.MALE, 178);

        Director director0 = new Director("Мартин", "Скорсезе", Gender.MALE, 100);
        Director director1 = new Director("Кристофер", "Нолан", Gender.MALE, 50);

        Person musicAuthor = new Person("Эннио", "Морриконе", Gender.MALE);

        Person choreographer = new Person("Вацлав", "Резингер", Gender.MALE);

        Show show = new Show("Преступление и наказание", 150, director0);

        Opera opera = new Opera("Кольцо Нибелунгов", 900, director0, musicAuthor,
                "Цикл из четырёх немецкоязычных музыкальных эпических драм", 180);

        Ballet ballet = new Ballet("Лебединое озеро", 140, director1, musicAuthor,
                "Зигфрид встречает девушку-лебедя Одетту и влюбляется в неё.", choreographer);

        show.addAnActor(actor0);
        show.addAnActor(actor1);

        opera.addAnActor(actor1);
        opera.addAnActor(actor2);

        ballet.addAnActor(actor0);
        ballet.addAnActor(actor2);
        ballet.addAnActor(actor5);

        show.printActors("Спектакль");
        opera.printActors("Опера");
        ballet.printActors("Балет");

        show.changeActor(actor3, actor0.surname);
        show.printActors("Спектакль");

        opera.changeActor(actor0, actor3.surname);
        opera.printActors("Опера");

        ballet.changeActor(actor4, actor0.surname);
        ballet.printActors("Балет");

        opera.printLibretto();
        ballet.printLibretto();

    }
}
