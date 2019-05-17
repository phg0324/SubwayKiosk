package subwayproject;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choose;
		int choice;
		int size;
		Scanner input = new Scanner(System.in);
		Num_One bmenu = new Num_One();
		System.out.println("┌───────────────────────┐\n");
		System.out.println("  **Welcome to Subway**\n");
		System.out.print("└───────────────────────┘\n");
		
		while (true) {
			System.out.println("1. 주문하기");
			System.out.println("2. 주문끝내기");
			System.out.println("3. 프로그램 정보");
			System.out.print("Input your number : ");
			choose = input.nextInt();
			System.out.println("\n");
			
			switch(choose) {
			case 1:
				System.out.print("1: 클래식, 2: 프레쉬, 3:프리미엄");
				choice = input.nextInt();
				
				
				System.out.print("사이즈를 고르시오: 1: 15cm, 2: 30cm");
				size = input.nextInt();
				
				bmenu.size(size);
				bmenu.choice(choice);
				
				return;
			case 2:
				return;
			case 3:
				
				break;
			default:
				System.out.println("숫자를 잘못 입력했습니다. 다시 입력해주세요!");
				break;
			}
		
		}
	}

}
