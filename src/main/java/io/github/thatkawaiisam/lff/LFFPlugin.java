package io.github.thatkawaiisam.lff;

import io.github.plugintemplate.PluginTemplate;
import io.github.plugintemplate.handler.Handler;
import io.github.plugintemplate.handler.impl.CommandHandler;
import lombok.Getter;

import java.util.ArrayList;

public class LFFPlugin extends PluginTemplate {

    @Getter private static LFFPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        if (getHandlers() == null) {
            setHandlers(new ArrayList<>());
            getHandlers().add(new CommandHandler("io.github.thatkawaiisam.lff", this));
            getHandlers().add(new LFFCooldownHandler(this));
        }

        getHandlers().forEach(Handler::enable);
    }

    @Override
    public void onDisable() {
        getHandlers().forEach(Handler::disable);
    }
}
