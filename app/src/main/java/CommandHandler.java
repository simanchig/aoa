
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
		other.stats();
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
			if(Main.woodenpickaxe >= 1) {
				Main.pwpaxe -= 10;
				Main.energy -= 5;
				Main.runestoned += 1;
				Main.console.println("Энергия: " + Main.energy + ".");
				Main.console.println("----------------");
				Main.console.println("Вы добыли 1 рунический камень!+ 1 рунический камень");
				Main.console.println("У вас уже: " + Main.runestoned + "Рунического камня.");
			} else {
				Main.console.println("У вас нету кирки!");
			}
			
		} else {
			Main.console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdcreate() {
		if (Main.energy >= 2) {
			other.pki();
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
				Main.pwaxe -= 2;
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
				Main.console.println("Прочность вашего топора: " + Main.pwaxe + ".");
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
	
	public static void cmdhos() {
		Main.console.println("___________");
		Main.console.println("Помощь по Сюжету:");
		Main.console.println("Чтобы активировать Сюжет -> as");
		Main.console.println("___________");
		Main.console.println("Подсказка по Сюжету: Не забывайте про порталы!\nКоманда help для помощи,для подробной информации -> hp");
		
	}
	
	public static void cmdhp() {
		Main.console.clear();
		Main.console.println("___________");
		Main.console.println("1.Сделайте ПКИ(Пустой камень измерения) -> create");
		Main.console.println("2. Сделайте камень измерения любого измерения(Подробнее: hki) Пример: make Immortalis");
		Main.console.println("3. Постройте портал!Требования: 12 рунического камня(чтобы добыть for) Пример: Build Portal");
		Main.console.println("4. Активируйте портал ,пример: activate Pyletopia");
	}
	
	public static void cmdhi() {
		Main.console.clear();
		Main.console.println("___________");
		Main.console.println("Список измерений(На данный момент их всего:3): ");
		Main.console.println("1.Пылетопия-Измерение пыли и темноты,индекс - Pyletopia");
		Main.console.println("2. Имморталис - Измерение,пещера и лабринт! индекс- Immortalis");
		Main.console.println("3. Гардензия - Измерение цветов и травы ,индекс - Gortenzya");
	}
	
	public static void cmdptVillage() {
		if (Main.energy >= 45) {
			if (Main.woodenaxe == 0){
				Main.woodenaxe = 1;
			} 
			Main.xptravel += 20;
			Main.energy -= 45;
			Main.console.println("__________");
			Main.console.println("Вы пошли искать деревню, и залутали её");
			Main.console.println("+ 20 опыта к навыку: Путешевствие");
			Main.console.println("- 45 Энергии ,у вас теперь: " + Main.energy +".");
		} else {
			Main.console.println("Вам недостаточно энергии чтобы начать путешевствие!\n Надо 45 а у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdcreatewaxe() {
		if(Main.energy >= 4) {
			if(Main.sticks >= 2 && Main.wood >= 3) {
				Main.energy -= 4;
				Main.woodenaxe = 1;
				Main.pwaxe = 200;
				Main.console.println("Вы сделали Деревянный топор!Прочность: " + Main.pwaxe +"/200");
			} else if(Main.sticks < 2 && Main.wood >= 3) {
				Main.console.println("__________");
				Main.console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Main.console.println("Чтобы сделать: create Sticks");
			} else if(Main.sticks >= 2 && Main.wood < 3) {
				Main.console.println("__________");
				Main.console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Main.console.println("Чтобы добыть: dt");
			} else if (Main.sticks < 2 && Main.wood <3) {
				Main.console.println("__________");
				Main.console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Main.console.println("Чтобы добыть: dt");
				Main.console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Main.console.println("Чтобы сделать: create Sticks");
				
			}
		} else {
			Main.console.println("Вам недостаточно энергии!Надо 4 ,а у вас: " + Main.energy + ".");
		}
	}
	
	public static void cmdcreatewpaxe() {
		if(Main.energy >= 4) {
			if(Main.sticks >= 2 && Main.wood >= 3) {
				Main.energy -= 4;
				Main.woodenpickaxe = 1;
				Main.pwpaxe = 200;
				Main.console.println("Вы сделали деревянную кирку!Прочность: " + Main.pwpaxe +"/200");
			} else if(Main.sticks < 2 && Main.wood >= 3) {
				Main.console.println("__________");
				Main.console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Main.console.println("Чтобы сделать: create Sticks");
			} else if(Main.sticks >= 2 && Main.wood < 3) {
				Main.console.println("__________");
				Main.console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Main.console.println("Чтобы добыть: dt");
			} else if (Main.sticks < 2 && Main.wood <3) {
				Main.console.println("__________");
				Main.console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Main.console.println("Чтобы добыть: dt");
				Main.console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Main.console.println("Чтобы сделать: create Sticks");

			}
		} else {
			Main.console.println("Вам недостаточно энергии!Надо 4 ,а у вас: " + Main.energy + ".");
		}
	}
	
	public static  void cmdcreatesticks() {
		if(Main.energy >= 2) {
			if(Main.wood >= 2) {
				Main.sticks += 4;
				Main.wood -= 2;
				Main.energy -= 2;
				Main.console.println("__________");
				Main.console.println("Вы создали 4 палки!");
				Main.console.println("- 2 Древесины, у вас теперь: " + Main.wood + ".");
				Main.console.println(" - 2 Энергии, у вас теперь: " + Main.energy + ".");
			} else {
				Main.console.println("Вам недостаточно древесины!Надо 2 ,у вас: " + Main.wood + ".");
			}
		} else {
			Main.console.println("Вам недостаточно энергии!Надо 2 ,у вас: " + Main.energy + ".");
		}
    }
	
	public static void  cmdas() {
		Main.console.println("Сюжет активирован,начните игру сюжет начнеться когда вы будете путешевствовать по деревням.");
	}
}
