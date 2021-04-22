package org.spring4combat.config;

import org.spring4combat.service.impl.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring4combat.**")
public class StereoConfig {
    @Autowired
    private CDPlayer cdPlayer;

    public void play(){
        cdPlayer.play();
    }

}
