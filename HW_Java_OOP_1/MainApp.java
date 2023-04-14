package HW_Java_OOP.HW_Java_OOP_1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Product milk = new Product("Milk", 23.40);

        Product cake = new Cake("Cake", 114.56, "sweet");

        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("\nВ аппарате имеется: ");

        vendingMachine.addProduct(milk)
                      .addProduct(cake)
                      .addProduct(new Bread("Borodinskyy", 20.50, "sweet", "dark"))
                      .showProducts();


        System.out.println("Какой товар желаете приобрести:\n");

        Scanner sc = new Scanner(System.in);

        Product founded = vendingMachine.findProduct(sc.next());
        sc.close();

        System.out.println("Ищем товар - : " + founded);

        System.out.println("В аппарате имеется денег: " + vendingMachine.getAmountMoney());
    try {
        Product soldProduct = vendingMachine.sellProduct(founded);
        System.out.println("Продали товар: " + soldProduct);
    } catch (RuntimeException e){
        System.out.println(e.getMessage());
    }



        System.out.println("В аппарате имеется денег: " + vendingMachine.getAmountMoney());


    }
}
