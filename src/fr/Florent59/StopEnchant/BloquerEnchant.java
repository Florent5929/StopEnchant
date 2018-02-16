package fr.Florent59.StopEnchant;

import org.bukkit.GameMode;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class BloquerEnchant implements Listener {

	@EventHandler (priority = EventPriority.LOW)
	public void QuandUnItemEstEnchant(EnchantItemEvent e){
		Player p = e.getEnchanter();
		if(!p.isOp() && !p.getGameMode().equals(GameMode.CREATIVE)){
		e.setCancelled(true);
		p.sendMessage("Vous n'avez pas l'autorisation d'enchanter !");
		Log.info(p.getName()+ " a essayé d'enchanter !");
		}
		
	}
}
