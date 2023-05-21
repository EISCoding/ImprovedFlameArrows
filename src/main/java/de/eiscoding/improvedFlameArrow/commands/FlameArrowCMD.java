package de.eiscoding.improvedFlameArrow.commands;

import de.eiscoding.improvedFlameArrow.improvedFlameArrow;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlameArrowCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage("§8§m⚊⚊⚊⚊⚊⚊§r §7Improved§6Flame§eArrow §8§m⚊⚊⚊⚊⚊⚊");
            player.sendMessage("§7Version§7: §b" + improvedFlameArrow.getInstance().PluginVersion);
            player.sendMessage("§7Author§7: §bEISCoding");
            player.sendMessage("§c❤ §7Thank you for using my Plugin §c❤");
            player.sendMessage("§8§m⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        }
        return false;
    }
}
