public class other
{
	public static void pki() {
    	Main.dimesionStones++;

		if (Main.dimesionStones == 1) {
			Main.console.println("У вас " + Main.dimesionStones + " пустой камень измерений");
		} else if(Main.dimesionStones == 2){
			Main.console.println("У вас " + Main.dimesionStones + " пустых камня измерений");
		} else if(Main.dimesionStones == 3){
			Main.console.println("У вас " + Main.dimesionStones + " пустых камня измерений");
		} else if (Main.dimesionStones == 4){
			Main.console.println("У вас " + Main.dimesionStones + " пустых камня измерений");
		} else {
			Main.console.println("У вас " + Main.dimesionStones + " пустих камней измерений");
		}
	}
	
	public static void stats() {
		Main.console.println("__________");
		Main.console.println("Мощь: " + Main.xarakstrong + ".");
		Main.console.println("__________");
		Main.console.println("Энергия: " + Main.xarakenergy + ".");
		Main.console.println("__________");
		Main.console.println("Анима: " + Main.xarakanima + ".");
		Main.console.println("__________");
		Main.console.println("Душа: " + Main.xaraksoul + ".");
	}
	
	public static void checkXp() {
		if (Main.xpanima == 100) {
			Main.lvlanima = 2;
			Main.energy += 10;
			Main.console.println("----------------");
			Main.console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Main.console.println("Ваша энергия: " + Main.energy + ".");
		} else if (Main.xpanima == 300) {
			Main.lvlanima = 3;
			Main.energy += 10;
			Main.console.println("----------------");
			Main.console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Main.console.println("Ваша энергия: " + Main.energy + ".");
		} else if (Main.xpanima == 800) {
			Main.lvlanima = 4;
			Main.energy += 15;
			Main.console.println("----------------");
			Main.console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Main.console.println("Ваша энергия: " + Main.energy + ".");
		} else if (Main.xpanima == 1200) {
			Main.lvlanima = 5;
			Main.energy += 20;
			Main.console.println("----------------");
			Main.console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Main.console.println("Ваша энергия: " + Main.energy + ".");
		} 
		if (Main.xpoxota == 150) {
			Main.lvloxota = 2;
			Main.energy += 10;
			Main.console.println("----------------");
			Main.console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + Main.lvloxota + ".");
			Main.console.println("Энергия: " + Main.energy + ".");
		} else if (Main.xpoxota == 500) {
			Main.lvloxota = 3;
			Main.energy += 20;
			Main.console.println("----------------");
			Main.console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + Main.lvloxota + ".");
			Main.console.println("Энергия: " + Main.energy + ".");
		} else if (Main.xpoxota == 1000) {
			Main.lvloxota = 4;
			Main.energy += 20;
			Main.console.println("----------------");
			Main.console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + Main.lvloxota + ".");
		    Main.console.println("Энергия: " + Main.energy + ".");
		} if (Main.xptravel == 100) {
			Main.lvltravel = 2;
			Main.energy += 10;
			Main.console.println("----------------");
			Main.console.println("Ваш уровень Путешевствия повышен до: " + Main.lvltravel + ".");
			Main.console.println("Энергия: " + Main.energy + ".");
		} else if (Main.xptravel == 300) {
			Main.lvltravel = 3;
			Main.energy += 10;
			Main.console.println("----------------");
			Main.console.println("Ваш уровень Путешевствия повышен до: " + Main.lvltravel + ".");
			Main.console.println("Энергия: " + Main.energy + ".");
		}
	}
	
	public static void checkpwaxe() {
		if(Main.pwaxe == 0) {
			Main.console.clear();
			Main.console.println("___________");
			Main.console.println("Ваш топор развалился!Найдите или сделайте новый,команда: create waxe");
			Main.woodenaxe = 0;
	    }
	}
}
