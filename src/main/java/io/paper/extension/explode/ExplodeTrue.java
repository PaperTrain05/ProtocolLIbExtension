package io.paper.extension.explode;

import io.paper.extension.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ExplodeTrue implements Listener {
    @EventHandler
    public void explodeTrue(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        if(e.getMessage().equals("&explodetrue")){
            e.setCancelled(true);
            if(Main.getInstance().getConfig().getString("explode").equals("false")){
                Main.getInstance().getConfig().set("explode", "true");
                Main.getInstance().saveConfig();
            }
        }
    }
}
