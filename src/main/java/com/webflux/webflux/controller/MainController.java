package com.webflux.webflux.controller;

import org.springframework.web.bind.annotation.RestController;

import com.webflux.webflux.service.FluxService;
import com.webflux.webflux.service.MonoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/service")
public class MainController {

    @Autowired
    private FluxService fs;

    @Autowired
    private MonoService ms;
    
    @GetMapping("mono")
    public Mono<String> get() {
        return ms.getResponse();
    }

    @GetMapping("flux")
    public Flux<String> getAll() {
        return fs.getResponse();
    }
    
}
