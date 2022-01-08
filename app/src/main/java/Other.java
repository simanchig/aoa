
import com.simanchig.aoa.*;

public class Other
{
	public static void pki()
	{
    	Main.dimesionStones++;

		if (Main.dimesionStones == 1)
		{
			Console.println("У вас " + Main.dimesionStones + " пустой камень измерений");
		}
		else if (Main.dimesionStones == 2)
		{
			Console.println("У вас " + Main.dimesionStones + " пустых камня измерений");
		}
		else if (Main.dimesionStones == 3)
		{
			Console.println("У вас " + Main.dimesionStones + " пустых камня измерений");
		}
		else if (Main.dimesionStones == 4)
		{
			Console.println("У вас " + Main.dimesionStones + " пустых камня измерений");
		}
		else
		{
			Console.println("У вас " + Main.dimesionStones + " пустих камней измерений");
		}
	}

	public static void stats()
	{
		Console.println("__________");
		Console.println("Мощь: " + Main.xarakstrong + ".");
		Console.println("__________");
		Console.println("Энергия: " + Main.xarakenergy + ".");
		Console.println("__________");
		Console.println("Анима: " + Main.xarakanima + ".");
		Console.println("__________");
		Console.println("Душа: " + Main.xaraksoul + ".");
	}

	public static void checkXp()
	{
		if (Main.xpanima == 100)
		{
			Main.lvlanima = 2;
			Main.energy += 10;
			Console.println("----------------");
			Console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Console.println("Ваша энергия: " + Main.energy + ".");
		}
		else if (Main.xpanima == 300)
		{
			Main.lvlanima = 3;
			Main.energy += 10;
			Console.println("----------------");
			Console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Console.println("Ваша энергия: " + Main.energy + ".");
		}
		else if (Main.xpanima == 800)
		{
			Main.lvlanima = 4;
			Main.energy += 15;
			Console.println("----------------");
			Console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Console.println("Ваша энергия: " + Main.energy + ".");
		}
		else if (Main.xpanima == 1200)
		{
			Main.lvlanima = 5;
			Main.energy += 20;
			Console.println("----------------");
			Console.println("Уровень Анимы повышен до: " + Main.lvlanima + ".");
			Console.println("Ваша энергия: " + Main.energy + ".");
		} 
		if (Main.xpoxota == 150)
		{
			Main.lvloxota = 2;
			Main.energy += 10;
			Console.println("----------------");
			Console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + Main.lvloxota + ".");
			Console.println("Энергия: " + Main.energy + ".");
		}
		else if (Main.xpoxota == 500)
		{
			Main.lvloxota = 3;
			Main.energy += 20;
			Console.println("----------------");
			Console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + Main.lvloxota + ".");
			Console.println("Энергия: " + Main.energy + ".");
		}
		else if (Main.xpoxota == 1000)
		{
			Main.lvloxota = 4;
			Main.energy += 20;
			Console.println("----------------");
			Console.println("Ваш уровень навыка \"Охота\" повышен до уровня: " + Main.lvloxota + ".");
		    Console.println("Энергия: " + Main.energy + ".");
		} if (Main.xptravel == 100)
		{
			Main.lvltravel = 2;
			Main.energy += 10;
			Console.println("----------------");
			Console.println("Ваш уровень Путешевствия повышен до: " + Main.lvltravel + ".");
			Console.println("Энергия: " + Main.energy + ".");
		}
		else if (Main.xptravel == 300)
		{
			Main.lvltravel = 3;
			Main.energy += 10;
			Console.println("----------------");
			Console.println("Ваш уровень Путешевствия повышен до: " + Main.lvltravel + ".");
			Console.println("Энергия: " + Main.energy + ".");
		}
	}

	public static void checkpwaxe()
	{
		if (Main.pwaxe == 0)
		{
			Console.clear();
			Console.println("___________");
			Console.println("Ваш топор развалился!Найдите или сделайте новый,команда: create waxe");
			Main.woodenaxe = 0;
	    }
	}

	public static void checkpwpaxe()
	{
		if (Main.pwpaxe == 0)
		{
			Console.clear();
			Console.println("___________");
			Console.println("Ваша кирка развалилась!Найдите или сделайте новый,команда: create wpaxe");
			Main.woodenpickaxe = 0;
	    }
	}
}
