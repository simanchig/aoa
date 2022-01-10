import java.util.Scanner;
import com.simanchig.aoa.*;

public class Main implements InputHandler
{
	@Save public static int dimesionStones;
	
	@Save public static int woodenpickaxe = 0;
	@Save public static int woodenaxe = 0;
	@Save public static int pwpaxe = 100;
	@Save public static int pwaxe = 100;
	
	@Save public static int KIimortalis = 0;
	@Save public static int KIgortenzya = 0;
	@Save public static int KIpyletopia = 0;
	
	@Save public static int xarakstrong = 200;
	@Save public static int xarakenergy = 200;
	@Save public static int xarakanima = 200;
	@Save public static int xaraksoul = 200;
	
	@Save public static int lvltravel = 1;
	@Save public static int xptravel = 0;
	
	@Save public static int lvlanima = 1;
	@Save public static int xpanima = 0;
	
	@Save public static int lvloxota = 1;
	@Save public static int xpoxota = 0;
	
	@Save public static int energy = 150;
	
	@Save public static int homes = 0;
	@Save public static int deactivatedportals = 0;
	@Save public static int activatedportals = 0;
	
	@Save public static int wood = 0;
	@Save public static int runestoned = 0;
	@Save public static int sticks = 0;
	
	@Save public static int amountPTV = 0;

	// СЮЖЕТНЫЕ ПЕРЕМЕННЫЕ:
	@Save public static boolean checkTtoVillage = false;

	public Main()
	{
		// MAIN: Инициализация
		Console.addInputHandler(this);
		
		// MAIN: Загрузка всех переменных
		Console.saver.load(this);

		Console.println("Привет! Начните игру с строительства дома. Пишите команду buildHouse");
		Console.println("___________");
		Console.println("ChangeLog:");
		Console.println("Version:БЕТА 1.1");
		Console.println("Более наполненная контентом версия!Ждите новые обновы скоро будет СЮЖЕТ.");
		Console.println("___________");
		Console.println("Пройдите обучение,команда: help");
		Console.println("__________");
		Console.println("Помошь по сюжету -> hos");
		Console.println("Сюжет активирован,начните игру сюжет начнеться когда вы будете путешевствовать по деревням.");
	}

	@Override
	public void onInput(String str)
	{
		Other.checkXp();
		Other.checkpwaxe();
		Other.checkpwpaxe();

		switch (str)
		{
			case "create":
				Console.clear();
				CommandHandler.cmdcreate();
		 		break;
			case "make Pyletopia":
				Console.clear();
				CommandHandler.cmdmakepyletopia();
				break;
			case "make Immortalis":
				Console.clear();
				CommandHandler.cmdmakeimmortalis();
				break;
			case "make Gortenzya":
				Console.clear();
				CommandHandler.cmdmakeGortnezya();
				break;
			case "dt":
				Console.clear();
				CommandHandler.cmddt();
				break;
			case "stats":
				Console.clear();
				CommandHandler.cmdstats();
				break;
			case "buildHouse":
				Console.clear();
				CommandHandler.cmdbuildHouse();
				break;
			case "activate Pyletopia":
				Console.clear();
				CommandHandler.cmdactivatePYLETOPIA();
				break;
			case "activate Immortalis":
				Console.clear();
				CommandHandler.cmdactivateimmortalis();
				break;
			case "activate Gortenzya":
				Console.clear();
				CommandHandler.cmdactivateGortenzya();
				break;
			case "dstats":
				Console.clear();
				CommandHandler.cmddstats();
	            break;
			case "for":
				Console.clear();
				CommandHandler.cmdfor();
				break;
			case "buildPortal":
				Console.clear();
				CommandHandler.cmdBuildPortal();						
				break;
			case "skills":
				Console.clear();
				CommandHandler.cmdSkills();
				break;
			case "kill":
				Console.clear();
				CommandHandler.cmdKill();
				break;
			case "sleep":
				Console.clear();
				CommandHandler.cmdSleep();
				break;
			case "ce":
				Console.clear();
				CommandHandler.cmdce();
				break;
			case "save":
				Console.clear();
				saveGame();
				break;
			case "help":
				Console.clear();
				Help.help();
				break;
			case "cls":
				Console.clear();
				break;
			case "hos":
				Console.clear();
				CommandHandler.cmdhos();
				break;
			case "hp":
				CommandHandler.cmdhp();
				break;
			case "hi":
				CommandHandler.cmdhi();
				break;
			case "pt village":
				Console.clear();
				amountPTV ++;
				CommandHandler.cmdptVillage();
				break;
			case "create Sticks":
				Console.clear();
				CommandHandler.cmdcreatesticks();
				break;
			case "create waxe":
				Console.clear();
				CommandHandler.cmdcreatewaxe();
				break;
			case "create wpaxe":
				Console.clear();
				CommandHandler.cmdcreatewpaxe();
				break;
			case "cp":
				pwaxe = 0;
				break;
			case "reset":
				Console.clear();
				CommandHandler.cmdreset();
				Console.println("Успешно!");
				break;
			case "amount":
				Console.println("pp" + amountPTV);
				break;
			default:
				Console.clear();
				Console.println("Неизвестная команда");
		}
		AoAS1TOM.beggin();
	}

	private void saveGame()
	{
		// MAIN: Использовать этот для сохранения
		Console.saver.save(this);
	}
}

