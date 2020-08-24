package cn.galaxy233.beutils.command.w1;

import io.izzel.taboolib.module.command.base.BaseCommand;
import io.izzel.taboolib.module.command.base.BaseMainCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@BaseCommand(description = "BEUtils w1 Command, Teleport you to old blockearth world", name = "w1", permission = "BEUtils.w1")
public class CommandHandler extends BaseMainCommand {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p;
        if (sender instanceof Player) {
            p = (Player) sender;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mv tp " + p.getName() + " be_world_old");
        }
        return true;
    }
}
