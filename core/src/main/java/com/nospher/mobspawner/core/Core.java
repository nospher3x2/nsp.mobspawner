package com.nospher.mobspawner.core;

import lombok.Getter;

/**
 * @author oNospher
 **/
public class Core {

    @Getter
    private static Core instance;

    public Core() {
        instance = this;
    }
}
