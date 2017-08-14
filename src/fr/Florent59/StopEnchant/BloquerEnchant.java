package fr.Florent59.StopEnchant;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class BloquerEnchant implements Listener {

	@EventHandler (priority = EventPriority.LOW)
	public void QuandUnItemEstEnchant(EnchantItemEvent e){
		Player p = e.getEnchanter();
		if(!p.isOp()){
		e.setCancelled(true);
		}
		
	}
}
