package com.nospher.mobspawner.evolutions.evolution.data;

import com.nospher.mobspawner.evolutions.stage.data.EvolutionStage;
import com.nospher.mobspawner.spawner.data.Spawner;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * @author oNospher
 **/
@RequiredArgsConstructor
@Getter
public abstract class AbstractEvolution {

    public final ItemStack icon;
    public final String name;
    public final String[] description;

    public abstract List<EvolutionStage> getStages(EntityType entityType);

    public abstract String getStageDescription(Double stage);

    public abstract boolean hasNext(Spawner spawner);

    public abstract boolean isNext(Spawner spawner, Double stage);

    public abstract boolean hasStage(Spawner spawner, Double stage);

    public abstract Double getCurrentStage(Spawner spawner);

    public abstract void apply(Spawner spawner, Double stage);

}
