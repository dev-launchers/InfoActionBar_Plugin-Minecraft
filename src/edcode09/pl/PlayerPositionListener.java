package edcode09.pl;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerPositionListener implements Listener {



    @EventHandler
    public static void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        String playerposX = (player.getLocation().getBlockX() + " " );
        String playerposY = (player.getLocation().getBlockY() + " " );
        String playerposZ = (player.getLocation().getBlockZ() + " " );
        String playerpos  =  "§8-§c x: §l" + playerposX + "§a y: §l" + playerposY + "§3 z: §l" + playerposZ + "§8-";
        Integer playerLV = (player.getExpToLevel());
        String PlayerXPLV = playerLV.toString();
        Integer PlayerAge = (player.getTicksLived()) / 20 / 60;
        String PlayerTimeLivedInMin = PlayerAge.toString();

        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§8- §7Time played: §b" + PlayerTimeLivedInMin + " §7mins§r " + playerpos + "§l §7Level §2" + PlayerXPLV + "§8 -"));
        //getLogger().info(playerpos);




    }

}
