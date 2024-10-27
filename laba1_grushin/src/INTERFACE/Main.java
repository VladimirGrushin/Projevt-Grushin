package INTERFACE;

public class Main {
    public static void main(String[] args) {
        IMUSIC GROB = new Russian_rock();
        System.out.println("Ритм песен: ");
        GROB.rhythm();
        if (GROB.is_popular()) System.out.println("Is popular");
        else System.out.println("Is not popular");
    }

}
