package org.spring4combat.service.impl;

import org.spring4combat.service.CompactDisc;
import org.spring4combat.service.MediaPlayer;
import org.springframework.context.annotation.Bean;

public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(){}

    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    @Bean
    public CDPlayer getCDPlayer(CompactDisc compactDisc){
        return new CDPlayer();
    }

}
