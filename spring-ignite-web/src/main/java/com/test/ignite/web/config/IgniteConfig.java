package com.test.ignite.web.config;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ignite 配置
 *
 * @author: yingmuhuadao
 * @date: Created in 14:32 2018/9/30
 */
@Configuration
public class IgniteConfig {

    @Bean
    public Ignite config(){
        IgniteConfiguration cfg = new IgniteConfiguration();
        cfg.setPeerClassLoadingEnabled(Boolean.TRUE);
        cfg.setClientMode(Boolean.TRUE);

        return Ignition.start(cfg);
    }
}
