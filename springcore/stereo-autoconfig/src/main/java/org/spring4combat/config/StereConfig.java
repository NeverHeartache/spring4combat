package org.spring4combat.config;

import org.junit.Test;
import org.spring4combat.service.impl.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring4combat.**")
public class StereConfig {
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void play(){
        cdPlayer.play();
    }

}
