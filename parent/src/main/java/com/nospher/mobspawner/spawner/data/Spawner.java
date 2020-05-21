package com.nospher.mobspawner.spawner.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

/**
 * @author oNospher
 **/
@AllArgsConstructor
@Getter @Setter
public class Spawner {

    private final Integer id;
    private final EntityType entity;
    private final Location location;
    private Boolean enabled;

}
