package cn.galaxy233.beutils.command.main;

import cn.galaxy233.beutils.command.main.sub.AACH;
import cn.galaxy233.beutils.command.main.sub.BuildVersion;
import cn.galaxy233.beutils.command.main.sub.OriginalOnline;
import io.izzel.taboolib.module.command.base.BaseCommand;
import io.izzel.taboolib.module.command.base.BaseMainCommand;
import io.izzel.taboolib.module.command.base.BaseSubCommand;
import io.izzel.taboolib.module.command.base.SubCommand;

@BaseCommand(description = "BEUtils Command", name = "BEUtils", permission = "BEUtil.use")
public class CommandHandler extends BaseMainCommand {

    @SubCommand(permission = "BEUtils.OriginalOnline", description = "Get Original Player List")
    BaseSubCommand OriginalOnline = new OriginalOnline();

    @SubCommand(permission = "BEUtils.BuildVersion", description = "Get ServerJar Build Version")
    BaseSubCommand BuildVersion = new BuildVersion();

    @SubCommand(permission = "BEUtils.AACH", description = "AACH Item(maybe have some bugs)")
    BaseSubCommand AACH = new AACH();
}
