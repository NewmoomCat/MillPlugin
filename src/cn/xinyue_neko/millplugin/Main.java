package cn.xinyue_neko.millplugin;

import cn.xinyue_neko.millplugin.event.PluginPlayerEvent;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "This plugin build by mill");
        getServer().getPluginManager().registerEvents(new PluginPlayerEvent(), this);
    }

}
