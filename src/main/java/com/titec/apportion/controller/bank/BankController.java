package com.titec.apportion.controller.bank;

import com.titec.apportion.common.model.bank.Bank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/bank")
public class BankController {

    @GetMapping("all")
    public Flux<Bank> getAll(){
        return null;
    }

    @GetMapping("{bankId}")
    public Mono<ResponseEntity<Bank>> getById(@PathVariable UUID bankId){
        return null;
    }

    @PostMapping
    public Mono<Bank> create(@RequestBody Mono<BankRequest> bankRequestMono) {
        return null;
    }

    @PutMapping("{bankId}")
    public Mono<Bank> update(@PathVariable UUID bankId,
                                       @RequestBody Mono<BankRequest> bankRequestMono){
        return null;
    }

    @DeleteMapping("/{bankId}")
    public Mono<Void> delete(@PathVariable UUID bankId){
        return null;
    }

}
