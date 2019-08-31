package net.emtips.vd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class command implements CommandExecutor {
    /*指令实例化
     *@author:NekokeCores
     */
    private final main plugin;

    command(main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("vd")) {
            if (!(commandSender instanceof Player)) {
                commandSender.sendMessage("§c[村庄保卫战]必须玩家输入命令");
                return true;
            }
            if(strings.length == 0){
                Player player = (Player) commandSender;
                player.sendMessage("/vd help ------ 打开玩家帮助菜单");
                player.sendMessage("/vd adminhelp ------ 打开Admin帮助菜单");
                return true;
            }
            if(strings[0].equalsIgnoreCase("help")){
                Player player = (Player) commandSender;
                player.sendMessage("+----------------[村庄保卫战-玩家指令]----------------+");
                player.sendMessage("/vd help ------ 打开玩家帮助菜单");
                player.sendMessage("/vd joinpvp [房间名] ------ 加入一场保卫游戏 *PVP模式");
                player.sendMessage("/vd joinpve [房间名] ------ 加入一场保卫游戏 *人机模式");
                player.sendMessage("/vd leave ------ 退出一场保卫游戏 *在游戏开始前适用");
                player.sendMessage("/vd gui ------ 打开村庄保卫战的图形界面 *推荐");
                player.sendMessage("/vd teamjoin ------ 加入一个队伍 *干嘛不试试最新的GUI");
                player.sendMessage("/vd teamcreate ------ 创建一个队伍 *干嘛不试试最新的GUI");
                player.sendMessage("/vd teamfight [房间名] ------ 发起一场保卫游戏 *团战");
                player.sendMessage("+------------------------------------------------+");
                return true;
            }
        }
        return true;
    }

    public main getPlugin() {
        return plugin;
    }
}
