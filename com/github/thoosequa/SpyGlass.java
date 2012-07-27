package com.github.thoosequa;

import org.bukkit.plugin.java.JavaPlugin;


public class SpyGlass extends JavaPlugin{
	
	
	public void onEnable(){ 
		getLogger().info("Your watching now with SpyGlass.");
		this.getServer().getPluginManager().registerEvents(new SpyGlassEvents(), this);
	}
	 
	public void onDisable(){ 
		getLogger().info("You put down your SpyGlass.");
	}
	
}