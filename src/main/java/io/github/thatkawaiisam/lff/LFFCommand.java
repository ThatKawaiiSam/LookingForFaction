package io.github.thatkawaiisam.lff;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import io.github.thatkawaiisam.utils.MessageUtility;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

@CommandAlias("lookingforfaction|lff")
public class LFFCommand extends BaseCommand {

    @Default
    public void onLFF(Player player) {
        if (LFFAPI.isOnCooldown(player)) {
            player.sendMessage(MessageUtility.formatMessage("&cYou can only do this every hour."));
            return;
        }

        //TODO make this message configurable.
        Bukkit.getOnlinePlayers().forEach(loopPlayer -> {
            loopPlayer.sendMessage(MessageUtility.formatMessage("&7&m------------------------------------------"));
            loopPlayer.sendMessage(MessageUtility.formatMessage(player.getDisplayName() + " &6is looking for a faction!"));
            loopPlayer.sendMessage(MessageUtility.formatMessage("&7&m------------------------------------------"));
        });

        LFFCooldownHandler.applyCooldown(player);
    }
}
