package facade;

public class Main {
    public static void main(String[] args){
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        Screen screen = new Screen("Theater Screen");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen);
        homeTheater.watchMovie("베테랑 2");
        homeTheater.endMovie();
    }
}
