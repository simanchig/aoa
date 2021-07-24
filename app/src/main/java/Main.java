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
	public static int runestoned;
	public static int xarakanima;
	public static int aoa3sylph;
	public static int lvltravel;
	public static int xaraksoul;
	public static int xptravel;
	public static int lvlanima;
	public static int lvloxota;
	public static int xpanima;
	public static int xpoxota;
	public static int energy;
	public static int homes;
    public static int trees;
	public static int wood;
	
	public static double aoa3runestone;
	
	public static Console console;
	
	public static void main(Console consoleObj) {
		console = consoleObj;
		new Main();
		
		dimesionStones = 0;
		KIimortalis = 0;
		trees = 999999999;
		wood = 0;
		homes = 0;
		aoa3runestone = 999999999;
		runestoned = 0;
		activatedportals = 0;
		deactivatedportals = 0;
		KIgortenzya = 0;
		lvlanima = 1;
		xpanima = 0;
		aoa3sylph = 299999999;
		lvloxota = 1;
		xpoxota = 0;
		energy = 100;
		lvltravel = 1;
		xptravel = 0;
		xarakstrong = 200;
		xaraksoul = 200;
		xarakenergy = 200;
		xarakanima = 200;
		KIpyletopia = 0;
		
		console.println("Привет! Начните игру с строительства дома. Пишите команду buildHouse");
		console.println("___________");
		console.println("ChangeLog:");
		console.println("Version:1.0");
		console.println("Пустая версия возможностей пока что мало(Ждите новые обновы скоро будет круто");
		console.println("___________");
		console.println("Пройдите обучение,команда: help");
	}
	
	@Override
	public void onInput(String str)
	{
		checkXp();

		switch(str) {
			case "create":
				if (energy >= 2) {
					pki();
					energy -= 2;
					console.println("----------------");
					console.println("Энергия: " + energy + ".");
				} else {
					console.println("Вам нехватает энергии, поспите: sleep");
				}
		 		break;
			case "make pyletopia":
				if (energy >= 5) {
					if (dimesionStones > 0){
						energy -= 5;
						console.println("----------------");
						console.println("Энергия: " + energy + ".");
						dimesionStones--;
						KIpyletopia++;
						console.println("----------------");
						console.println("Вы сделали камень измерения Пылетопии");
					} else if (dimesionStones <= 0){
						console.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
					}
				} else {
					console.println("----------------");
					console.println("Вам недостаточно энергии! Требуется 5, а у вас: " + energy + ".");
				}

				break;
			case "make immortalis":
				if (energy >= 5) {
					if (dimesionStones > 0){
						energy -= 5;
						console.println("----------------");
						console.println("Энергия: " + energy + ".");
						dimesionStones--;
						KIimortalis++;
						console.println("----------------");
						console.println("Вы сделали Камень измерения Имморталиса");
					} else if (dimesionStones <= 0){
						console.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
					}
				} else {
					console.println("----------------");
					console.println("Вам недостаточно энергии! Требуется 5, а у вас: " + energy + ".");
				}

				break;
			case "make Gortenzya":
				if(energy >= 5) {
					if (dimesionStones > 0) {
						energy -= 5;
						console.println("----------------");
						console.println("Энергия: " + energy + ".");
						dimesionStones--;
						KIgortenzya++;
						console.println("Вы сделали Камень измерения Гарденсии,чтобы активировать activate Gortenzya");
					} else if (dimesionStones <= 0){
						console.println("Вам недостаточно пустых камней измерения,Сделайте их,команда create");
					}
				} else {
					console.println("Вам недостаточно энергии!Требуеться 5 а у вас: " + energy + ".");
				}
				break;

			case "дт":
				if (energy >= 5) {
					energy -= 5;
					console.println("----------------");
					console.println("Энергия: " + energy + ".");
					xptravel += 10;
					xpanima += 5;
					trees--;
					wood += 5;
					console.println("Вы срубили дерево! + 5 древесиных толстых палок");
					console.println("+ 5 опыта Анимы.");
					console.println("+ 10 опыта путешевствия.");
					console.println(wood + "едениц дерева.");
				} else {
					console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + energy + ".");
				}
				break;
			case "stats":
				console.println("----------------");
				console.println("Пустых камней измерения: " + dimesionStones + ". Камни Имморталиса: " + KIimortalis + ". Древесины в инвентаре: " + wood + ". Рунического камня: " + runestoned + ". Камней измерения Гортензия: " + KIgortenzya + ".");
				break;
			case "buildHouse":
				if (energy >= 30) {
					if (wood >=64){
						energy -= 30;
						console.println("----------------");
						console.println("Энергия: " + energy + ".");
						xptravel += 5;
						wood -= 64;
						homes++;
						console.println("У вас теперь есть маленькая халупа");
						console.println("+ 5 опыта Путешевствия.");
					} else if (wood <=0){
						console.println("Добудьте 64 едениц древесины! Вам не хватает! дт");
					}
				}else {
					console.println("Вам недостаточно энергии!Нужно 30 ,у вас: " + energy + ".");
				}
				break;
			case "activate Pyletopia":
				if (activatedportals == 0) {
					if (energy >= 1) {
						if (deactivatedportals > 0) {
							if (KIpyletopia > 0) {
								energy -= 1;
								console.println("----------------");
								console.println("Энергия: " + energy + ".");
								KIpyletopia--;
								--deactivatedportals;
								activatedportals++;
								console.println("Вы успешно активировали портал в Пылетопию!");
							} else {
								console.println("Вам недастаточно Камней измерения Пылетопии,чтобы сделать make pyletopia");
							}
						} else {
							console.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
						}
					} else {
						console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					}
				} else if ( deactivatedportals > activatedportals) {
					if (energy >= 1) {
						if (KIpyletopia > 0) {
							energy -= 1;
							console.println("----------------");
							console.println("Энергия: " + energy + ".");
							KIimortalis--;
							activatedportals++;
							console.println("Вы успешно активировали портал в Пылетопию!");
						} else {
							console.println("Вам недастаточно Камней измерения Пылетопии,чтобы сделать make pyletopia");
						}

					} else {
						console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					}
				}  else if (deactivatedportals == 0) {
					console.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
				}

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
				console.println("----------------");
				console.println("Ваши дома: " + homes + ". Ваши активированные порталы: " + activatedportals + ". Ваши неактивированные порталы: " + deactivatedportals +". Деревьев в мире: " + trees + ". Рунического камня : " + aoa3runestone + ". Сильфоф в мире: " + aoa3sylph + ".");
	            break;
			case "for":
				if (energy >= 5){
					energy -= 5;
					aoa3runestone -= 0.5;
					runestoned += 1;
					console.println("Энергия: " + energy + ".");
					console.println("----------------");
					console.println("Вы добыли 1 рунический камень!+ 1 рунический камень");
				} else {
					console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + energy + ".");
				}
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

