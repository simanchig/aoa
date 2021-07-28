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
		console.println("Version:1.0");
		console.println("Пустая версия возможностей пока что мало(Ждите новые обновы скоро будет круто");
		console.println("___________");
		console.println("Пройдите обучение,команда: help");
		console.println("__________");
		console.println("Помошь по сюжету -> hos");
	}
	
	@Override
	public void onInput(String str)
	{
		checkXp();

		switch(str) {
			case "create":
				CommandHandler.cmdcreate();
		 		break;
			case "make Pyletopia":
				CommandHandler.cmdmakepyletopia();
					break;
			case "make Immortalis":
				CommandHandler.cmdmakeimmortalis();
				break;
			case "make Gortenzya":
				CommandHandler.cmdmakeGortnezya();
				break;
			case "dt":
				CommandHandler.cmddt();
				break;
			case "stats":
				CommandHandler.cmdstats();
				break;
			case "buildHouse":
				CommandHandler.cmdbuildHouse();
				break;
			case "activate Pyletopia":
				CommandHandler.cmdactivatePYLETOPIA();
				break;
			case "activate Immortalis":
				if (activatedportals == 0) {
					if (energy >= 1) {
						if (deactivatedportals > 0) {
							if (KIimortalis > 0) {
								energy -= 1;
								console.println("----------------");
								console.println("Энергия: " + energy + ".");
								KIimortalis--;
								--deactivatedportals;
								activatedportals++;
								console.println("Вы успешно активировали портал в Имморталис!");
							} else {
								console.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
							}
						} else {
							console.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
						}
					} else {
						console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					}
				} else if ( deactivatedportals > activatedportals) {
					if (energy >= 1) {
						if (KIimortalis > 0) {
							energy -= 1;
							console.println("----------------");
							console.println("Энергия: " + energy + ".");
							KIimortalis--;
							activatedportals++;
							console.println("Вы успешно активировали портал в Имморталис!");
						} else {
							console.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
						}

					} else {
						console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					}
				}  else if (deactivatedportals == 0) {
					console.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
				}

				break;
			case "activate Gortenzya":
				if (activatedportals == 0) {
					if (energy >= 1) {
						if (deactivatedportals > 0) {
							if (KIgortenzya > 0) {
								energy -= 1;

								KIgortenzya--;
								deactivatedportals--;
								activatedportals++;
								console.println("Энергия: " + energy + ".");
								console.println("----------------");
								console.println("Вы успешно активировали портал в Гардензию!");
							} else {
								console.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
							}
						} else {
							console.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
						}
					} else {
						console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					}
				} else if (deactivatedportals > activatedportals) {
					if (energy >= 1) {
						if (deactivatedportals > 0) {
							if (KIgortenzya > 0) {
								energy -= 1;

								KIgortenzya--;
								activatedportals++;
								console.println("Энергия: " + energy + ".");
								console.println("----------------");
								console.println("Вы успешно активировали портал в Гардензию!");
							} else {
								console.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
							}
						} else {
							console.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
						}
					} else {
						console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					}
				} else if (deactivatedportals < activatedportals) {
					console.println("У вас нету свободного портала!Постройте его с помощью команды: Build Portal");
				}


				break;
			case "dstats":
				CommandHandler.cmddstats();
	            break;
			case "for":
				CommandHandler.cmdfor();
				break;
			case "buildPortal":
				CommandHandler.cmdBuildPortal();						
				break;
			case "skills":
				CommandHandler.cmdSkills();
				break;
			case "kill":
				CommandHandler.cmdKill();
				break;
			case "sleep":
				CommandHandler.cmdSleep();
				break;
			case "ce":
				energy = 0;
				console.println("Успешно!");
				break;
			case "save":
				GameSaver.save();
				break;
			case "load":
				GameSaver.load();
				break;
			case "reset":
				GameSaver.reset();
				break;
			case "help":
				Help.help();
				break;
			case "cls":
				console.clear();
				break;
			case "hos":
				console.println("___________");
			    console.println("Помощь по Сюжету:");
				console.println("Чтобы активировать Сюжет -> as");
				console.println("___________");
				console.println("Подсказка по Сюжету: Не забывайте про порталы!\nКоманда help для помощи,для подробной информации -> hp");
				break;
			case "hp":
				console.println("___________");
				console.println("1.Сделайте ПКИ(Пустой камень измерения) -> create");
				console.println("2. Сделайте камень измерения любого измерения(Подробнее: hki) Пример: make Immortalis");
				console.println("3. Постройте портал!Требования: 12 рунического камня(чтобы добыть for) Пример: Build Portal");
				console.println("4. Активируйте портал ,пример: activate Pyletopia");
				break;
			case "hi":
				console.println("___________");
				console.println("Список измерений(На данный момент их всего:3): ");
				console.println("1.Пылетопия-Измерение пыли и темноты,индекс - Pyletopia");
				console.println("2. Имморталис - Измерение,пещера и лабринт! индекс- Immortalis");
				console.println("3. Гардензия - Измерение цветов и травы ,индекс - Gortenzya");
				break;
			case "pt village":
				if (energy >= 45) {
					if (woodenaxe == 0){
						woodenaxe = 1;
					} 
					xptravel += 20;
					energy -= 45;
					console.println("__________");
					console.println("Вы пошли искать деревню, и залутали её");
					console.println("+ 20 опыта к навыку: Путешевствие");
					console.println("- 45 Энергии ,у вас теперь: " + energy +".");
				} else {
					console.println("Вам недостаточно энергии чтобы начать путешевствие!\n Надо 45 а у вас: " + energy + ".");
				}
				break;
			default:
				console.println("Неизвестная команда");
		}
	}
	
	public static void pki() {
    	dimesionStones++;
		
		if (dimesionStones == 1) {
			console.println("У вас " + dimesionStones + " пустой камень измерений");
		} else if(dimesionStones == 2){
			console.println("У вас " + dimesionStones + " пустых камня измерений");
		} else if(dimesionStones == 3){
			console.println("У вас " + dimesionStones + " пустых камня измерений");
		} else if (dimesionStones == 4){
			console.println("У вас " + dimesionStones + " пустых камня измерений");
		} else {
			console.println("У вас " + dimesionStones + " пустих камней измерений");
		}
	}
	public static void stats() {
		console.println("__________");
		console.println("Мощь: " + xarakstrong + ".");
		console.println("__________");
		console.println("Энергия: " + xarakenergy + ".");
		console.println("__________");
		console.println("Анима: " + xarakanima + ".");
		console.println("__________");
		console.println("Душа: " + xaraksoul + ".");
	}

	public static void checkXp() {
		if (xpanima == 100) {
				lvlanima = 2;
				energy += 10;
				console.println("----------------");
				console.println("Уровень Анимы повышен до: " + lvlanima + ".");
				console.println("Ваша энергия: " + energy + ".");
			} else if (xpanima == 300) {
				lvlanima = 3;
				energy += 10;
				console.println("----------------");
				console.println("Уровень Анимы повышен до: " + lvlanima + ".");
				console.println("Ваша энергия: " + energy + ".");
			} else if (xpanima == 800) {
				lvlanima = 4;
				energy += 15;
				console.println("----------------");
				console.println("Уровень Анимы повышен до: " + lvlanima + ".");
				console.println("Ваша энергия: " + energy + ".");
			} else if (xpanima == 1200) {
				lvlanima = 5;
				energy += 20;
				console.println("----------------");
				console.println("Уровень Анимы повышен до: " + lvlanima + ".");
				console.println("Ваша энергия: " + energy + ".");
			} 
            if (xpoxota == 150) {
				lvloxota = 2;
				energy += 10;
				console.println("----------------");
				console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + lvloxota + ".");
				console.println("Энергия: " + energy + ".");
			} else if (xpoxota == 500) {
				lvloxota = 3;
				energy += 20;
				console.println("----------------");
				console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + lvloxota + ".");
				console.println("Энергия: " + energy + ".");
			} else if (xpoxota == 1000) {
				lvloxota = 4;
				energy += 20;
				console.println("----------------");
				console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + lvloxota + ".");
			  	console.println("Энергия: " + energy + ".");
		    } if (xptravel == 100) {
				lvltravel = 2;
				energy += 10;
				console.println("----------------");
				console.println("Ваш уровень Путешевствия повышен до: " + lvltravel + ".");
				console.println("Энергия: " + energy + ".");
			  } else if (xptravel == 300) {
				lvltravel = 3;
				energy += 10;
				console.println("----------------");
				console.println("Ваш уровень Путешевствия повышен до: " + lvltravel + ".");
				console.println("Энергия: " + energy + ".");
			}
	}
	
	public Main() {
		console.setInputHandler(this);
	}
}

