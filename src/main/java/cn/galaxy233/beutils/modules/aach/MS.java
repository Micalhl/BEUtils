package cn.galaxy233.beutils.modules.aach;

import cn.galaxy233.beutils.utils.Color;
import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MS {

    protected Player player;

    public MS(Player player) {
        this.player = player;
    }

    public void give() {
        ItemStack itemStack = new ItemStack(Material.STICK, 1);
        String displayName = Color.color("&cMical的木棍");
        List<String> lore = new ArrayList<>();
        lore.add(Color.color("&6==================="));
        lore.add(Color.color("&bMical 单身狗一条(划掉)"));
        lore.add(Color.color("&9java.lang.NullPointerException"));
        lore.add(Color.color("&6==================="));
        lore.add("");
        lore.add(Color.color("&3 --- 祖宗那时传下来的宝贝("));
        lore.add(Color.color("&3 --- 爷爷的爷爷的...所用("));
        lore.add(Color.color("&3 --- 据说已经存在几百年了("));
        lore.add(Color.color("&3 --- 而且这拐棍还有副作用("));
        lore.add(Color.color("&3 --- 现在的话.....umm..."));
        lore.add(Color.color("&3 --- 拿来当防狼神器也不错("));
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setDisplayName(displayName);
            itemMeta.setLore(lore);
        }
        itemStack.setItemMeta(itemMeta);
        HashMap<Integer, ItemStack> out = player.getInventory().addItem(itemStack);
        TLocale.sendTo(player, "Modules.AACH.MS.GiveSuccessful", displayName);
        if (!out.isEmpty()) {
            TLocale.sendTo(player, "Modules.AACH.MS.InventoryFull");
            player.getWorld().dropItem(player.getLocation(), itemStack);
        }
    }
}
