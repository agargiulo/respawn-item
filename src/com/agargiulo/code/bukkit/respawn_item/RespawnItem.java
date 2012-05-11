
package com.agargiulo.code.bukkit.respawn_item;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Anthony Gargiulo (anthony@agargiulo.com)
 * 
 */
public class RespawnItem extends JavaPlugin implements Listener
{

	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}

	/**
	 * Give every player that respawns a single gold nugget.
	 * 
	 * @param event
	 */
	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent event)
	{
		event.getPlayer().getInventory()
				.addItem(new ItemStack(Material.GOLD_NUGGET));
	}

}