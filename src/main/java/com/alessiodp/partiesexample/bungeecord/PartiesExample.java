package com.alessiodp.partiesexample.bungeecord;

import net.md_5.bungee.api.plugin.Plugin;

public class PartiesExample extends Plugin {
	
	public void onEnable() {
		if (getProxy().getPluginManager().getPlugin("Parties") != null) {
			getProxy().getPluginManager().registerListener(this, new Listeners());
			System.out.println("Hooked into Parties");
		} else {
			System.out.println("Cannot hook into Parties");
		}
	}
	
	public void onDisable() {
	
	}
}
