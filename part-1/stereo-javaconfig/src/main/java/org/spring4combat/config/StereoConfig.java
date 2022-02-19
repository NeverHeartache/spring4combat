package org.spring4combat.config;

import org.spring4combat.JavaConfigMakerInterface;
import org.spring4combat.service.impl.CDPlayer;
import org.spring4combat.service.impl.SgtPepper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * //@ComponentScan(basePackageClasses = {xxx.class, ccc.calss}) //或者是用
 * //@ComponentScan(basePackages = {"org.spring4combat.**"})
 *
 */
@Configuration
//@ComponentScan(basePackages = {"org.spring4combat.**"})
@ComponentScan(basePackageClasses = {JavaConfigMakerInterface.class})
public class StereoConfig {
    @Bean(name = "sgtPepper")
    public SgtPepper getSgtPepper(){
        return new SgtPepper();
    }

    @Bean
    public CDPlayer getCDPlayer(){
        return new CDPlayer(getSgtPepper());
    }
}


