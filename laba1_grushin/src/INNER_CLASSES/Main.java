package INNER_CLASSES;

import INTERFACE.IMUSIC;
import INTERFACE.Russian_rock;

public class Main {
    public static void main(String[] args) {
        Game GTA = new Game(88, "GTA_5");
        GTA.show_info();
        Game.main_hero.check(Game.main_hero.hp);
    }
}
