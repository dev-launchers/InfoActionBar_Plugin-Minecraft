package edcode09.pl;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("EasyCords plugin by edx loaded");
        getServer().getPluginManager().registerEvents(new PlayerPositionListener(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("EasyCords plugin by edx unloaded");
    }



}





