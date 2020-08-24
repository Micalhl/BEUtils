package cn.galaxy233.beutils.command.main.sub;

import cn.galaxy233.beutils.BEUtils;
import cn.galaxy233.beutils.modules.ModulesManager;
import io.izzel.taboolib.module.command.base.BaseSubCommand;
import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AACH extends BaseSubCommand {
    @Override
    public void onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        switch (strings.length) {
            case 0:
                TLocale.sendTo(commandSender, "Command.Modules.AACH.NoPlayer");
                break;
            case 1:
                TLocale.sendTo(commandSender, "Command.Modules.AACH.NoItem");
                break;
            case 2:
                Player player = Bukkit.getPlayer(strings[0]);
                if (player == null) {
                    TLocale.sendTo(commandSender, "Command.Player.NoPlayer");
                } else {
                    if ("ms".equals(strings[1].toLowerCase())) {
                        new ModulesManager(BEUtils.getPlugin()).giveMS(player);
                    } else {
                        TLocale.sendTo(commandSender, "Modules.AACH.NoItem", strings[1]);
                    }
                }
                break;
        }
    }
}
