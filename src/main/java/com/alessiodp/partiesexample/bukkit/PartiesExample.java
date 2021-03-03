package com.alessiodp.partiesexample.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class PartiesExample extends JavaPlugin {
	
	public void onEnable() {
		if (getServer().getPluginManager().isPluginEnabled("Parties")) {
			getServer().getPluginManager().registerEvents(new Listeners(), this);
			System.out.println("Hooked into Parties");
		} else {
			System.out.println("Cannot hook into Parties");
		}
	}
	
	public void onDisable() {
	
	}
}
