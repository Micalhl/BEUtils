package cn.galaxy233.beutils.command.w2;

import io.izzel.taboolib.module.command.base.BaseCommand;
import io.izzel.taboolib.module.command.base.BaseMainCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@BaseCommand(description = "BEUtils w2 Command, Teleport you to new blockearth world", name = "w2", permission = "BEUtils.w2")
public class CommandHandler extends BaseMainCommand {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p;
        if (sender instanceof Player) {
            p = (Player) sender;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mv tp " + p.getName() + " world");
        }
        return true;
    }
}
