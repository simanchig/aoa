
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
				Main.aoa3sylph -= 0.4;
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
				Main.aoa3sylph -= 0.2;
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
				Main.aoa3sylph -= 0.5;
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
				Main.aoa3sylph -= 0.5;
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
}
