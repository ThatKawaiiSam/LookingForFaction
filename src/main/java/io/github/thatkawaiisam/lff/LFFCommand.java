package io.github.thatkawaiisam.lff;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import org.bukkit.entity.Player;

public class LFFCommand extends BaseCommand {

    @CommandAlias("lookingforfaction|lff")
    public void onLFF(Player player) {
        if (LFFAPI.isOnCooldown(player)) {
            player.sendMessage("&cYou can only do this every hour.");
        }
    }
}
