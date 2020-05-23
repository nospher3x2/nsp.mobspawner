package com.nospher.mobspawner.spawner.manager;

import com.google.common.collect.Lists;
import com.nospher.mobspawner.spawner.data.Spawner;
import lombok.Getter;
import org.bukkit.Location;

import java.util.List;
import java.util.Objects;

/**
 * @author oNospher
 **/
public class SpawnerManager {

    @Getter
    private static List<Spawner> spawners = Lists.newArrayList();

    public static Spawner getSpawner(Integer id) {
        return spawners.stream()
                .filter(Objects::nonNull)
                .filter(spawner -> spawner.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static Spawner getSpawner(Location location) {
        return spawners.stream()
                .filter(Objects::nonNull)
                .filter(spawner -> spawner.getLocation().equals(location))
                .findFirst()
                .orElse(null);
    }
}
