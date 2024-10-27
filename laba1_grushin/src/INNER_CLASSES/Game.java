package INNER_CLASSES;

public class Game {
    private int size;
    private String name;

    Game(int size, String name){
        this.name = name;
        this.size = size;
    }
    public void show_info(){
        class Account{
            private int password;
            private String login;
            Account(int password, String login){
                this.password = password;
                this.login = login;
            }
            private void info(){System.out.printf("Account Login: %s \t Password: %s \t Name of the game: %s \t Size of the game(GB): %s \n", login, password, name, size);}
        }
        Account account = new Account(12345678, "Cool player228");
        account.info();
    }


    public static class main_hero{
        public static int hp = 100;
        public static void check(int hp){
            if (hp == 0){System.out.println("Game over");}
            else {System.out.println("Continue to play");}
        }
    }
}
//обращения к полям this."имя поля" - доступ к полю внутреннего класа
//"Назавание внешнего класса".this."имя поля" - доступ к полю внешнего класса
//  non static nested classes