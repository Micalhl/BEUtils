package cn.galaxy233.beutils.command.main.sub;

import io.izzel.taboolib.module.command.base.BaseSubCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class OriginalOnline extends BaseSubCommand {
    @Override
    public void onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        List<String> list = new ArrayList<>();
        if (Bukkit.getOnlinePlayers().size() > 0) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                list.add(p.getName());
            }
        }
        if (!list.isEmpty()) list.forEach(commandSender::sendMessage); else commandSender.sendMessage("目前没有任何玩家在线");
    }
}
