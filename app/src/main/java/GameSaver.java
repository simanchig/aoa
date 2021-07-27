import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.FileSystems;

public class GameSaver {
	
	final static String execDir = "/sdcard/AppProjects/";
	
	public static void reset() {
		Main.deactivatedportals = 0;
		Main.activatedportals = 0;
		Main.dimesionStones = 0;
		Main.KIimortalis = 0;
		Main.KIgortenzya = 0;
		Main.xarakstrong = 200;
		Main.xarakenergy = 200;
		Main.runestoned = 0;
		Main.xarakanima = 200;
		Main.lvltravel = 1;
		Main.xaraksoul = 200;
		Main.xptravel = 0;
		Main.lvlanima = 1;
		Main.lvloxota = 1;
		Main.xpanima = 0;
		Main.xpoxota = 0;
		Main.energy = 100;
		Main.homes = 0;
		Main.wood = 0;
		
		File saveFile = new File(execDir + "save.data");
		if(saveFile.exists()) saveFile.delete();
	}
	
	public static void save() {
		FileOutputStream fos = null;
	    DataOutputStream dos = null;
	    
        try {
			fos = new FileOutputStream(execDir + "save.data");
			dos = new DataOutputStream(fos);
			
			dos.writeInt(Main.deactivatedportals);
			dos.writeInt(Main.activatedportals);
			dos.writeInt(Main.dimesionStones);
			dos.writeInt(Main.KIimortalis);
			dos.writeInt(Main.KIgortenzya);
			dos.writeInt(Main.xarakstrong);
			dos.writeInt(Main.xarakenergy);
			dos.writeInt(Main.runestoned);
			dos.writeInt(Main.xarakanima);
			dos.writeInt(Main.lvltravel);
			dos.writeInt(Main.xaraksoul);
			dos.writeInt(Main.xptravel);
			dos.writeInt(Main.lvlanima);
			dos.writeInt(Main.lvloxota);
			dos.writeInt(Main.xpanima);
			dos.writeInt(Main.xpoxota);
			dos.writeInt(Main.energy);
			dos.writeInt(Main.homes);
			dos.writeInt(Main.wood);
			
			
			dos.flush();
			
			fos.close();
	        dos.close();
		} catch (Exception e) {
			System.out.println("Ошибка сохранения игры! Детали: " + e.getMessage());
		}
	}
	
	public static void load() {
		File saveFile = new File(execDir + "save.data");
		if(!saveFile.exists()) {
			System.out.println("Ошибка загрузки сохранения, его не найдено.");
			return;
		}
		
		FileInputStream fis = null;
	    DataInputStream dis = null;
	    
        try {
        	fis = new FileInputStream(execDir + "save.data");
        	dis = new DataInputStream(fis);
			
			Main.deactivatedportals = dis.readInt();
			Main.activatedportals = dis.readInt();
			Main.dimesionStones = dis.readInt();
			Main.KIimortalis = dis.readInt();
			Main.KIgortenzya = dis.readInt();
			Main.xarakstrong = dis.readInt();
			Main.xarakenergy = dis.readInt();
			Main.runestoned = dis.readInt();
			Main.xarakanima = dis.readInt();
			Main.lvltravel = dis.readInt();
			Main.xaraksoul = dis.readInt();
			Main.xptravel = dis.readInt();
			Main.lvlanima = dis.readInt();
			Main.lvloxota = dis.readInt();
			Main.xpanima = dis.readInt();
			Main.xpoxota = dis.readInt();
			Main.energy = dis.readInt();
			Main.homes = dis.readInt();
			Main.wood = dis.readInt();
			
			
			fis.close();
	        dis.close();
		} catch (Exception e) {
			System.out.println("Ошибка загрузки игры. Детали: " + e.getMessage());
		}
	}
}
