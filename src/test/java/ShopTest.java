import behaviours.ISell;
import instruments.Guitar;
import instruments.guitar.Electric;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Electric newItem, newItem1, newItem2;

    @Before
    public void before(){
        shop = new Shop(1000);
         newItem = new Electric("Red", "Wood", 500);
        newItem1 = new Electric("Red", "Wood", 400);
        newItem2 = new Electric("Red", "Wood", 60);
        shop.buyItem(newItem);
        shop.buyItem(newItem1);
        shop.buyItem(newItem2);

    }

//    @Test
//    public void checkBuyItem(){
//        assertEquals(1, shop.getItems().size());
//        assertEquals(500, shop.getCash(), 0.0);
//    }
//
//    @Test
//    public void sellItem(){
//        ISell sold = shop.sellItem(newItem);
//        assertEquals(0, shop.getItems().size());
//        assertEquals(1100, shop.getCash(), 0.0);
//    }

    @Test
    public void getAllStock(){
        assertEquals(1152, shop.getStockSellValue(), 0.0);
    }
}
