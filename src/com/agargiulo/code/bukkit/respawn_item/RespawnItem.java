/**
 * Simple Bukkit plugin to give a single item to every player as they respawn
 * Copyright (C) 2012 Anthony Gargiulo
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.agargiulo.code.bukkit.respawn_item;

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
	 * Give every player that respawns a single item (default is gold nugget).
	 * 
	 * @param event
	 */
	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent event)
	{
		int item = getConfig().getInt("item", 371);
		event.getPlayer().getInventory().addItem(new ItemStack(item));
	}
}