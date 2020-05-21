package com.nospher.mobspawner;

import com.nospher.mobspawner.core.Core;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author oNospher
 **/
public class MobSpawner extends JavaPlugin {

    @Getter
    private static MobSpawner instance;

    @Override
    public void onEnable() {
        instance = this;
        new Core();
    }

}
