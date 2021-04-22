package org.spring4combat.service.impl;

import org.spring4combat.service.CompactDisc;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public SgtPeppers(){
        System.out.println("SgtPeppers is created at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
