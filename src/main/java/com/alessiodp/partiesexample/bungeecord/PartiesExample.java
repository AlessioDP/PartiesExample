package com.alessiodp.partiesexample.bungeecord;

import com.alessiodp.parties.api.Parties;
import com.alessiodp.parties.api.interfaces.PartiesAPI;
import net.md_5.bungee.api.plugin.Plugin;

public class PartiesExample extends Plugin {
	
	public void onEnable() {
		if (getProxy().getPluginManager().getPlugin("Parties") != null) {
			getProxy().getPluginManager().registerListener(this, new Listeners());
			System.out.println("Hooked into Parties");
			
			PartiesAPI partiesApi = Parties.getApi();
			System.out.println("PartiesAPI instance: " + partiesApi);
		} else {
			System.out.println("Cannot hook into Parties");
		}
	}
	
	public void onDisable() {
	
	}
}
