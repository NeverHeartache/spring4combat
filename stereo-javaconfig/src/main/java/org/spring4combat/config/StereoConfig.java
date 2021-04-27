package org.spring4combat.config;

import org.spring4combat.service.impl.SgtPepper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackageClasses = {xxx.class, ccc.calss}) //或者是用
//@ComponentScan(basePackages = {"org.spring4combat.**"})
@Configuration
public class StereoConfig {
    @Bean(name = "sgtPepper")
    public SgtPepper getSgtPepper(){
        return new SgtPepper();
    }
}


