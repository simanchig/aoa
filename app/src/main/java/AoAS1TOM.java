import java.util.Scanner;
public class AoAS1TOM
{
	static boolean isBool = false;
	
	public static void beggin() {
		Scanner stom1 = new Scanner(System.in);
		String sstom1 = stom1.nextLine();
		if(Main.amountPTV == 1 && isBool == false) {
			Main.console.println("Когда вы гуляли вы встретили какогото жителя который с вами заговорил!Вы будеье с ним говорить?Да/Нет?");
			switch(sstom1) {
				case "Да":
					Main.console.println("Sucesfully");
					break;
				case "Нет":
					Main.console.println("Sucesfully");
					break;
				default:
					Main.console.println("Вы не ответили,на вопрос!");
			}
			isBool = true;
		}
    }
}
