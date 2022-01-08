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
		
		// OBSOLETE: Теперь так загружать не нужно
		/*
		//Камни измерений:
		dimesionStones = Console.loadInt("dimension_stones", 0);
		KIimortalis = Console.loadInt("ki_imortalis", 0);
		KIgortenzya = Console.loadInt("ki_gortenzya", 0);
		KIpyletopia = Console.loadInt("ki_pyletopia", 0);
		//Ресурсы(дерево и тп):
		wood = Console.loadInt("wood", 0);
		runestoned = Console.loadInt("rune_stoned", 0);
		sticks = Console.loadInt("sticks", 0);
		//Доп.Статистика:
		homes = Console.loadInt("homes", 0);
		activatedportals = Console.loadInt("activatedportals", 0);
		deactivatedportals = Console.loadInt("deactivatedportals", 0);
		// Навыки:
		//Анима:
		lvlanima = Console.loadInt("lvl_anima", 1);
		xpanima = Console.loadInt("xp_anima", 0);
		//Охота:
		lvloxota = Console.loadInt("lvl_oxota", 1);
		xpoxota = Console.loadInt("xp_oxota", 0);
		//Путешевтвие:
		lvltravel = Console.loadInt("lvl_travel", 1);
		xptravel = Console.loadInt("xp_travel", 0);
		//Характеристики:
		xarakstrong = Console.loadInt("xarak_strong", 200);
		xaraksoul = Console.loadInt("xarak_soul", 200);
		xarakenergy = Console.loadInt("xarak_energy", 200);
		xarakanima = Console.loadInt("xarak_anima", 200);
		//ДРУГОЕ:
		energy = Console.loadInt("energy", 150);
		//Инструменты:
		woodenaxe = Console.loadInt("wooden_axe", 0);
		pwaxe = Console.loadInt("pwaxe", 100);
		woodenpickaxe = Console.loadInt("wooden_pickaxe", 0);
		pwpaxe = Console.loadInt("pwpaxe", 100);
		//СЮЖЕТ:
		checkTtoVillage = Console.loadBool("checkTtoVillage", false);
		amountPTV = Console.loadInt("amountPTV", 0);
		*/

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

		// OBSOLETE: Это все не нужно
		/* Console.saveInt("deactivated_portals", deactivatedportals);
		Console.saveInt("dimension_stones", dimesionStones);
		Console.saveInt("ki_imortalis", KIimortalis);
		Console.saveInt("ki_gortenzya", KIgortenzya);
		Console.saveInt("ki_pyletopia", KIpyletopia);
		Console.saveInt("wood", wood);
		Console.saveInt("rune_stoned", runestoned);
		Console.saveInt("sticks", sticks);
		Console.saveInt("homes", homes);
		Console.saveInt("activatedportals", activatedportals);
		Console.saveInt("pwpaxe", pwpaxe);
		Console.saveInt("lvl_anima", lvlanima);
		Console.saveInt("xp_anima", xpanima);
		Console.saveInt("lvl_oxota", lvloxota);
		Console.saveInt("xp_oxota", xpoxota);
		Console.saveInt("lvl_travel", lvltravel);
		Console.saveInt("xp_travel", xptravel);
		Console.saveInt("xarak_strong", xarakstrong);
		Console.saveInt("xarak_soul", xaraksoul);
		Console.saveInt("xarak_energy", xarakenergy);
		Console.saveInt("xarak_anima", xarakanima);
		Console.saveInt("energy", energy);
		Console.saveInt("wooden_axe", woodenaxe);
		Console.saveInt("pwaxe", pwaxe);
		Console.saveInt("wooden_pickaxe", woodenpickaxe);
		Console.saveInt("amountPTV", amountPTV);
		Console.saveBool("checkTtoVillage", checkTtoVillage); */
	}
}

