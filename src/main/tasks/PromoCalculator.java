package main.tasks;

// Дан класс PromoCalculator, который вычисляет итоговую стоиомсть корзины с учетом скидки для региона.
// Какой окажется итоговая стоимость после следующего вызова:
//        PromoCalculator calculator = new PromoCalculator();
//        calculator.calculate("center", 1750);
//
//      1745
//
// public void PromoCalculator() - это не конструктор!!!
// поэтому, при создании calculator мапа будет пустая (иметь размер 0).
// след. возращаемое значение будет DEFAULT_PROMO, т.е. 5

import java.util.HashMap;
import java.util.Map;

public class PromoCalculator {

    private static final int DEFAULT_PROMO = 5;
    private final Map<String, Integer> promoCluster = new HashMap<>();

    public void PromoCalculator() {
        promoCluster.put("north", 70);
        promoCluster.put("center", 50);
        promoCluster.put("south", 30);
        promoCluster.put("west", 10);
        promoCluster.put("east", 20);
    }

    public int calculate(String region, int finalPrice) {
        return finalPrice - promoCluster.getOrDefault(region, DEFAULT_PROMO);
    }

    public static void main(String[] args) {
        PromoCalculator calculator = new PromoCalculator();
        System.out.println(calculator.calculate("center", 1750));
    }
}
