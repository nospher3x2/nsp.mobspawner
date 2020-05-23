package com.nospher.mobspawner.spawner.data;

import com.nospher.mobspawner.evolutions.evolution.data.AbstractEvolution;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

import java.util.HashMap;

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
    private HashMap<AbstractEvolution, Double> evolutions;

    public void putEvolution(AbstractEvolution evolution, Double stage) {
        this.evolutions.put(
                evolution,
                stage
        );
    }

}
