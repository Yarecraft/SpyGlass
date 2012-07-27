package com.github.thoosequa;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;

public class SpyGlassEvents implements Listener{


	@EventHandler(priority = EventPriority.NORMAL)
	public void onBlockPlace(BlockPlaceEvent event){
		Player player = event.getPlayer();
		String playername = player.getName();
		Material material = event.getBlock().getType();
		GameMode gamemode = GameMode.SURVIVAL;
		
		for(Player online:Bukkit.getServer().getOnlinePlayers()){
			
		if(online.isOp() && gamemode == GameMode.SURVIVAL){   //Block placement survival
		
		if(!player.isOp()){	
		if(material == Material.DIAMOND_ORE || material == Material.DIAMOND_BLOCK){ 
			online.sendMessage(ChatColor.AQUA +"[SG] " +
		ChatColor.WHITE + playername + " placed " + material);
		}
		
		if(material == Material.GOLD_ORE || material == Material.GOLD_BLOCK){ 
			online.sendMessage(ChatColor.YELLOW + "[SG] " + 
		ChatColor.WHITE + playername + " placed " + material);
		}
		
		if(material == Material.IRON_ORE || material == Material.IRON_BLOCK){ 
			online.sendMessage(ChatColor.DARK_GRAY + "[SG] " +
		ChatColor.WHITE + playername + " placed " + material);
			}
		
		  //End of Block placement Survival
		}
		
		
		}
	}
}

	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onBlockBrake(BlockBreakEvent event){
		Player player = event.getPlayer();
		String playername = player.getName();
		Material material = event.getBlock().getType();
		
		for(Player online:Bukkit.getServer().getOnlinePlayers()){
		
		if(online.isOp()){
			
			
			//BlockBreak in survival
		
		if(player.isOp() == false){	
			if(material == Material.DIAMOND_ORE || material == Material.DIAMOND_BLOCK){ 
				online.sendMessage(ChatColor.AQUA +"[SG] " +
			ChatColor.WHITE + playername + " broke " + material);
			}
			
			if(material == Material.GOLD_ORE || material == Material.GOLD_BLOCK){ 
				online.sendMessage(ChatColor.YELLOW + "[SG] " + 
			ChatColor.WHITE + playername + " broke " + material);
			}
			
			if(material == Material.IRON_ORE || material == Material.IRON_BLOCK){ 
				online.sendMessage(ChatColor.DARK_GRAY + "[SG] " +
			ChatColor.WHITE + playername + " broke " + material);
				}
			}
		}
	}
}
		
		@EventHandler(priority = EventPriority.NORMAL)
		public void BlockPlace(BlockPlaceEvent event){
			Player player = event.getPlayer();
			String playername = player.getName();
			Material material = event.getBlock().getType();
			GameMode gamemode = player.getGameMode();
			
			
			for(Player online:Bukkit.getServer().getOnlinePlayers()){
			if(player.isOp() == false && gamemode == GameMode.CREATIVE){	
			if(material == Material.DIAMOND_ORE || material == Material.DIAMOND_BLOCK ||
				material == Material.GOLD_ORE || material == Material.GOLD_BLOCK ||
				material == Material.IRON_ORE || material == Material.IRON_BLOCK ||
				material == Material.TNT){
				
			
			
				online.sendMessage(ChatColor.LIGHT_PURPLE + "[SG] "+ ChatColor.WHITE + 
					playername + " tried to place " + material + " in creative!");
				event.setCancelled(true);
			}
				
			}
		
		}
	}
}