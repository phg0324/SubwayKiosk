package subwayproject;
import java.util.Scanner;

class Num_One {
	private int smenu;
		
	public void choice(int menu) {
		Sandwich sdw = new Sandwich();
		
		Scanner yuumi = new Scanner(System.in);
		switch(menu) {
		case 1:
			System.out.println("-클래식중 하나 고르시오-");
			
			System.out.print("1.이탈리안 비엠티  ");
			System.out.print("2.비엘티  ");
			System.out.print("3.미트볼  ");
			System.out.print("4.햄  ");
			System.out.print("5.에그마요  ");
			System.out.print("6.참치  ");
			
			smenu = yuumi.nextInt();
			sdw.classic(smenu);
			break;
			
		case 2:
			System.out.print("-뿌레쉬중 하나 고르시오-");
			
			System.out.print("1.로티세리 치킨");
			System.out.print("2.로스트 치킨");
			System.out.print("3.로스트 비프");
			System.out.print("4.써브웨이 클럽");
			System.out.print("5.터키");
			System.out.print("6.베지");
			
			smenu = yuumi.nextInt();
			sdw.fresh(smenu);
			break;
			
		case 3:
			System.out.print("-프리미엄중 하나 고르시오-");
			
			System.out.print("1.스테이크&치즈");
			System.out.print("2.터키 베이컨 아보카도");
			System.out.print("3.치킨 베이컨 랜치");
			System.out.print("4.써브웨이 멜트");
			System.out.print("5.풀드포크");
			System.out.print("6.터키 베이컨");
			System.out.print("7.스파이시 이탈리안");
			System.out.print("8.치킨 데리야끼");
			
			smenu = yuumi.nextInt();
			sdw.premium(smenu);
			break;
		}
		
		
	}
	

}
