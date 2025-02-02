package net.vesperis;

import net.minestom.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lobby {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Lobby.class);
        logger.info("Starting Vesperis Lobby...");

        MinecraftServer minecraftServer = MinecraftServer.init();
        minecraftServer.start("0.0.0.0", 25565);
    }
}