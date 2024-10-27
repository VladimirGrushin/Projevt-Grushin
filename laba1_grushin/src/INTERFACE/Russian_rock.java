package INTERFACE;

public class Russian_rock implements IMUSIC{
    private char instrument;

    @Override
    public void set_musical_instruments(char set) {
        this.instrument = set;
    }

    @Override
    public void rhythm() {
        System.out.println("pupupuu pu pupupu");
    }

    @Override
    public boolean is_popular() {
        return true;
    }
}
