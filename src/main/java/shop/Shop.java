package shop;

import behaviours.ISell;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Shop {

    private ArrayList<ISell> items;
    private double cash;

    public Shop(double cash) {
        this.cash = cash;
        this.items = new ArrayList<>();
    }

    public void addCash(double money) {
        this.cash += money;
    }

    public void removeCash(double money) {
        this.cash -= money;
    }

    public ISell sellItem(ISell item) {
        addCash(item.sellPrice(item.getBuyPrice()));
        return this.items.remove(getItems().indexOf(item));
    }

    public void buyItem(ISell item) {
        this.items.add(item);
        removeCash(item.getBuyPrice());
    }

    public ArrayList<ISell> getItems() {
        return items;
    }

    public double getCash() {
        return cash;
    }

    public double getStockSellValue() {
        double total = 0;
        for (int i = 0; i < getItems().size(); i++) {
            total += items.get(i).sellPrice(items.get(i).getBuyPrice());
        }
        return total;
    }
}
