import java.util.Scanner;

public class Main {
	
	public static int deactivatedportals;
	public static int activatedportals;
	public static int dimesionStones;
	public static int KIimortalis;
	public static int KIgortenzya;
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
	
	public static void main(String[] args) {
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
		
		System.out.println("Привет! Начните игру с строительства дома. Пишите команду buildHouse");
		System.out.println("___________");
		System.out.println("ChangeLog:");
		System.out.println("Version:1.0");
		System.out.println("Пустая версия возможностей пока что мало(Ждите новые обновы скоро будет круто");
		System.out.println("___________");
		System.out.println("Пройдите обучение,команда: help");
		while(true){
			Scanner scanner = new Scanner(System.in);
			String command = scanner.nextLine();

			if (xpanima == 100) {
				lvlanima = 2;
				energy += 10;
				System.out.println("----------------");
				System.out.println("Уровень Анимы повышен до: " + lvlanima + ".");
				System.out.println("Ваша энергия: " + energy + ".");
			} else if (xpanima == 300) {
				lvlanima = 3;
				energy += 10;
				System.out.println("----------------");
				System.out.println("Уровень Анимы повышен до: " + lvlanima + ".");
				System.out.println("Ваша энергия: " + energy + ".");
			} else if (xpanima == 800) {
				lvlanima = 4;
				energy += 15;
				System.out.println("----------------");
				System.out.println("Уровень Анимы повышен до: " + lvlanima + ".");
				System.out.println("Ваша энергия: " + energy + ".");
			} else if (xpanima == 1200) {
				lvlanima = 5;
				energy += 20;
				System.out.println("----------------");
				System.out.println("Уровень Анимы повышен до: " + lvlanima + ".");
				System.out.println("Ваша энергия: " + energy + ".");
			} 
            if (xpoxota == 150) {
				lvloxota = 2;
				energy += 10;
				System.out.println("----------------");
				System.out.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + lvloxota + ".");
				System.out.println("Энергия: " + energy + ".");
			} else if (xpoxota == 500) {
				lvloxota = 3;
				energy += 20;
				System.out.println("----------------");
				System.out.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + lvloxota + ".");
				System.out.println("Энергия: " + energy + ".");
			} else if (xpoxota == 1000) {
				lvloxota = 4;
				energy += 20;
				System.out.println("----------------");
				System.out.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + lvloxota + ".");
			  	System.out.println("Энергия: " + energy + ".");
		    } if (xptravel == 100) {
				lvltravel = 2;
				energy += 10;
				System.out.println("----------------");
				System.out.println("Ваш уровень Путешевствия повышен до: " + lvltravel + ".");
				System.out.println("Энергия: " + energy + ".");
			  } else if (xptravel == 300) {
				lvltravel = 3;
				energy += 10;
				System.out.println("----------------");
				System.out.println("Ваш уровень Путешевствия повышен до: " + lvltravel + ".");
				System.out.println("Энергия: " + energy + ".");
			}

			switch(command) {
				case "create":
					if (energy >= 2) {
						pki();
						energy -= 2;
						System.out.println("----------------");
						System.out.println("Энергия: " + energy + ".");
					} else {
						System.out.println("Вам нехватает энергии, поспите: sleep");
					}
		 		break;
				case "make immortalis":
					if (energy >= 6) {
						if (dimesionStones > 0){
							energy -= 6;
							System.out.println("----------------");
							System.out.println("Энергия: " + energy + ".");
							dimesionStones--;
							KIimortalis++;
							System.out.println("----------------");
							System.out.println("Вы сделали Камень измерения Имморталиса");
						} else if (dimesionStones <= 0){
							System.out.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
						}
					} else {
						System.out.println("----------------");
						System.out.println("Вам недостаточно энергии! Требуется 6, а у вас: " + energy + ".");
					}
					
				break;
				case "make Gortenzya":
					if(energy >= 5) {
						if (dimesionStones > 0) {
							energy -= 5;
							System.out.println("----------------");
							System.out.println("Энергия: " + energy + ".");
							dimesionStones--;
							KIgortenzya++;
							System.out.println("Вы сделали Камень измерения Гарденсии,чтобы активировать activate Gortenzya");
						} else if (dimesionStones <= 0){
							System.out.println("Вам недостаточно пустых камней измерения,Сделайте их,команда create");
						}
					} else {
						System.out.println("Вам недостаточно энергии!Требуеться 5 а у вас: " + energy + ".");
					}
					break;
				
				case "дт":
					if (energy >= 5) {
						energy -= 5;
						System.out.println("----------------");
						System.out.println("Энергия: " + energy + ".");
						xptravel += 10;
						xpanima += 5;
						trees--;
						wood += 5;
						System.out.println("Вы срубили дерево! + 5 древесиных толстых палок");
						System.out.println("+ 5 опыта Анимы.");
						System.out.println("+ 10 опыта путешевствия.");
						System.out.println(wood + "едениц дерева.");
					} else {
						System.out.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + energy + ".");
					}
				break;
				case "stats":
					System.out.println("----------------");
					System.out.println("Пустых камней измерения: " + dimesionStones + ". Камни Имморталиса: " + KIimortalis + ". Древесины в инвентаре: " + wood + ". Рунического камня: " + runestoned + ". Камней измерения Гортензия: " + KIgortenzya + ".");
				break;
				case "buildHouse":
					if (energy >= 30) {
						if (wood >=64){
							energy -= 30;
							System.out.println("----------------");
							System.out.println("Энергия: " + energy + ".");
							xptravel += 5;
							wood -= 64;
							homes++;
							System.out.println("У вас теперь есть маленькая халупа");
							System.out.println("+ 5 опыта Путешевствия.");
						} else if (wood <=0){
							System.out.println("Добудьте 64 едениц древесины! Вам не хватает! дт");
						}
					}else {
						System.out.println("Вам недостаточно энергии!Нужно 30 ,у вас: " + energy + ".");
					}
				break;
				case "activate Immortalis":
					//
					//
					//
					// тут какието баги пж исправь их я пишу команду и ничего не происходит,опять наверное скобки неправильно расставил!
					if (activatedportals == 0) {
						if (energy >= 1) {
							if (deactivatedportals > 0) {
								if (KIimortalis > 0) {
									energy -= 1;
									System.out.println("----------------");
									System.out.println("Энергия: " + energy + ".");
									KIimortalis--;
									-- deactivatedportals;
									activatedportals++;
									System.out.println("Вы успешно активировали портал в Имморталис!");
								} else {
									System.out.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
								}
						   } else {
								System.out.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
					       }
					  } else {
							System.out.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
					  }
				    } else if ( deactivatedportals > activatedportals) {
							if (energy >= 1) {
								if (KIimortalis > 0) {
										energy -= 1;
										System.out.println("----------------");
										System.out.println("Энергия: " + energy + ".");
						      			KIimortalis--;
										activatedportals++;
										System.out.println("Вы успешно активировали портал в Имморталис!");
								} else {
										System.out.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
								}
								
							} else {
								System.out.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
						    }
				    }  else if (deactivatedportals == 0) {
							 System.out.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
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
									System.out.println("Энергия: " + energy + ".");
									System.out.println("----------------");
									System.out.println("Вы успешно активировали портал в Гардензию!");
								} else {
									System.out.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
								}
							} else {
								System.out.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
							}
						} else {
							System.out.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
						}
				  } else if (deactivatedportals > activatedportals) {
						if (energy >= 1) {
							if (deactivatedportals > 0) {
								if (KIgortenzya > 0) {
									energy -= 1;

									KIgortenzya--;
									activatedportals++;
									System.out.println("Энергия: " + energy + ".");
									System.out.println("----------------");
									System.out.println("Вы успешно активировали портал в Гардензию!");
								} else {
									System.out.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
								}
							} else {
								System.out.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
							}
						} else {
							System.out.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + energy + ".");
						}
					} else if (deactivatedportals < activatedportals) {
						System.out.println("У вас нету свободного портала!Постройте его с помощью команды: Build Portal");
					}
					
					
					break;
				case "dstats":
					System.out.println("----------------");
					System.out.println("Ваши дома: " + homes + ". Ваши активированные порталы: " + activatedportals + ". Ваши неактивированные порталы: " + deactivatedportals +". Деревьев в мире: " + trees + ". Рунического камня : " + aoa3runestone + ". Сильфоф в мире: " + aoa3sylph + ".");
	            break;
				case "for":
					if (energy >= 5){
						energy -= 5;
						aoa3runestone -= 0.5;
						runestoned += 1;
						System.out.println("Энергия: " + energy + ".");
						System.out.println("----------------");
						System.out.println("Вы добыли 1 рунический камень!+ 1 рунический камень");
					} else {
						System.out.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + energy + ".");
					}
					
					break;
					case "Build Portal":
						if (energy >= 10) {
							if (homes > 0) {
								if (runestoned >= 12) {
									energy -= 10;
									runestoned -= 12;
									deactivatedportals++;
									System.out.println("----------------");
									System.out.println("Энергия: " + energy + ".");
									System.out.println("Вы успешно построили портал!Чтобы активировать,activate");
								} else {
									System.out.println("Вам недостаточно Рунического камня!Требуеться 12 ,а у вас: " + runestoned + "камней,команда:for");
								}
							} else {
								System.out.println("Вам негде размещать портал!Постройте дом,команда:buildHouse.");
							}
						} else {
							System.out.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + energy + ".");
						}
						
					break;
					case "Навыки":
					    System.out.println("----------------");
						System.out.println("Анима - " + lvlanima + " уровень. Опыт: " + xpanima + "xp.");
					    System.out.println("----------------");
					    System.out.println("Охота - " + lvloxota + " уровень. Опыт: " + xpoxota + "xp.");
					    System.out.println("----------------");
					    System.out.println("Путешевствие - " + lvltravel + " уровень. Опыт: " + xptravel + "xp.");
						System.out.println("__________");
						System.out.println("Другое: ");
						stats();
						
					break;
					case "убить":
						if (xarakstrong >= 100) {
							if (energy >= 6) {
								energy -= 6;
								xptravel += 40;
								aoa3sylph -= 0.4;
								xpoxota += 15;
								xarakstrong -= 60;
								System.out.println("------------------");
								System.out.println("Энергия: " + energy + ".");
								System.out.println("Вы убили: Крипера");
								System.out.println("+ 15 опыта Охоты.");
								System.out.println("+ 40 опыта Путешевствия.");
							} else {
								System.out.println("Вам недостаточно энергии!Нужно 6 ,у вас: " + energy + ".");
							}
						
					   } else if (xarakstrong >= 175) {
							if (energy >= 4) {
								energy -= 4;
								xptravel += 50;
								aoa3sylph -= 0.2;
								xpoxota += 30;
								xarakstrong -= 80;
								System.out.println("------------------");
								System.out.println("Энергия: " + energy + ".");
								System.out.println("Вы убили: Мини босса");
								System.out.println("+ 30 опыта Охоты.");
								System.out.println("+ 50 опыта Путешевствия.");
							} else {
								System.out.println("Вам недостаточно энергии!Нужно 4 ,у вас: " + energy + ".");
					     	}
					   } else if (xarakstrong == 0) {
							if (energy >= 10) {
								energy -= 10;
								xptravel += 30;
								aoa3sylph -= 0.5;
								xpoxota += 10;
								
								System.out.println("------------------");
								System.out.println("Энергия: " + energy + ".");
								System.out.println("Вы убили: Сильфа");
								System.out.println("+ 10 опыта Охоты.");
								System.out.println("+ 30 опыта Путешевствия.");
							} else {
								System.out.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + energy + ".");
							}
						} else {
							if (energy >= 8) {
								xarakstrong -= 20;
								energy -= 8;
								xptravel += 30;
								aoa3sylph -= 0.5;
								xpoxota += 10;
								System.out.println("------------------");
								System.out.println("Энергия: " + energy + ".");
								System.out.println("Вы убили: Сильфа");
								System.out.println("+ 10 опыта Охоты.");
								System.out.println("+ 30 опыта Путешевствия.");
							} else {
								System.out.println("Вам недостаточно энергии!Нужно 8 ,у вас: " + energy + ".");
							}
						}
						
						break;
						case "sleep":
							if (homes > 0) {
									energy = 100;
									System.out.println("Вы успешно ввостановили энергию");
							}
							 else {
								System.out.println("Вам негде спать!Постройте дом!Build SH");
							}
						break;
						case "ce":
							energy = 0;
							System.out.println("Успешно!");
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
				default:
					System.out.println("Неизвестная команда");
			}
		}
	}
	
	public static void pki() {
    	dimesionStones++;
		
		if (dimesionStones == 1) {
			System.out.println("У вас " + dimesionStones + " пустой камень измерений");
		} else if(dimesionStones == 2){
			System.out.println("У вас " + dimesionStones + " пустых камня измерений");
		} else if(dimesionStones == 3){
			System.out.println("У вас " + dimesionStones + " пустых камня измерений");
		} else if (dimesionStones == 4){
			System.out.println("У вас " + dimesionStones + " пустых камня измерений");
		} else {
			System.out.println("У вас " + dimesionStones + " пустих камней измерений");
		}
	}
	public static void stats() {
		System.out.println("__________");
		System.out.println("Мощь: " + xarakstrong + ".");
		System.out.println("__________");
		System.out.println("Энергия: " + xarakenergy + ".");
		System.out.println("__________");
		System.out.println("Анима: " + xarakanima + ".");
		System.out.println("__________");
		System.out.println("Душа: " + xaraksoul + ".");
	}
}

