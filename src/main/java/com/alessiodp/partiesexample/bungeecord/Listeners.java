package com.alessiodp.partiesexample.bungeecord;

import com.alessiodp.parties.api.enums.DeleteCause;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyGetExperienceEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyLevelUpEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyPostCreateEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyPostDeleteEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyPostRenameEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyPreCreateEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyPreDeleteEvent;
import com.alessiodp.parties.api.events.bungee.party.BungeePartiesPartyPreRenameEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPostChatEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPostHomeEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPostInviteEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPostJoinEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPostLeaveEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPostTeleportEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPreChatEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPreHomeEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPreInviteEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPreJoinEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPreLeaveEvent;
import com.alessiodp.parties.api.events.bungee.player.BungeePartiesPlayerPreTeleportEvent;
import com.alessiodp.parties.api.events.bungee.unique.BungeePartiesPartyFollowEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Listeners implements Listener {
	@EventHandler
	public void onPartyCreatePre(BungeePartiesPartyPreCreateEvent event) {
		System.out.println("[PartiesExample] This event is called when a party is being created");
		
		if (false)
			event.setCancelled(true); // You can cancel it
	}
	
	@EventHandler
	public void onPartyCreatePost(BungeePartiesPartyPostCreateEvent event) {
		System.out.println("[PartiesExample] This event is called when a party has been created");
		
		// You cannot cancel it
	}
	
	@EventHandler
	public void onPartyDeletePre(BungeePartiesPartyPreDeleteEvent event) {
		System.out.printf("[PartiesExample] This event is called when a party is being deleted (" + event.getCause().name().toLowerCase() + ")");
		
		if (event.getCause() == DeleteCause.BAN) {
			// You can check the delete cause
		}
		
		
		if (false)
			event.setCancelled(true); // You can cancel it
	}
	
	@EventHandler
	public void onPartyDeletePost(BungeePartiesPartyPostDeleteEvent event) {
		System.out.println("[PartiesExample] This event is called when a party has been deleted (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPartyRenamePre(BungeePartiesPartyPreRenameEvent event) {
		System.out.println("[PartiesExample] This event is called when a party is being renamed");
		
		event.getParty().getId(); // The UUID never changes
		event.getOldPartyName(); // Old party name
		event.getNewPartyName(); // New party name
	}
	
	@EventHandler
	public void onPartyRenamePost(BungeePartiesPartyPostRenameEvent event) {
		System.out.println("[PartiesExample] This event is called when a party has been renamed");
	}
	
	@EventHandler
	public void onPartyGetExperience(BungeePartiesPartyGetExperienceEvent event) {
		System.out.println("[PartiesExample] This event is called when a party got experience");
	}
	
	@EventHandler
	public void onPartyLevelUp(BungeePartiesPartyLevelUpEvent event) {
		System.out.println("[PartiesExample] This event is called when a party leveled up");
	}
	
	@EventHandler
	public void onPlayerJoinPre(BungeePartiesPlayerPreJoinEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is joining a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerJoinPost(BungeePartiesPlayerPostJoinEvent event) {
		System.out.println("[PartiesExample] This event is called when a player joined a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerLeavePre(BungeePartiesPlayerPreLeaveEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is leaving a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerLeavePost(BungeePartiesPlayerPostLeaveEvent event) {
		System.out.println("[PartiesExample] This event is called when a player left a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerInvitePre(BungeePartiesPlayerPreInviteEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is getting invited");
	}
	
	@EventHandler
	public void onPlayerInvitePost(BungeePartiesPlayerPostInviteEvent event) {
		System.out.println("[PartiesExample] This event is called when a player has been invited");
	}
	
	@EventHandler
	public void onPlayerChatPre(BungeePartiesPlayerPreChatEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is sending a chat message");
	}
	
	@EventHandler
	public void onPlayerChatPost(BungeePartiesPlayerPostChatEvent event) {
		System.out.println("[PartiesExample] This event is called when a player sent a chat message");
	}
	
	@EventHandler
	public void onPlayerHomePre(BungeePartiesPlayerPreHomeEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is getting teleported with home command");
	}
	
	@EventHandler
	public void onPlayerHomePost(BungeePartiesPlayerPostHomeEvent event) {
		System.out.println("[PartiesExample] This event is called when a player got teleported with home command");
	}
	
	@EventHandler
	public void onPlayerTeleportPre(BungeePartiesPlayerPreTeleportEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is getting teleported with teleport command");
	}
	
	@EventHandler
	public void onPlayerTeleportPost(BungeePartiesPlayerPostTeleportEvent event) {
		System.out.println("[PartiesExample] This event is called when a player got teleported with teleport command");
	}
	
	@EventHandler
	public void onPartyFollow(BungeePartiesPartyFollowEvent event) {
		System.out.println("[PartiesExample] This event is called when there is follow event");
	}
}
