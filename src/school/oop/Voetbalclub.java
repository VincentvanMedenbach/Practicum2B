package school.oop;

public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private final String name;


    public Voetbalclub(String name) {
        this.name = name;

    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    @Override
    public String toString() {
        return this.name + " " + this.aantalGespeeld() + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten();
    }
}
