package de.ChatListener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
 
import net.md_5.bungee.api.ChatColor;
 
public class ChatListener implements Listener {
 
    @EventHandler
    public void onChat(final AsyncPlayerChatEvent event) {
       
        final Player player = event.getPlayer();
        String message = event.getMessage().replace("%", "%%");
       
        if(player.hasPermission("Chatsystem.Farbe")) {
            message = ChatColor.translateAlternateColorCodes('&' , message);
        }
       
        if(player.hasPermission("Chatsystem.owner")) {
           
            event.setFormat(" " + "\n" + "§4§lOwner | " + player.getName() + " §7: " + "§a§l" + message + "\n" + " ");
           
        }else if(player.hasPermission("Chatsystem.Admin")) {
           
            event.setFormat(" " + "\n" + "§4§lAdmin | " + player.getName() + " §7: " + "§a§l" + message + "\n" + " ");
      
        }else if(player.hasPermission("Chatsystem.Dev")) {
           
            event.setFormat(" " + "\n" + "§bDeveloper | " + player.getName() + " §7: " + "§a§l" + message + "\n" + " ");
        }else if(player.hasPermission("Chatsystem.Builder")) {
           
            event.setFormat(" " + "\n" + "§2 | Builder" + player.getName() + " §7: " + "§a§l" + message + "\n" + " ");
        }else if(player.hasPermission("Chatsystem.Mod")) {
           
            event.setFormat(" " + "\n" + "§2§lModerator | " + player.getName() + " §7: " + "§a§l" + message + "\n" + " ");
        }else if (player.hasPermission("Chatsystem.Sup")) {
           
            event.setFormat(" " + "\n" + "§2§lSupporter | " + player.getName() + " §7: " + "§a§l" + message + "\n" + " ");
        }else if (player.hasPermission("Chatsystem.Supreme")) {
           
            event.setFormat(" " + "\n" + "§d§lSupreme | " + player.getName() + " §7: " + "§b§l" + message + "\n" + " ");
        }else if (player.hasPermission("Chatsystem.Griefer")) {
                
                event.setFormat(" " + "\n" + "§4§lGriefer | " + player.getName() + " §7: " + "§b§l" + message + "\n" + " ");
        }else if (player.hasPermission("Chatsystem.Champ")) {
           
            event.setFormat(" " + "\n" + "§e§lChamp | " + player.getName() + " §7: " + "§b§l" + message + "\n" + " ");
        }else if (player.hasPermission("Chatsystem.Titan")) {
           
            event.setFormat("§1§lTitan | " + player.getName() + " §7: " + "§b§l" + message);
        }else if (player.hasPermission("Chatsystem.Legende")) {
           
            event.setFormat("§cLegende | " + player.getName() + " §7: " + message);
        }else if (player.hasPermission("Chatsystem.Ultra")) {
           
            event.setFormat("§bUltra | " + player.getName() + " §7: " + message);
        }else if (player.hasPermission("Chatsystem.Premium")) {
           
            event.setFormat("§6Premium | " + player.getName() + " §7: " + message);
        }else 
        	event.setFormat("§7Spieler | " + player.getName() + "§7: " + message);
        }}
    
    