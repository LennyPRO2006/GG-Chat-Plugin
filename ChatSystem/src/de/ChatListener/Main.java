package de.ChatListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin {
   
    @Override
    public void onEnable() {
       
        getLogger().info("Das Plugin wird gestartet...");
       
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
       
    }
    public void onDisable() {
    	getLogger().info("Das Plugin wird Gestoppt...");
    }
 
}