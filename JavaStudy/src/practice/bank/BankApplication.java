package practice.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			int user = Integer.parseInt(scan.nextLine());
			
			if (user == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (user == 1) {
				System.out.println("--------------------------");
				System.out.println("계좌생성");
				System.out.println("--------------------------");
				System.out.print("계좌번호 : ");
				String user_account = scan.nextLine();
				System.out.print("계좌주 : ");
				String user_name = scan.nextLine();
				System.out.print("초기 입금액 : ");
				int user_money = Integer.parseInt(scan.nextLine());
				
				accountList.add(new Account(user_account, user_name, user_money));
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				
			} else if (user == 2) {
				System.out.println("--------------------------");
				System.out.println("계좌목록");
				System.out.println("--------------------------");
				
				for (int i = 0; i < accountList.size(); i++) {
					System.out.println(accountList.get(i).getAccount() + "   " + accountList.get(i).getName() + "   " + accountList.get(i).getMoney());
				}
			} else if (user == 3) {
				System.out.println("--------------------------");
				System.out.println("예금");
				System.out.println("--------------------------");
				
				System.out.print("계좌번호 : ");
				String into_account = scan.nextLine();
				System.out.print("예금액 : ");
				int into_money = Integer.parseInt(scan.nextLine());
				
				int i = 0;
				
				for (i = 0; i < accountList.size(); i++) {
					if (into_account.equals(accountList.get(i).getAccount())) {
						break;
					}
				}

				int user_money = accountList.get(i).getMoney();
				accountList.get(i).setMoney(into_money + user_money);
			} else if (user == 4) {
				System.out.println("--------------------------");
				System.out.println("출금");
				System.out.println("--------------------------");
				
				System.out.print("계좌번호 : ");
				String get_account = scan.nextLine();
				System.out.print("출금액 : ");
				int get_money = Integer.parseInt(scan.nextLine());
				
				int i = 0;
				
				for (i = 0; i < accountList.size(); i++) {
					if (get_account.equals(accountList.get(i).getAccount())) {
						break;
					}
				}
				
				int user_money = accountList.get(i).getMoney();
				
				if (user_money < get_money) {
					System.out.println("결과: 출금이 불가능 합니다.");
				} else {
					accountList.get(i).setMoney(user_money - get_money);
					
					System.out.println("결과: 출금이 성공되었습니다.");
				}
			}
		}		
	}
}
