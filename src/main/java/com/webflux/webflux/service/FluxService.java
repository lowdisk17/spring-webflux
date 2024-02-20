package com.webflux.webflux.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class FluxService {

    // TODO: Autowired DAO

    public Flux<String> getResponse() {
        // TODO: Create config for connecting webflux to database instance
        // TODO: Connect to database and process return data from actual database
        return Flux.just("A", "B", "C");
    }
    
}
