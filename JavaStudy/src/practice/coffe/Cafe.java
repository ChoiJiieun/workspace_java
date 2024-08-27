package practice.coffe;

import java.util.ArrayList;
import java.util.Scanner;

import practice.bank.Account;

public class Cafe {
	String name;
    ArrayList<Coffee> menuList;

    public Cafe(String name) {
        this.name = name;
        this.menuList = new ArrayList<>();
    }

    public void addCoffee(Coffee cf) {
        menuList.add(cf);
    }

    public void showMenu() {
        System.out.println("어서오세요 " + name + " 입니다.");
        for (int i = 0; i < menuList.size(); i++) {
            Coffee cf = menuList.get(i);
            System.out.println((i + 1) + ". [" + cf.name + ": " + cf.price + "]");
        }
    }

    public void buyCoffee(Scanner sc) {
        System.out.print("메뉴를 선택해주세요: ");
        int choice = sc.nextInt();
        if (choice > 0 && choice <= menuList.size()) {
            Coffee selectedCoffee = menuList.get(choice - 1);
            System.out.println(selectedCoffee.name + "를 " + selectedCoffee.price + "원에 구매했습니다.");
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }
}
