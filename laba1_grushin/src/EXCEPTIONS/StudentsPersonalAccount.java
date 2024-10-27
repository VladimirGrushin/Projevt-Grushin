package EXCEPTIONS;

public class StudentsPersonalAccount {
    private int password = 12345678;
    private String login = "vgrushin@sfedu.ru";
    public StudentsPersonalAccount(){}
    public void enter_account(int password, String login) throws IncorrectDataException{
        if (this.password != password || this.login.equals(login))throw new IncorrectDataException("Неверный логин или пароль");
        else System.out.println("Вы вошли на сайт sfedu");
    }
    public void advertisement(){
        System.out.println("Приходите в южный меридиан");
    }

}
