package com.example.demo;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;

@Configuration
public class CustomRedisCacheConfiguration {

    @Bean
    public CacheManagerCustomizer<RedisCacheManager> cacheManagerCustomizer() {
        return cacheManager -> {
            cacheManager.setDefaultExpiration(5);
            //cacheManager.setExpires();
        };
    }
}
