
import com.simanchig.aoa.*;

public class CommandHandler
{
	public static void cmdSkills()
	{
		Console.println("----------------");
		Console.println("Анима - " + Main.lvlanima + " уровень. Опыт: " + Main.xpanima + "xp.");
	    Console.println("----------------");
	    Console.println("Охота - " + Main.lvloxota + " уровень. Опыт: " + Main.xpoxota + "xp.");
	    Console.println("----------------");
	    Console.println("Путешевствие - " + Main.lvltravel + " уровень. Опыт: " + Main.xptravel + "xp.");
		Console.println("__________");
		Console.println("Другое: ");
		other.stats();
	}

	public static void cmdKill()
	{
		if (Main.xarakstrong >= 100)
		{
			if (Main.energy >= 6)
			{
				Main.energy -= 6;
				Main.xptravel += 40;
				Main.xpoxota += 15;
				Main.xarakstrong -= 60;
				Console.println("------------------");
				Console.println("Энергия: " + Main.energy + ".");
				Console.println("Вы убили: Крипера");
				Console.println("+ 15 опыта Охоты.");
				Console.println("+ 40 опыта Путешевствия.");
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 6 ,у вас: " + Main.energy + ".");
			}

		}
		else if (Main.xarakstrong >= 175)
		{
			if (Main.energy >= 4)
			{
				Main.energy -= 4;
				Main.xptravel += 50;
				Main.xpoxota += 30;
				Main.xarakstrong -= 80;
				Console.println("------------------");
				Console.println("Энергия: " + Main.energy + ".");
				Console.println("Вы убили: Мини босса");
				Console.println("+ 30 опыта Охоты.");
				Console.println("+ 50 опыта Путешевствия.");
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 4 ,у вас: " + Main.energy + ".");
	     	}
		}
		else if (Main.xarakstrong == 0)
		{
			if (Main.energy >= 10)
			{
				Main.energy -= 10;
				Main.xptravel += 30;
				Main.xpoxota += 10;

				Console.println("------------------");
				Console.println("Энергия: " + Main.energy + ".");
				Console.println("Вы убили: Сильфа");
				Console.println("+ 10 опыта Охоты.");
				Console.println("+ 30 опыта Путешевствия.");
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + Main.energy + ".");
			}
		}
		else
		{
			if (Main.energy >= 8)
			{
				Main.xarakstrong -= 20;
				Main.energy -= 8;
				Main.xptravel += 30;
				Main.xpoxota += 10;
				Console.println("------------------");
				Console.println("Энергия: " + Main.energy + ".");
				Console.println("Вы убили: Сильфа");
				Console.println("+ 10 опыта Охоты.");
				Console.println("+ 30 опыта Путешевствия.");
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 8 ,у вас: " + Main.energy + ".");
			}
		}
	}

	public static void cmdSleep()
	{
		if (Main.homes > 0)
		{
			Main.energy = 100;
			Console.println("Вы успешно ввостановили энергию");
		}
		else
		{
			Console.println("Вам негде спать! Постройте дом! buildHouse");
		}
	}

	public static void cmdBuildPortal()
	{
		if (Main.energy >= 10)
		{
			if (Main.homes > 0)
			{
				if (Main.runestoned >= 12)
				{
					Main.energy -= 10;
					Main.runestoned -= 12;
					Main.deactivatedportals++;
					Console.println("----------------");
					Console.println("Энергия: " + Main.energy + ".");
					Console.println("Вы успешно построили портал!Чтобы активировать,activate");
				}
				else
				{
					Console.println("Вам недостаточно Рунического камня!Требуеться 12 ,а у вас: " + Main.runestoned + "камней,команда:for");
				}
			}
			else
			{
				Console.println("Вам негде размещать портал!Постройте дом,команда:buildHouse.");
			}
		}
		else
		{
			Console.println("Вам недостаточно энергии!Нужно 10 ,у вас: " + Main.energy + ".");
		}
	}

	public static void cmddstats()
	{
		Console.println("----------------");
		Console.println("Ваши дома: " + Main.homes + ". Ваши активированные порталы: " + Main.activatedportals + ". Ваши неактивированные порталы: " + Main.deactivatedportals  + ". ");
	}

	public static void cmdfor()
	{
		if (Main.energy >= 5)
		{
			if (Main.woodenpickaxe >= 1)
			{
				Main.pwpaxe -= 10;
				Main.energy -= 5;
				Main.runestoned += 1;
				Console.println("Энергия: " + Main.energy + ".");
				Console.println("----------------");
				Console.println("Вы добыли 1 рунический камень!+ 1 рунический камень");
				Console.println("У вас уже: " + Main.runestoned + "Рунического камня.");
			}
			else
			{
				Console.println("У вас нету кирки!");
			}

		}
		else
		{
			Console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + Main.energy + ".");
		}
	}

	public static void cmdcreate()
	{
		if (Main.energy >= 2)
		{
			other.pki();
			Main.energy -= 2;
			Console.println("----------------");
			Console.println("Энергия: " + Main.energy + ".");
		}
		else
		{
			Console.println("Вам нехватает энергии, Нужно 2 а у вас: " + Main.energy + "поспите: sleep");
		}
	}

	public static void cmdmakepyletopia()
	{
		if (Main.energy >= 5)
		{
			if (Main.dimesionStones > 0)
			{
				Main.energy -= 5;
				Console.println("----------------");
				Console.println("Энергия: " + Main.energy + ".");
				Main.dimesionStones--;
				Main.KIpyletopia++;
				Console.println("----------------");
				Console.println("Вы сделали камень измерения Пылетопии");
			}
			else if (Main.dimesionStones <= 0)
			{
				Console.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
			}
		}
		else
		{
			Console.println("----------------");
			Console.println("Вам недостаточно энергии! Требуется 5, а у вас: " + Main.energy + ".");
		}

	}

	public static void cmdmakeimmortalis()
	{
		if (Main.energy >= 5)
		{
			if (Main.dimesionStones > 0)
			{
				Main.energy -= 5;
				Console.println("----------------");
				Console.println("Энергия: " + Main.energy + ".");
				Main.dimesionStones--;
				Main.KIimortalis++;
				Console.println("----------------");
				Console.println("Вы сделали Камень измерения Имморталиса");
			}
			else if (Main.dimesionStones <= 0)
			{
				Console.println("Вам недостаточно пустых камней измерения, сделайте их, команда: create");
			}
		}
		else
		{
			Console.println("----------------");
			Console.println("Вам недостаточно энергии! Требуется 5, а у вас: " + Main.energy + ".");
		}
	}

	public static void cmdmakeGortnezya()
	{
		if (Main.energy >= 5)
		{
			if (Main.dimesionStones > 0)
			{
				Main.energy -= 5;
				Console.println("----------------");
				Console.println("Энергия: " + Main.energy + ".");
				Main.dimesionStones--;
				Main.KIgortenzya++;
				Console.println("Вы сделали Камень измерения Гарденсии,чтобы активировать activate Gortenzya");
			}
			else if (Main.dimesionStones <= 0)
			{
				Console.println("Вам недостаточно пустых камней измерения,Сделайте их,команда create");
			}
		}
		else
		{
			Console.println("Вам недостаточно энергии!Требуеться 5 а у вас: " + Main.energy + ".");
		}
	}

	public static void cmddt()
	{
		if (Main.energy >= 5)
		{
			if (Main.woodenaxe > 0)
			{
				Main.pwaxe -= 2;
				Main.energy -= 5;
				Console.println("----------------");
				Console.println("Энергия: " + Main.energy + ".");
				Main.xptravel += 10;
				Main.xpanima += 5;
				Main.wood += 5;
				Console.println("Вы срубили дерево! + 5 древесиных толстых палок");
				Console.println("+ 5 опыта Анимы.");
				Console.println("+ 10 опыта путешевствия.");
				Console.println(Main.wood + "едениц дерева.");
				Console.println("Прочность вашего топора: " + Main.pwaxe + ".");
			}
			else
			{
				Console.println("__________");
				Console.println("У вас нет топора!Добудьте его!\n Путешевтвуйте в деревни там будет топор.");
			}

		}
		else
		{
			Console.println("Вам недостаточно энергии!Нужно 5 ,у вас: " + Main.energy + ".");
		}
	}

	public static void cmdbuildHouse()
	{
		if (Main.energy >= 30)
		{
			if (Main.wood >= 64)
			{
				Main.energy -= 30;
				Console.println("----------------");
				Console.println("Энергия: " + Main.energy + ".");
				Main.xptravel += 5;
				Main.wood -= 64;
				Main.homes++;
				Console.println("У вас теперь есть маленькая халупа");
				Console.println("+ 5 опыта Путешевствия.");
			}
			else if (Main.wood <= 0)
			{
				Console.println("Добудьте 64 едениц древесины! Вам не хватает! дт");
			}
		}
		else
		{
			Console.println("Вам недостаточно энергии!Нужно 30 ,у вас: " + Main.energy + ".");
		}
	}

	public static void cmdstats()
	{
		Console.println("----------------");
		Console.println("Пустых камней измерения: " + Main.dimesionStones + ". Камни Имморталиса: " + Main.KIimortalis + ". Древесины в инвентаре: " + Main.wood + ". Рунического камня: " + Main.runestoned + ". Камней измерения Гортензия: " + Main.KIgortenzya + ".");

	}

	public static void cmdactivatePYLETOPIA()
	{
		if (Main.activatedportals == 0)
		{
			if (Main.energy >= 1)
			{
				if (Main.deactivatedportals > 0)
				{
					if (Main.KIpyletopia > 0)
					{
						Main.energy -= 1;
						Console.println("----------------");
						Console.println("Энергия: " + Main.energy + ".");
						Main.KIpyletopia--;
						--Main.deactivatedportals;
						Main.activatedportals++;
						Console.println("Вы успешно активировали портал в Пылетопию!");
					}
					else
					{
						Console.println("Вам недастаточно Камней измерения Пылетопии,чтобы сделать make pyletopia");
					}
				}
				else
				{
					Console.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
				}
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}
		else if (Main.deactivatedportals > Main.activatedportals)
		{
			if (Main.energy >= 1)
			{
				if (Main.KIpyletopia > 0)
				{
					Main.energy -= 1;
					Console.println("----------------");
					Console.println("Энергия: " + Main.energy + ".");
					Main.KIimortalis--;
					Main.activatedportals++;
					Console.println("Вы успешно активировали портал в Пылетопию!");
				}
				else
				{
					Console.println("Вам недастаточно Камней измерения Пылетопии,чтобы сделать make pyletopia");
				}

			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}
		else if (Main.deactivatedportals == 0)
		{
			Console.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
		}
	}

	public static void cmdactivateimmortalis()
	{
		if (Main.activatedportals == 0)
		{
			if (Main.energy >= 1)
			{
				if (Main.deactivatedportals > 0)
				{
					if (Main.KIimortalis > 0)
					{
						Main.energy -= 1;
						Console.println("----------------");
						Console.println("Энергия: " + Main.energy + ".");
						Main.KIimortalis--;
						--Main.deactivatedportals;
						Main.activatedportals++;
						Console.println("Вы успешно активировали портал в Имморталис!");
					}
					else
					{
						Console.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
					}
				}
				else
				{
					Console.println("У вас нету построеного портала в доме! Постройте его Build Portal!");
				}
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}
		else if (Main.deactivatedportals > Main.activatedportals)
		{
			if (Main.energy >= 1)
			{
				if (Main.KIimortalis > 0)
				{
					Main.energy -= 1;
					Console.println("----------------");
					Console.println("Энергия: " + Main.energy + ".");
					Main.KIimortalis--;
					Main.activatedportals++;
					Console.println("Вы успешно активировали портал в Имморталис!");
				}
				else
				{
					Console.println("Вам недастаточно Камней измерения Имморталиса,чтобы сделать make");
				}

			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}
		else if (Main.deactivatedportals == 0)
		{
			Console.println("У вас нету свободных порталов!Постройте его!Команда Build Portal");
		}
	}

	public static void cmdactivateGortenzya()
	{
		if (Main.activatedportals == 0)
		{
			if (Main.energy >= 1)
			{
				if (Main.deactivatedportals > 0)
				{
					if (Main.KIgortenzya > 0)
					{
						Main.energy -= 1;
						Main.KIgortenzya--;
						Main.deactivatedportals--;
						Main.activatedportals++;
						Console.println("Энергия: " + Main.energy + ".");
						Console.println("----------------");
						Console.println("Вы успешно активировали портал в Гардензию!");
					}
					else
					{
						Console.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
					}
				}
				else
				{
					Console.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
				}
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}
		else if (Main.deactivatedportals > Main.activatedportals)
		{
			if (Main.energy >= 1)
			{
				if (Main.deactivatedportals > 0)
				{
					if (Main.KIgortenzya > 0)
					{
						Main.energy -= 1;
						Main.KIgortenzya--;
						Main.activatedportals++;
						Console.println("Энергия: " + Main.energy + ".");
						Console.println("----------------");
						Console.println("Вы успешно активировали портал в Гардензию!");
					}
					else
					{
						Console.println("Вам недастаточно Камней измерения Гардензия,чтобы сделать make");
					}
				}
				else
				{
					Console.println("У вас нету построеного портала в доме!Постройте его Build Portal!");
				}
			}
			else
			{
				Console.println("Вам недостаточно энергии!Нужно 1 ,у вас: " + Main.energy + ".");
			}
		}
		else if (Main.deactivatedportals < Main.activatedportals)
		{
			Console.println("У вас нету свободного портала!Постройте его с помощью команды: Build Portal");
		}

	}

	public static void cmdce()
	{
		Main.energy = 0;
		Console.println("Успешно!");
	}

	public static void cmdhos()
	{
		Console.println("___________");
		Console.println("Помощь по Сюжету:");
		Console.println("Чтобы активировать Сюжет -> as");
		Console.println("___________");
		Console.println("Подсказка по Сюжету: Не забывайте про порталы!\nКоманда help для помощи,для подробной информации -> hp");

	}

	public static void cmdhp()
	{
		Console.clear();
		Console.println("___________");
		Console.println("1.Сделайте ПКИ(Пустой камень измерения) -> create");
		Console.println("2. Сделайте камень измерения любого измерения(Подробнее: hki) Пример: make Immortalis");
		Console.println("3. Постройте портал!Требования: 12 рунического камня(чтобы добыть for) Пример: Build Portal");
		Console.println("4. Активируйте портал ,пример: activate Pyletopia");
	}

	public static void cmdhi()
	{
		Console.clear();
		Console.println("___________");
		Console.println("Список измерений(На данный момент их всего:3): ");
		Console.println("1.Пылетопия-Измерение пыли и темноты,индекс - Pyletopia");
		Console.println("2. Имморталис - Измерение,пещера и лабринт! индекс- Immortalis");
		Console.println("3. Гардензия - Измерение цветов и травы ,индекс - Gortenzya");
	}

	public static void cmdptVillage()
	{
		if (Main.energy >= 45)
		{
			if (Main.woodenaxe == 0)
			{
				Main.woodenaxe = 1;
			} 
			Main.xptravel += 20;
			Main.energy -= 45;
			Console.println("__________");
			Console.println("Вы пошли искать деревню, и залутали её");
			Console.println("+ 20 опыта к навыку: Путешевствие");
			Console.println("- 45 Энергии ,у вас теперь: " + Main.energy + ".");
		}
		else
		{
			Console.println("Вам недостаточно энергии чтобы начать путешевствие!\n Надо 45 а у вас: " + Main.energy + ".");
		}
	}

	public static void cmdcreatewaxe()
	{
		if (Main.energy >= 4)
		{
			if (Main.sticks >= 2 && Main.wood >= 3)
			{
				Main.energy -= 4;
				Main.woodenaxe = 1;
				Main.pwaxe = 200;
				Console.println("Вы сделали Деревянный топор!Прочность: " + Main.pwaxe + "/200");
			}
			else if (Main.sticks < 2 && Main.wood >= 3)
			{
				Console.println("__________");
				Console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Console.println("Чтобы сделать: create Sticks");
			}
			else if (Main.sticks >= 2 && Main.wood < 3)
			{
				Console.println("__________");
				Console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Console.println("Чтобы добыть: dt");
			}
			else if (Main.sticks < 2 && Main.wood < 3)
			{
				Console.println("__________");
				Console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Console.println("Чтобы добыть: dt");
				Console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Console.println("Чтобы сделать: create Sticks");

			}
		}
		else
		{
			Console.println("Вам недостаточно энергии!Надо 4 ,а у вас: " + Main.energy + ".");
		}
	}

	public static void cmdcreatewpaxe()
	{
		if (Main.energy >= 4)
		{
			if (Main.sticks >= 2 && Main.wood >= 3)
			{
				Main.energy -= 4;
				Main.woodenpickaxe = 1;
				Main.pwpaxe = 200;
				Console.println("Вы сделали деревянную кирку!Прочность: " + Main.pwpaxe + "/200");
			}
			else if (Main.sticks < 2 && Main.wood >= 3)
			{
				Console.println("__________");
				Console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Console.println("Чтобы сделать: create Sticks");
			}
			else if (Main.sticks >= 2 && Main.wood < 3)
			{
				Console.println("__________");
				Console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Console.println("Чтобы добыть: dt");
			}
			else if (Main.sticks < 2 && Main.wood < 3)
			{
				Console.println("__________");
				Console.println("Вам недостаточно Древесины!Надо 3 ,у вас: " + Main.wood + ".");
				Console.println("Чтобы добыть: dt");
				Console.println("Вам недостаточно палок!Надо 2 ,у вас: " + Main.sticks + ".");
				Console.println("Чтобы сделать: create Sticks");

			}
		}
		else
		{
			Console.println("Вам недостаточно энергии!Надо 4 ,а у вас: " + Main.energy + ".");
		}
	}

	public static  void cmdcreatesticks()
	{
		if (Main.energy >= 2)
		{
			if (Main.wood >= 2)
			{
				Main.sticks += 4;
				Main.wood -= 2;
				Main.energy -= 2;
				Console.println("__________");
				Console.println("Вы создали 4 палки!");
				Console.println("- 2 Древесины, у вас теперь: " + Main.wood + ".");
				Console.println(" - 2 Энергии, у вас теперь: " + Main.energy + ".");
			}
			else
			{
				Console.println("Вам недостаточно древесины!Надо 2 ,у вас: " + Main.wood + ".");
			}
		}
		else
		{
			Console.println("Вам недостаточно энергии!Надо 2 ,у вас: " + Main.energy + ".");
		}
    }

	public static void  cmdas()
	{
		Console.println("Сюжет активирован,начните игру сюжет начнеться когда вы будете путешевствовать по деревням.");
		AoAS1TOM.beggin();
	}

	public static void cmdreset()
	{
		Main.dimesionStones = 0;
		Main.KIimortalis = 0;
		Main.KIgortenzya = 0;
		Main.KIpyletopia = 0;
		Main.wood = 0;
		Main.runestoned = 0;
		Main.sticks = 0;
		Main.homes = 0;
		Main.activatedportals = 0;
		Main.deactivatedportals = 0;
		Main.lvlanima = 1;
		Main.xpanima = 0;
		Main.lvloxota = 1;
		Main.xpoxota = 0;
		Main.lvltravel = 1;
		Main.xptravel = 0;
		Main.xarakstrong = 200;
		Main.xaraksoul = 200;
		Main.xarakenergy = 200;
		Main.xarakanima = 200;
		Main.energy = 150;
		Main.woodenaxe = 0;
		Main.pwaxe = 200;
		Main.woodenpickaxe = 0;
		Main.pwpaxe = 200;
		Main.checkTtoVillage = false;
		Main.amountPTV = 0;

	}
}
