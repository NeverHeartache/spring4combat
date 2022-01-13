package org.spring4combat.service.impl;

import org.spring4combat.service.CompactDisc;
import org.spring4combat.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void playCDContent() {
        cd.returnContent();
    }
}
