package conditionJava;

public class Switch {

	public static void main(String[] args) {
		//inside switch cases all case are within same curly bracket after every syso no need to add extra
		//curly braacket all in in same bracket which is start after swtich keyword and write case word for every condition 
		//and after case1: put colon not semi colon and after that every syso statement use break; keyword
	
		int month = 3;
		switch(month) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("febuary");
			break;
		case 3 :
			System.out.println("march");
			break;
		case 4 :
			System.out.println("april");
		}
	}

}
