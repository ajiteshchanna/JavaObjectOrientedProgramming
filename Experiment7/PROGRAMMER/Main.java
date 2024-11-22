package PROGRAMMER;

abstract class FilmEntity {
    public void debugInfo() {
        System.out.println("Debugging info for: " + this.getClass().getSimpleName());
    }

    public abstract void performRole();
}

class Director extends FilmEntity {
    private String style;

    public Director(String style) {
        this.style = style;
    }

    @Override
    public void performRole() {
        System.out.println("Directing the film with style: " + style + ".");
    }
}

class Actor extends FilmEntity {
    private String role;

    public Actor(String role) {
        this.role = role;
    }

    @Override
    public void performRole() {
        System.out.println("Performing the role of: " + role + ".");
    }
}

class Cinematographer extends FilmEntity {
    private String equipment;

    public Cinematographer(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public void performRole() {
        System.out.println("Shooting with equipment: " + equipment + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        FilmEntity director = new Director("Experimental");
        FilmEntity actor = new Actor("Protagonist");
        FilmEntity cinematographer = new Cinematographer("RED Camera");

        System.out.println("Film Production Debugging Information:");
        director.debugInfo();
        director.performRole();

        actor.debugInfo();
        actor.performRole();

        cinematographer.debugInfo();
        cinematographer.performRole();
    }
}
