
public class CommandHandler {
	
	public static void cmdSkills() {
		Main.console.println("----------------");
		Main.console.println("Анима - " + Main.lvlanima + " уровень. Опыт: " + Main.xpanima + "xp.");
	    Main.console.println("----------------");
	    Main.console.println("Охота - " + Main.lvloxota + " уровень. Опыт: " + Main.xpoxota + "xp.");
	    Main.console.println("----------------");
	    Main.console.println("Путешевствие - " + Main.lvltravel + " уровень. Опыт: " + Main.xptravel + "xp.");
		Main.console.println("__________");
		Main.console.println("Другое: ");
		Main.stats();
	}
	
	public static void cmdKill() {
		if (Main.xarakstrong >= 100) {
			if (Main.energy >= 6) {
				Main.energy -= 6;
				Main.xptravel += 40;
				Main.xpoxota += 15;
				Main.xarakstrong -= 60;
				Main.console.println("------------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.console.println("Вы убили: Крипера");
				Main.console.println("+ 15 опыта Охоты.");
				Main.console.println("+ 40 опыта Путешевствия.");
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 6 ,у вас: " + Main.energy + ".");
			}
		
	   } else if (Main.xarakstrong >= 175) {
			if (Main.energy >= 4) {
				Main.energy -= 4;
				Main.xptravel += 50;
				Main.xpoxota += 30;
				Main.xarakstrong -= 80;
				Main.console.println("------------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.console.println("Вы убили: Мини босса");
				Main.console.println("+ 30 опыта Охоты.");
				Main.console.println("+ 50 опыта Путешевствия.");
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 4 ,у вас: " + Main.energy + ".");
	     	}
	   } else if (Main.xarakstrong == 0) {
			if (Main.energy >= 10) {
				Main.energy -= 10;
				Main.xptravel += 30;
				Main.xpoxota += 10;
				
				Main.console.println("------------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.console.println("Вы убили: Сильфа");
				Main.console.println("+ 10 опыта Охоты.");
				Main.console.println("+ 30 опыта Путешевствия.");
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + Main.energy + ".");
			}
		} else {
			if (Main.energy >= 8) {
				Main.xarakstrong -= 20;
				Main.energy -= 8;
				Main.xptravel += 30;
				Main.xpoxota += 10;
				Main.console.println("------------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.console.println("Вы убили: Сильфа");
				Main.console.println("+ 10 опыта Охоты.");
				Main.console.println("+ 30 опыта Путешевствия.");
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 8 ,у вас: " + Main.energy + ".");
			}
		}
	}
	
	public static void cmdSleep() {
		if (Main.homes > 0) {
			Main.energy = 100;
			Main.console.println("Вы успешно ввостановили энергию");
		} else {
			Main.console.println("Вам негде спать! Постройте дом! buildHouse");
		}
	}
	
	public static void cmdBuildPortal() {
		if (Main.energy >= 10) {
			if (Main.homes > 0) {
				if (Main.runestoned >= 12) {
					Main.energy -= 10;
					Main.runestoned -= 12;
					Main.deactivatedportals++;
					Main.console.println("----------------");
					Main.console.println("Энергия: " + Main.energy + ".");
					Main.console.println("Вы успешно построили портал!Чтобы активировать,activate");
				} else {
					Main.console.println("Вам недостаточно Рунического камня!Требуеться 12 ,а у вас: " + Main.runestoned + "камней,команда:for");
				}
			} else {
				Main.console.println("Вам негде размещать портал!Постройте дом,команда:buildHouse.");
			}
		} else {
			Main.console.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmddstats() {
		Main.console.println("----------------");
		Main.console.println("Ваши дома: " + Main.homes + ". Ваши активированные порталы: " + Main.activatedportals + ". Ваши неактивированные порталы: " + Main.deactivatedportals  + ". ");
	}
	
	public static void cmdfor() {
		if (Main.energy >= 5){
			Main.energy -= 5;
			Main.runestoned += 1;
			Main.console.println("Энергия: " + Main.energy + ".");
			Main.console.println("----------------");
			Main.console.println("Вы добыли 1 рунический камень!+ 1 рунический камень");
			Main.console.println("У вас уже: " + Main.runestoned + "Рунического камня.");
			
		} else {
			Main.console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdcreate() {
		if (Main.energy >= 2) {
			Main.pki();
			Main.energy -= 2;
			Main.console.println("----------------");
			Main.console.println("Энергия: " + Main.energy + ".");
		} else {
			Main.console.println("Вам нехватает энергии, Нужно 2 а у вас: " + Main.energy +"поспите: sleep");
		}
	}
	
	public static void cmdmakepyletopia() {
		if (Main.energy >= 5) {
			if (Main.dimesionStones > 0){
				Main.energy -= 5;
				Main.console.println("----------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.dimesionStones--;
				Main.KIpyletopia++;
				Main.console.println("----------------");
				Main.console.println("Вы сделали камень измерения Пылетопии");
			} else if (Main.dimesionStones <= 0){
				Main.console.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
			}
		} else {
			Main.console.println("----------------");
			Main.console.println("Вам недостаточно энергии! Требуется 5, а у вас: " + Main.energy + ".");
		}
		
	}
	
	public static void cmdmakeimmortalis() {
		if (Main.energy >= 5) {
			if (Main.dimesionStones > 0){
				Main.energy -= 5;
				Main.console.println("----------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.dimesionStones--;
				Main.KIimortalis++;
				Main.console.println("----------------");
				Main.console.println("Вы сделали Камень измерения Имморталиса");
			} else if (Main.dimesionStones <= 0){
				Main.console.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
			}
		} else {
			Main.console.println("----------------");
			Main.console.println("Вам недостаточно энергии! Требуется 5, а у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdmakeGortnezya() {
		if(Main.energy >= 5) {
			if (Main.dimesionStones > 0) {
				Main.energy -= 5;
				Main.console.println("----------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.dimesionStones--;
				Main.KIgortenzya++;
				Main.console.println("Вы сделали Камень измерения Гарденсии,чтобы активировать activate Gortenzya");
			} else if (Main.dimesionStones <= 0){
				Main.console.println("Вам недостаточно пустых камней измерения,Сделайте их,команда create");
			}
		} else {
			Main.console.println("Вам недостаточно энергии!Требуеться 5 а у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmddt() {
		if (Main.energy >= 5) {
			if (Main.woodenaxe > 0) {
				Main.energy -= 5;
				Main.console.println("----------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.xptravel += 10;
				Main.xpanima += 5;
				Main.wood += 5;
				Main.console.println("Вы срубили дерево! + 5 древесиных толстых палок");
				Main.console.println("+ 5 опыта Анимы.");
				Main.console.println("+ 10 опыта путешевствия.");
				Main.console.println(Main.wood + "едениц дерева.");
			} else {
				Main.console.println("__________");
				Main.console.println("У вас нет топора!Добудьте его!\n Путешевтвуйте в деревни там будет топор.");
			}

		} else {
			Main.console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdbuildHouse() {
		if (Main.energy >= 30) {
			if (Main.wood >=64){
				Main.energy -= 30;
				Main.console.println("----------------");
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.xptravel += 5;
				Main.wood -= 64;
				Main.homes++;
				Main.console.println("У вас теперь есть маленькая халупа");
				Main.console.println("+ 5 опыта Путешевствия.");
			} else if (Main.wood <=0){
				Main.console.println("Добудьте 64 едениц древесины! Вам не хватает! дт");
			}
		}else {
			Main.console.println("Вам недостаточно энергии!Нужно 30 ,у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdstats() {
		Main.console.println("----------------");
		Main.console.println("Пустых камней измерения: " + Main.dimesionStones + ". Камни Имморталиса: " + Main.KIimortalis + ". Древесины в инвентаре: " + Main.wood + ". Рунического камня: " + Main.runestoned + ". Камней измерения Гортензия: " + Main.KIgortenzya + ".");
		
	}
	
	public static void cmdactivatePYLETOPIA() {
		if (Main.activatedportals == 0) {
			if (Main.energy >= 1) {
				if (Main.deactivatedportals > 0) {
					if (Main.KIpyletopia > 0) {
						Main.energy -= 1;
						Main.console.println("----------------");
						Main.console.println("Энергия: " + Main.energy + ".");
						Main.KIpyletopia--;
						--Main.deactivatedportals;
						Main.activatedportals++;
						Main.console.println("Вы успешно активировали портал в Пылетопию!");
					} else {
						Main.console.println("Вам недастаточно Камней измерения Пылетопии,чтобы сделать make pyletopia");
					}
				} else {
					Main.console.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
				}
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		} else if ( Main.deactivatedportals > Main.activatedportals) {
			if (Main.energy >= 1) {
				if (Main.KIpyletopia > 0) {
					Main.energy -= 1;
					Main.console.println("----------------");
					Main.console.println("Энергия: " + Main.energy + ".");
					Main.KIimortalis--;
					Main.activatedportals++;
					Main.console.println("Вы успешно активировали портал в Пылетопию!");
				} else {
					Main.console.println("Вам недастаточно Камней измерения Пылетопии,чтобы сделать make pyletopia");
				}

			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}  else if (Main.deactivatedportals == 0) {
			Main.console.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
		}
	}
	
	public static void cmdactivateimmortalis() {
		if (Main.activatedportals == 0) {
			if (Main.energy >= 1) {
				if (Main.deactivatedportals > 0) {
					if (Main.KIimortalis > 0) {
						Main.energy -= 1;
						Main.console.println("----------------");
						Main.console.println("Энергия: " + Main.energy + ".");
						Main.KIimortalis--;
						--Main.deactivatedportals;
						Main.activatedportals++;
						Main.console.println("Вы успешно активировали портал в Имморталис!");
					} else {
						Main.console.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
					}
				} else {
					Main.console.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
				}
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		} else if ( Main.deactivatedportals > Main.activatedportals) {
			if (Main.energy >= 1) {
				if (Main.KIimortalis > 0) {
					Main.energy -= 1;
					Main.console.println("----------------");
					Main.console.println("Энергия: " + Main.energy + ".");
					Main.KIimortalis--;
					Main.activatedportals++;
					Main.console.println("Вы успешно активировали портал в Имморталис!");
				} else {
					Main.console.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
				}

			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}  else if (Main.deactivatedportals == 0) {
			Main.console.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
		}
	}
	
	public static void cmdactivateGortenzya() {
		if (Main.activatedportals == 0) {
			if (Main.energy >= 1) {
				if (Main.deactivatedportals > 0) {
					if (Main.KIgortenzya > 0) {
						Main.energy -= 1;
						Main.KIgortenzya--;
						Main.deactivatedportals--;
						Main.activatedportals++;
						Main.console.println("Энергия: " + Main.energy + ".");
						Main.console.println("----------------");
						Main.console.println("Вы успешно активировали портал в Гардензию!");
					} else {
						Main.console.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
					}
				} else {
					Main.console.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
				}
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		} else if (Main.deactivatedportals > Main.activatedportals) {
			if (Main.energy >= 1) {
				if (Main.deactivatedportals > 0) {
					if (Main.KIgortenzya > 0) {
						Main.energy -= 1;
						Main.KIgortenzya--;
						Main.activatedportals++;
						Main.console.println("Энергия: " + Main.energy + ".");
						Main.console.println("----------------");
						Main.console.println("Вы успешно активировали портал в Гардензию!");
					} else {
						Main.console.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
					}
				} else {
					Main.console.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
				}
			} else {
				Main.console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		} else if (Main.deactivatedportals < Main.activatedportals) {
			Main.console.println("У вас нету свободного портала!Постройте его с помощью команды: Build Portal");
		}
		
	}
	
	public static void cmdce() {
		Main.energy = 0;
		Main.console.println("Успешно!");
	}
}
