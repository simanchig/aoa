
public class CommandHandler {
	
	public static void cmdSkills() {
		System.out.println("----------------");
		System.out.println("Анима - " + Main.lvlanima + " уровень. Опыт: " + Main.xpanima + "xp.");
	    System.out.println("----------------");
	    System.out.println("Охота - " + Main.lvloxota + " уровень. Опыт: " + Main.xpoxota + "xp.");
	    System.out.println("----------------");
	    System.out.println("Путешевствие - " + Main.lvltravel + " уровень. Опыт: " + Main.xptravel + "xp.");
		System.out.println("__________");
		System.out.println("Другое: ");
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
				System.out.println("------------------");
				System.out.println("Энергия: " + Main.energy + ".");
				System.out.println("Вы убили: Крипера");
				System.out.println("+ 15 опыта Охоты.");
				System.out.println("+ 40 опыта Путешевствия.");
			} else {
				System.out.println("Вам недостаточно энергии!Нужно 6 ,у вас: " + Main.energy + ".");
			}
		
	   } else if (Main.xarakstrong >= 175) {
			if (Main.energy >= 4) {
				Main.energy -= 4;
				Main.xptravel += 50;
				Main.aoa3sylph -= 0.2;
				Main.xpoxota += 30;
				Main.xarakstrong -= 80;
				System.out.println("------------------");
				System.out.println("Энергия: " + Main.energy + ".");
				System.out.println("Вы убили: Мини босса");
				System.out.println("+ 30 опыта Охоты.");
				System.out.println("+ 50 опыта Путешевствия.");
			} else {
				System.out.println("Вам недостаточно энергии!Нужно 4 ,у вас: " + Main.energy + ".");
	     	}
	   } else if (Main.xarakstrong == 0) {
			if (Main.energy >= 10) {
				Main.energy -= 10;
				Main.xptravel += 30;
				Main.aoa3sylph -= 0.5;
				Main.xpoxota += 10;
				
				System.out.println("------------------");
				System.out.println("Энергия: " + Main.energy + ".");
				System.out.println("Вы убили: Сильфа");
				System.out.println("+ 10 опыта Охоты.");
				System.out.println("+ 30 опыта Путешевствия.");
			} else {
				System.out.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + Main.energy + ".");
			}
		} else {
			if (Main.energy >= 8) {
				Main.xarakstrong -= 20;
				Main.energy -= 8;
				Main.xptravel += 30;
				Main.aoa3sylph -= 0.5;
				Main.xpoxota += 10;
				System.out.println("------------------");
				System.out.println("Энергия: " + Main.energy + ".");
				System.out.println("Вы убили: Сильфа");
				System.out.println("+ 10 опыта Охоты.");
				System.out.println("+ 30 опыта Путешевствия.");
			} else {
				System.out.println("Вам недостаточно энергии!Нужно 8 ,у вас: " + Main.energy + ".");
			}
		}
	}
	
	public static void cmdSleep() {
		if (Main.homes > 0) {
			Main.energy = 100;
			System.out.println("Вы успешно ввостановили энергию");
		} else {
			System.out.println("Вам негде спать! Постройте дом! buildHouse");
		}
	}
	
	public static void cmdBuildPortal() {
		if (Main.energy >= 10) {
			if (Main.homes > 0) {
				if (Main.runestoned >= 12) {
					Main.energy -= 10;
					Main.runestoned -= 12;
					Main.deactivatedportals++;
					System.out.println("----------------");
					System.out.println("Энергия: " + Main.energy + ".");
					System.out.println("Вы успешно построили портал!Чтобы активировать,activate");
				} else {
					System.out.println("Вам недостаточно Рунического камня!Требуеться 12 ,а у вас: " + Main.runestoned + "камней,команда:for");
				}
			} else {
				System.out.println("Вам негде размещать портал!Постройте дом,команда:buildHouse.");
			}
		} else {
			System.out.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + Main.energy + ".");
		}
	}
}
