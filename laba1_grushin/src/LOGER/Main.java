package LOGER;

public class Main {
    public static void main(String[] args) {
        Shop TV_shop = new Shop(1, 1000, 0);
        try{
            TV_shop.sale();
            TV_shop.return_good();
            TV_shop.sale();
            TV_shop.sale();

        }
        catch (ImpossibleOperationException e){
            System.out.println(e.getMessage());
        }

    }
}
