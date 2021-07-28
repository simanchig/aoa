import java.util.Scanner;
import com.simanchig.aoa.*;

public class Main implements InputHandler
{
	
	public static int deactivatedportals;
	public static int activatedportals;
	public static int dimesionStones;
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
	public static int homes;
	public static int wood;
	
	
	public static Console console;
	
	public static void main(Console consoleObj) {
		console = consoleObj;
		new Main();
		
		
		//Камни измерений:
		dimesionStones = 0;
		KIimortalis = 0;
		KIgortenzya = 0;
		KIpyletopia = 0;
		//Ресурсы(дерево и тп):
		wood = 0;
		runestoned = 0;
		//Доп.Статистика:
		homes = 0;
		activatedportals = 0;
		deactivatedportals = 0;
		// Навыки:
		  //Анима:
		lvlanima = 1;
		xpanima = 0;
		  //Охота:
		lvloxota = 1;
		xpoxota = 0;
		  //Путешевтвие:
		lvltravel = 1;
		xptravel = 0;
		//Характеристики:
		xarakstrong = 200;
		xaraksoul = 200;
		xarakenergy = 200;
		xarakanima = 200;
		//ДРУГОЕ:
		energy = 150;
		//Инструменты:
		woodenaxe = 0;
		
		
		
		console.println("Привет! Начните игру с строительства дома. Пишите команду buildHouse");
		console.println("___________");
		console.println("ChangeLog:");
		console.println("Version:БЕТА 1.0.1");
		console.println("Более наполненная контентом версия!Ждите новые обновы скоро будет СЮЖЕТ.");
		console.println("___________");
		console.println("Пройдите обучение,команда: help");
		console.println("__________");
		console.println("Помошь по сюжету -> hos(НЕ РАБОТАЕТ");
	}
	
	@Override
	public void onInput(String str)
	{
		other.checkXp();

		switch(str) {
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
				GameSaver.save();
				break;
			case "load":
				console.clear();
				GameSaver.load();
				break;
			case "reset":
				console.clear();
				GameSaver.reset();
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
				CommandHandler.cmdptVillage();
				break;
			default:
				console.clear();
				console.println("Неизвестная команда");
		}
	}
	
	
	

	
	
	public Main() {
		console.setInputHandler(this);
	}
}

