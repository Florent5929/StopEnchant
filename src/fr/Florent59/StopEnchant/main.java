package fr.Florent59.StopEnchant;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	@Override
	public void onEnable(){
		super.onEnable();
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BloquerEnchant(), this);
		
	}
	
}