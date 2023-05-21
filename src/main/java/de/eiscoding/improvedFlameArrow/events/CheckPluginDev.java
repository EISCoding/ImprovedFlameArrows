package de.eiscoding.improvedFlameArrow.events;

import de.eiscoding.improvedFlameArrow.improvedFlameArrow;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class CheckPluginDev implements Listener {

    //This doesn't do much, it just tells me when a Server is using this Plugin.

    @EventHandler
    public void on(PlayerJoinEvent event){
        Player dev = event.getPlayer();
        if (dev.getName().equals("EISCoding")){

            Bukkit.getScheduler().runTaskLater(improvedFlameArrow.instance, new Runnable() {
                @Override
                public void run() {
                    Bukkit.getScheduler().runTaskLater(improvedFlameArrow.instance, new Runnable() {
                        @Override
                        public void run() {
                            Bukkit.getScheduler().runTaskLater(improvedFlameArrow.instance, new Runnable() {
                                @Override
                                public void run() {
                                    dev.sendMessage("§8§m⚊⚊⚊⚊⚊⚊§r §7Improved§6Flame§eArrow §8§m⚊⚊⚊⚊⚊⚊");
                                    dev.sendMessage("§7Version§7: §b" + improvedFlameArrow.getInstance().PluginVersion);
                                    dev.sendMessage("§7Author§7: §bEISCoding");
                                    dev.sendMessage("§cThis Server is using your Plugin");
                                    dev.sendMessage("§8§m⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
                                    dev.playSound(dev.getLocation(), Sound.BLOCK_BELL_USE, 1F, 1F);
                                }
                            }, 10);
                            dev.playSound(dev.getLocation(), Sound.BLOCK_BELL_USE, 1F, 1F);
                        }
                    }, 10);
                    dev.playSound(dev.getLocation(), Sound.BLOCK_BELL_USE, 1F, 1F);
                }
            }, 20);
        }
    }

}
