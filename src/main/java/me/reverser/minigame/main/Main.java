package me.reverser.minigame.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Main instance;
	public static Main getInstance() { return instance; }

	public void onEnable() {
		instance = this;
		saveDefaultConfig();
		//getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
		//getCommand("warn").setExecutor(new WarnExecutor());
		System.out.println("JoinMessage v" + getDescription().getVersion() + " enabled!");
	}
	
	public void onDisable() {
		System.out.println("JoinMessage v" + getDescription().getVersion() + " disabled!");
	}
	
}
