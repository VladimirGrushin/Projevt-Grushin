package LOGER;

import java.util.logging.Logger;
import java.util.logging.Level;
public class Shop {
    private static final Logger logger = Logger.getLogger(Shop.class.getName());
    private int count_of_goods;
    private int cashbox;
    private final int price;
    public Shop(int count_of_goods, int price, int cashbox) {
        this.count_of_goods = count_of_goods;
        this.price = price;
        this.cashbox = cashbox;
        logger.log(Level.INFO, "Открылся магазин. Количество товаров: {0}. Цена за товар: {1}", new Object[]{count_of_goods, price});
    }

    public void sale() throws ImpossibleOperationException{

        if (this.count_of_goods == 0){
            logger.log(Level.WARNING, "Покупатель хочет купить товар, но количество товаров: {0}. ", count_of_goods);
            throw new ImpossibleOperationException("Закончились товары");
        }
        this.cashbox += this.price;
        this.count_of_goods -=1;
        logger.log(Level.INFO, "Продажа. Осталось товаров: {0}. Денег в кассе: {1}", new Object[]{count_of_goods, cashbox});
    }
    public void return_good(){
        this.cashbox -= this.price;
        this.count_of_goods +=1;
        logger.log(Level.INFO, "Возврат. Количество товаров: {0}. Денег в кассе: {1}", new Object[]{count_of_goods, cashbox});
    }

}
