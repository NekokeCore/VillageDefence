package net.emtips.vd;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class main extends JavaPlugin {
    @Override
    public Logger getLogger() {
        return super.getLogger();
    }

    @Override
    public void onLoad() {
        getLogger().info("[村庄保卫战]正在载入插件！");
    }

    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("vd")).setExecutor(new command(this));
        Objects.requireNonNull(this.getCommand("joinpvp")).setExecutor(new command(this));
        getLogger().info("[村庄保卫战]已经载入插件！");

    }

    @Override
    public void onDisable() {
        getLogger().info("[村庄保卫战]已卸载插件！");
    }
}
