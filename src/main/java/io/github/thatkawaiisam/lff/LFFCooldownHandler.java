package io.github.thatkawaiisam.lff;

import io.github.plugintemplate.handler.Handler;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LFFCooldownHandler extends Handler {

    @Getter private static Map<UUID, Long> cooldowns = new HashMap<>();

    public LFFCooldownHandler(JavaPlugin instance) {
        super("cooldowns", false, instance);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        cooldowns.clear();
    }
}
