package org.spring4combat.service.impl;

import org.spring4combat.service.CompactDisc;
import org.springframework.context.annotation.Bean;

public class SgtPepper implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Bean
    public SgtPepper getSgtPepper(){
        return new SgtPepper();
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
