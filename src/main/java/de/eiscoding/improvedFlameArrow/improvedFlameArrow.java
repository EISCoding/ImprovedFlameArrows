package de.eiscoding.improvedFlameArrow;

import de.eiscoding.improvedFlameArrow.commands.FlameArrowCMD;
import de.eiscoding.improvedFlameArrow.events.CheckPluginDev;
import de.eiscoding.improvedFlameArrow.events.ProjectileHitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class improvedFlameArrow extends JavaPlugin {

    public static improvedFlameArrow instance;

    public String PluginName = this.getDescription().getName();
    public String PluginVersion = this.getDescription().getVersion();

    @Override
    public void onEnable() {
        instance = this;
        getCommands();
        getListener();
        getLogger().info("--------------------------------");
        getLogger().info(PluginName + " has been enabled.");
        getLogger().info("Version: " + PluginVersion);
        getLogger().info("Author: EISCoding");
        getLogger().info("--------------------------------");
    }

    @Override
    public void onDisable() {
        instance = null;
        getLogger().info("--------------------------------");
        getLogger().info(PluginName + " has been disabled.");
        getLogger().info("Version: " + PluginVersion);
        getLogger().info("Author: EISCoding");
        getLogger().info("--------------------------------");
    }

    private void getCommands(){
        getCommand("flamearrow").setExecutor(new FlameArrowCMD());
    }
    private void getListener(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new ProjectileHitListener(), instance);
        pm.registerEvents(new CheckPluginDev(), instance);
    }

    public static improvedFlameArrow getInstance(){
        return instance;
    }


}
