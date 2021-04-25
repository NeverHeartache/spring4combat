package org.spring4combat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackageClasses = {xxx.class, ccc.calss}) //或者是用
@ComponentScan(basePackages = {"org.spring4combat.**"})
@Configuration
public class StereoConfig {
}


