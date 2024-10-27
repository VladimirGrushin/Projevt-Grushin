package EXCEPTIONS;

public class Main {
    public static void main(String[] args){
        StudentsPersonalAccount Grushin = new StudentsPersonalAccount();
        try {
            Grushin.enter_account(0000, "vgrushin@sfedu.ru");

        }
        catch (IncorrectDataException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
        finally {
            Grushin.advertisement();
        }
    }
}
