package com.webflux.webflux.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class MonoService {

    // TODO: Autowired DAO

    public Mono<String> getResponse () {
        // TODO: Create config for connecting webflux to database instance
        // TODO: Connect and process data from actual database
        return Mono.just("Hello World");
    }
    
}
