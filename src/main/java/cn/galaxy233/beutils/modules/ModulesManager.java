package cn.galaxy233.beutils.modules;

import cn.galaxy233.beutils.modules.aach.MS;
import io.izzel.taboolib.loader.Plugin;
import org.bukkit.entity.Player;

public class ModulesManager {

    protected Plugin plugin;

    public ModulesManager(Plugin plugin) {
        this.plugin = plugin;
    }

    public void giveMS(Player player) {
        MS ms = new MS(player);
        ms.give();
    }
}
