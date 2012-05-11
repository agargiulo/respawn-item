/**
 * File: RespawnItem.java
 * Date created: May 10, 2012
 * 
 */

package com.agargiulo.code.bukkit.respawn_item;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Anthony Gargiulo (anthony@agargiulo.com)
 * 
 */
public class RespawnItem extends JavaPlugin
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	private Logger	log;

	@Override
	public void onDisable()
	{
		log = getLogger();
		log.info("Your plugin has been disabled");

	}

	@Override
	public void onEnable()
	{
		log = getLogger();
		log.info("Your plugin has been enabled.");
	}

	/**
	 * @param event
	 */
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		log.info("Player " + event.getPlayer().getDisplayName()
				+ " has joined the game");
	}

	/**
	 * @param event
	 * 
	 */
	public void onPlayerRespawn(PlayerRespawnEvent event)
	{
		Player player = event.getPlayer(); // The player who respawned
		PlayerInventory playerInv = player.getInventory(); // Their items
		ItemStack items = new ItemStack(Material.GOLD_NUGGET);
		playerInv.addItem(items);
		player.sendMessage("You just respawned, have some gold.");
		log.info("Player respawned");
	}

}
