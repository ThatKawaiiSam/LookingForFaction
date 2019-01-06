package io.github.thatkawaiisam.lff;

import org.bukkit.entity.Player;

import java.util.logging.Logger;

public class LFFAPI {

    public static Logger getLogger() {
        return LFFPlugin.getInstance().getLogger();
    }

    public static boolean isOnCooldown(Player player) {
        return LFFCooldownHandler.getCooldowns().containsKey(player.getUniqueId());
    }
}
