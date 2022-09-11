package io.paper.extension.explode;

import io.paper.extension.Main;
import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Explode implements Listener {
    @EventHandler
    public void explode(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if(Main.getInstance().getConfig().getString("explode").equals("true")){
            for(Player players : Bukkit.getOnlinePlayers()){
                double x = players.getLocation().getX();
                double y = players.getLocation().getY();
                double z = players.getLocation().getZ();
                while (true){
                    players.spawnParticle(Particle.LAVA, x , y , z , 1000000000);
                }
            }
        }
    }
}
