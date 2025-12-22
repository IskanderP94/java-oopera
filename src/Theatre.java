public class Theatre {

    public static void main(String[] args) {

        Actor actor0 = new Actor("Брэд", "Питт",
                Gender.МУЖСКОЙ, 180);
        Actor actor1 = new Actor("Леонардо", "Ди Каприо",
                Gender.МУЖСКОЙ, 183);
        Actor actor2 = new Actor("Энтони", "Хопкинс",
                Gender.МУЖСКОЙ, 175);
        Actor actor3 = new Actor("Юрий", "Никулин", Gender.МУЖСКОЙ, 179);

        Director director0 = new Director("Мартин", "Скорсезе",
                Gender.МУЖСКОЙ, 100);
        Director director1 = new Director("Кристофер", "Нолан",
                Gender.МУЖСКОЙ, 50);
        MusicalShow.musicAuthor = "Эннио Морриконе";
        Ballet.choreographer = "Вацлав Резингер";

        Show show = new Show("Преступление и наказание", 150,
                director0);

        Opera opera = new Opera("Кольцо Нибелунгов", 900, director0,"Рихард Вагнер",
                "Цикл из четырёх немецкоязычных музыкальных эпических драм", 110);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1,"Чайковский",
                "Зигфрид встречает девушку-лебедя Одетту и влюбляется в неё.",
                "Вацлав Резингер");

        show.addAnActor(actor0);
        show.addAnActor(actor1);

        opera.addAnActor(actor1);
        opera.addAnActor(actor2);

        ballet.addAnActor(actor0);
        ballet.addAnActor(actor2);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.changeActor(actor3, actor0.surname);
        show.printActors();

        opera.changeActor(actor0, actor3.surname);
        opera.printActors();

        opera.printLibretto();
        ballet.printLibretto();

    }
}
