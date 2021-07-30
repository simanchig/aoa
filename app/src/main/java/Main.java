import java.util.Scanner;
import com.simanchig.aoa.*;

public class Main implements InputHandler
{

	public static int deactivatedportals;
	public static int activatedportals;
	public static int dimesionStones;
	public static int woodenpickaxe;
	public static int KIimortalis;
	public static int KIgortenzya;
	public static int KIpyletopia;
	public static int xarakstrong;
	public static int xarakenergy;
	public static int xarakanima;
	public static int runestoned;
	public static int woodenaxe;
	public static int lvltravel;
	public static int xaraksoul;
	public static int xptravel;
	public static int lvlanima;
	public static int lvloxota;
	public static int xpanima;
	public static int xpoxota;
	public static int energy;
	public static int sticks;
	public static int pwpaxe;
	public static int homes;
	public static int pwaxe;
	public static int wood;
	public static int amountPTV;
	//     СЮЖЕТНЫЕ ПЕРЕМЕННЫЕ:
	public static boolean checkTtoVillage;

	// Console object
	public static Console console;

	public static void main(Console consoleObj)
	{
		/* MAIN INITIALIZATION BLOCK =========== */
		console = consoleObj;
		new Main();
		/* END ================================= */

		//Камни измерений:
		dimesionStones = console.loadInt("dimension_stones", 0);
		KIimortalis = console.loadInt("ki_imortalis", 0);
		KIgortenzya = console.loadInt("ki_gortenzya", 0);
		KIpyletopia = console.loadInt("ki_pyletopia", 0);
		//Ресурсы(дерево и тп):
		wood = console.loadInt("wood", 0);
		runestoned = console.loadInt("rune_stoned", 0);
		sticks = console.loadInt("sticks", 0);
		//Доп.Статистика:
		homes = console.loadInt("homes", 0);
		activatedportals = console.loadInt("activatedportals", 0);
		deactivatedportals = console.loadInt("deactivatedportals", 0);
		// Навыки:
		//Анима:
		lvlanima = console.loadInt("lvl_anima", 1);
		xpanima = console.loadInt("xp_anima", 0);
		//Охота:
		lvloxota = console.loadInt("lvl_oxota", 1);
		xpoxota = console.loadInt("xp_oxota", 0);
		//Путешевтвие:
		lvltravel = console.loadInt("lvl_travel", 1);
		xptravel = console.loadInt("xp_travel", 0);
		//Характеристики:
		xarakstrong = console.loadInt("xarak_strong", 200);
		xaraksoul = console.loadInt("xarak_soul", 200);
		xarakenergy = console.loadInt("xarak_energy", 200);
		xarakanima = console.loadInt("xarak_anima", 200);
		//ДРУГОЕ:
		energy = console.loadInt("energy", 150);
		//Инструменты:
		woodenaxe = console.loadInt("wooden_axe", 0);
		pwaxe = console.loadInt("pwaxe", 100);
		woodenpickaxe = console.loadInt("wooden_pickaxe", 0);
		pwpaxe = console.loadInt("pwpaxe", 100);
		//СЮЖЕТ:
		checkTtoVillage = console.loadBool("checkTtoVillage", false);
		amountPTV = console.loadInt("amountPTV",0);

		console.println("Привет! Начните игру с строительства дома. Пишите команду buildHouse");
		console.println("___________");
		console.println("ChangeLog:");
		console.println("Version:БЕТА 1.1");
		console.println("Более наполненная контентом версия!Ждите новые обновы скоро будет СЮЖЕТ.");
		console.println("___________");
		console.println("Пройдите обучение,команда: help");
		console.println("__________");
		console.println("Помошь по сюжету -> hos");
		console.println("Сюжет активирован,начните игру сюжет начнеться когда вы будете путешевствовать по деревням.");
		
	}

