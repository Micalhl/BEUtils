package cn.galaxy233.beutils.command.main.sub;

import io.izzel.taboolib.module.command.base.BaseSubCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class BuildVersion extends BaseSubCommand {
    @Override
    public void onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String result = Bukkit.class.getPackage().getImplementationVersion();
        commandSender.sendMessage(result);
    }
}
