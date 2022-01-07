import java.util.Scanner;
import com.simanchig.aoa.*;

public class AoAS1TOM implements InputHandler
{
	static boolean isBool = false;

	public static void beggin()
	{
		// ERROR HERE: изза этого ошибка
		//Scanner stom1 = new Scanner(System.in);
		//String sstom1 = stom1.nextLine();
		
		// Это пришлось закомментировать
		/* if (Main.amountPTV == 1 && isBool == false)
		{
			Main.console.println("Когда вы гуляли вы встретили какогото жителя который с вами заговорил!Вы будеье с ним говорить?Да/Нет?");
			switch (sstom1)
			{
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
		} */
    }
	
	@Override
	public void onInput(String str)
	{
		// TODO: Здесь обрабатывается ввод
		// str - введенная строка, ее нужно в switch
	}
}
