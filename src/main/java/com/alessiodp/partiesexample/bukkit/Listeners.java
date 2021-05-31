package com.alessiodp.partiesexample.bukkit;

import com.alessiodp.parties.api.enums.DeleteCause;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyGetExperienceEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyLevelUpEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyPostCreateEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyPostDeleteEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyPostRenameEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyPreCreateEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyPreDeleteEvent;
import com.alessiodp.parties.api.events.bukkit.party.BukkitPartiesPartyPreRenameEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPostChatEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPostHomeEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPostInviteEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPostJoinEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPostLeaveEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPostTeleportEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreChatEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreHomeEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreInviteEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreJoinEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreLeaveEvent;
import com.alessiodp.parties.api.events.bukkit.player.BukkitPartiesPlayerPreTeleportEvent;
import com.alessiodp.parties.api.events.bukkit.unique.BukkitPartiesCombustFriendlyFireBlockedEvent;
import com.alessiodp.parties.api.events.bukkit.unique.BukkitPartiesFriendlyFireBlockedEvent;
import com.alessiodp.parties.api.events.bukkit.unique.BukkitPartiesPotionsFriendlyFireBlockedEvent;
import com.alessiodp.parties.api.events.bukkit.unique.BukkitPartiesPreExperienceDropEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Listeners implements Listener {
	@EventHandler
	public void onPartyCreatePre(BukkitPartiesPartyPreCreateEvent event) {
		System.out.println("[PartiesExample] This event is called when a party is being created");
		
		if (false)
			event.setCancelled(true); // You can cancel it
	}
	
	@EventHandler
	public void onPartyCreatePost(BukkitPartiesPartyPostCreateEvent event) {
		System.out.println("[PartiesExample] This event is called when a party has been created");
		
		// You cannot cancel it
	}
	
	@EventHandler
	public void onPartyDeletePre(BukkitPartiesPartyPreDeleteEvent event) {
		System.out.println("[PartiesExample] This event is called when a party is being deleted (" + event.getCause().name().toLowerCase() + ")");
		
		if (event.getCause() == DeleteCause.BAN) {
			// You can check the delete cause
		}
		
		
		if (false)
			event.setCancelled(true); // You can cancel it
	}
	
	@EventHandler
	public void onPartyDeletePost(BukkitPartiesPartyPostDeleteEvent event) {
		System.out.println("[PartiesExample] This event is called when a party has been deleted (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPartyRenamePre(BukkitPartiesPartyPreRenameEvent event) {
		System.out.println("[PartiesExample] This event is called when a party is being renamed");
		
		event.getParty().getId(); // The UUID never changes
		event.getOldPartyName(); // Old party name
		event.getNewPartyName(); // New party name
	}
	
	@EventHandler
	public void onPartyRenamePost(BukkitPartiesPartyPostRenameEvent event) {
		System.out.println("[PartiesExample] This event is called when a party has been renamed");
	}
	
	@EventHandler
	public void onPartyGetExperience(BukkitPartiesPartyGetExperienceEvent event) {
		System.out.println("[PartiesExample] This event is called when a party got experience");
	}
	
	@EventHandler
	public void onPartyLevelUp(BukkitPartiesPartyLevelUpEvent event) {
		System.out.println("[PartiesExample] This event is called when a party leveled up");
	}
	
	@EventHandler
	public void onPlayerJoinPre(BukkitPartiesPlayerPreJoinEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is joining a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerJoinPost(BukkitPartiesPlayerPostJoinEvent event) {
		System.out.println("[PartiesExample] This event is called when a player joined a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerLeavePre(BukkitPartiesPlayerPreLeaveEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is leaving a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerLeavePost(BukkitPartiesPlayerPostLeaveEvent event) {
		System.out.println("[PartiesExample] This event is called when a player left a party (" + event.getCause().name().toLowerCase() + ")");
	}
	
	@EventHandler
	public void onPlayerInvitePre(BukkitPartiesPlayerPreInviteEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is getting invited");
	}
	
	@EventHandler
	public void onPlayerInvitePost(BukkitPartiesPlayerPostInviteEvent event) {
		System.out.println("[PartiesExample] This event is called when a player has been invited");
	}
	
	@EventHandler
	public void onPlayerChatPre(BukkitPartiesPlayerPreChatEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is sending a chat message");
	}
	
	@EventHandler
	public void onPlayerChatPost(BukkitPartiesPlayerPostChatEvent event) {
		System.out.println("[PartiesExample] This event is called when a player sent a chat message");
	}
	
	@EventHandler
	public void onPlayerHomePre(BukkitPartiesPlayerPreHomeEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is getting teleported with home command");
	}
	
	@EventHandler
	public void onPlayerHomePost(BukkitPartiesPlayerPostHomeEvent event) {
		System.out.println("[PartiesExample] This event is called when a player got teleported with home command");
	}
	
	@EventHandler
	public void onPlayerTeleportPre(BukkitPartiesPlayerPreTeleportEvent event) {
		System.out.println("[PartiesExample] This event is called when a player is getting teleported with teleport command");
	}
	
	@EventHandler
	public void onPlayerTeleportPost(BukkitPartiesPlayerPostTeleportEvent event) {
		System.out.println("[PartiesExample] This event is called when a player got teleported with teleport command");
	}
	
	@EventHandler
	public void onCombustFriendlyFireBlocked(BukkitPartiesCombustFriendlyFireBlockedEvent event) {
		System.out.println("[PartiesExample] This event is called when a combust friendly fire event is fired");
		
		if (false)
			event.setCancelled(true);
	}
	
	@EventHandler
	public void onFriendlyFireBlocked(BukkitPartiesFriendlyFireBlockedEvent event) {
		System.out.println("[PartiesExample] This event is called when a friendly fire event is fired");
	}
	
	@EventHandler
	public void onPotionsFriendlyFireBlocked(BukkitPartiesPotionsFriendlyFireBlockedEvent event) {
		System.out.println("[PartiesExample] This event is called when a potions friendly fire event is fired");
	}
	
	@EventHandler
	public void onPreExperienceDrop(BukkitPartiesPreExperienceDropEvent event) {
		System.out.println("[PartiesExample] This event is called when there is an experience drop");
	}
}
