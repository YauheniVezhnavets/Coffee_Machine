package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
        boolean b = true;

        while (b) {
            System.out.println();
            System.out.println("Write action (buy, fill, take,remaining, exit):");
            System.out.print("> ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    System.out.print("> ");
                    String numberOfCoffee = scanner.next();
                    switch (numberOfCoffee) {
                        case "1":
                            if (water >= 250 && coffeeBeans > 16 && disposableCups > 0) {
                                water -= 250;
                                coffeeBeans -= 16;
                                money += 4;
                                disposableCups--;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (coffeeBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else {
                                System.out.println("Sorry, not enough disposable cups");
                                break;
                            }
                        case "2":
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && disposableCups > 0) {
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                money += 7;
                                disposableCups--;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (coffeeBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else {
                                System.out.println("Sorry, not enough disposable cups");
                                break;
                            }

                        case "3":
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && disposableCups > 0) {
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                money += 6;
                                disposableCups--;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (coffeeBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else {
                                System.out.println("Sorry, not enough disposable cups");
                                break;
                            }
                        case "back":
                            break;
                        default:
                            System.out.println("Incorrect enter:");
                            break;
                    }
                    break;
                case "fill":
                    water = fillWater(water);
                    milk = fillMilk(milk);
                    coffeeBeans = fillCoffeeBeans(coffeeBeans);
                    disposableCups = fillDisposableCups(disposableCups);
                    break;
                case "take":
                    take(money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println();
                    remaining(water, milk, coffeeBeans, disposableCups, money);
                    break;
                case "exit":
                    b = false;
                    break;
                default:
                    System.out.println("No such command. Please, try again");
                    break;
            }
        }
    }


    public static int fillWater(int water) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print("> ");
        water += scanner.nextInt();
        return water;
    }

    public static int fillMilk(int milk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of milk do you want to add: ");
        System.out.print("> ");
        milk += scanner.nextInt();
        return milk;
    }

    public static int fillCoffeeBeans(int coffeebeans) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        System.out.print("> ");
        coffeebeans += scanner.nextInt();
        return coffeebeans;
    }

    public static int fillDisposableCups(int disposableCups) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        System.out.print("> ");
        disposableCups += scanner.nextInt();
        return disposableCups;
    }


    public static void take(int money) {
        System.out.println("I gave you $" + money);

    }

    public static void remaining(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
}