	@Override
	public void onInput(String str)
	{
		
		other.checkXp();
		other.checkpwaxe();
		other.checkpwpaxe();
		

		switch (str)
		{
			case "create":
				console.clear();
				CommandHandler.cmdcreate();
		 		break;
			case "make Pyletopia":
				console.clear();
				CommandHandler.cmdmakepyletopia();
				break;
			case "make Immortalis":
				console.clear();
				CommandHandler.cmdmakeimmortalis();
				break;
			case "make Gortenzya":
				console.clear();
				CommandHandler.cmdmakeGortnezya();
				break;
			case "dt":
				console.clear();
				CommandHandler.cmddt();
				break;
			case "stats":
				console.clear();
				CommandHandler.cmdstats();
				break;
			case "buildHouse":
				console.clear();
				CommandHandler.cmdbuildHouse();
				break;
			case "activate Pyletopia":
				console.clear();
				CommandHandler.cmdactivatePYLETOPIA();
				break;
			case "activate Immortalis":
				console.clear();
				CommandHandler.cmdactivateimmortalis();
				break;
			case "activate Gortenzya":
				console.clear();
				CommandHandler.cmdactivateGortenzya();
				break;
			case "dstats":
				console.clear();
				CommandHandler.cmddstats();
	            break;
			case "for":
				console.clear();
				CommandHandler.cmdfor();
				break;
			case "buildPortal":
				console.clear();
				CommandHandler.cmdBuildPortal();						
				break;
			case "skills":
				console.clear();
				CommandHandler.cmdSkills();
				break;
			case "kill":
				console.clear();
				CommandHandler.cmdKill();
				break;
			case "sleep":
				console.clear();
				CommandHandler.cmdSleep();
				break;
			case "ce":
				console.clear();
				CommandHandler.cmdce();
				break;
			case "save":
				console.clear();
				saveGame();
				break;
			case "help":
				console.clear();
				Help.help();
				break;
			case "cls":
				console.clear();
				break;
			case "hos":
				console.clear();
				CommandHandler.cmdhos();
				break;
			case "hp":
				CommandHandler.cmdhp();
				break;
			case "hi":
				CommandHandler.cmdhi();
				break;
			case "pt village":
				console.clear();
				amountPTV ++;
				CommandHandler.cmdptVillage();
				break;
			case "create Sticks":
				console.clear();
				CommandHandler.cmdcreatesticks();
				break;
			case "create waxe":
				console.clear();
				CommandHandler.cmdcreatewaxe();
				break;
			case "create wpaxe":
				console.clear();
				CommandHandler.cmdcreatewpaxe();
				break;
			case "cp":
				pwaxe = 0;
				break;
			case "reset":
				console.clear();
				CommandHandler.cmdreset();
				console.println("Успешно!");
				break;
			case "amount":
				console.println("pp" + amountPTV);
				break;
			default:
				console.clear();
				console.println("Неизвестная команда");
		}
		AoAS1TOM.beggin();
	}

	private static void saveGame()
	{
		console.saveInt("deactivated_portals", deactivatedportals);
		console.saveInt("dimension_stones", dimesionStones);
		console.saveInt("ki_imortalis", KIimortalis);
		console.saveInt("ki_gortenzya", KIgortenzya);
		console.saveInt("ki_pyletopia", KIpyletopia);
		console.saveInt("wood", wood);
		console.saveInt("rune_stoned", runestoned);
		console.saveInt("sticks", sticks);
		console.saveInt("homes", homes);
		console.saveInt("activatedportals", activatedportals);
		console.saveInt("pwpaxe", pwpaxe);
		console.saveInt("lvl_anima", lvlanima);
		console.saveInt("xp_anima", xpanima);
		console.saveInt("lvl_oxota", lvloxota);
		console.saveInt("xp_oxota", xpoxota);
		console.saveInt("lvl_travel", lvltravel);
		console.saveInt("xp_travel", xptravel);
		console.saveInt("xarak_strong", xarakstrong);
		console.saveInt("xarak_soul", xaraksoul);
		console.saveInt("xarak_energy", xarakenergy);
		console.saveInt("xarak_anima", xarakanima);
		console.saveInt("energy", energy);
		console.saveInt("wooden_axe", woodenaxe);
		console.saveInt("pwaxe", pwaxe);
		console.saveInt("wooden_pickaxe", woodenpickaxe);
		console.saveInt("amountPTV", amountPTV);
		console.saveBool("checkTtoVillage", checkTtoVillage);
	}


	// INITIAL SETUP =====================
	public Main()
	{
		console.setInputHandler(this);
	}
	// END ===============================
}

