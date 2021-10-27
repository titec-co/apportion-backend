package com.titec.apportion.controller.bif;

import com.titec.apportion.common.model.bank.Bank;
import com.titec.apportion.common.model.bif.City;
import com.titec.apportion.common.model.bif.Province;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/bif")
public class BifController {

    @GetMapping("/city/all")
    public Flux<City> getAllCity(){
        return null;
    }

    @GetMapping("/province/all")
    public Flux<Province> getAllProvince(){
        return null;
    }

    @GetMapping("/city/{cityId}")
    public Mono<ResponseEntity<City>> getCityById(@PathVariable UUID cityId){
        return null;
    }

    @GetMapping("/province/{provinceId}")
    public Mono<ResponseEntity<City>> getProvinceById(@PathVariable UUID provinceId){
        return null;
    }

    @PostMapping("/city")
    public Mono<Bank> createCity(@RequestBody Mono<CityRequest> cityRequestMono) {
        return null;
    }

    @PostMapping("/province")
    public Mono<Bank> createProvince(@RequestBody Mono<ProvinceRequest> provinceRequestMono) {
        return null;
    }

    @PutMapping("city/{cityId}")
    public Mono<Bank> updateCity(@PathVariable UUID cityId,
                                    @RequestBody Mono<CityRequest> cityRequestMono){
        return null;
    }

    @PutMapping("province/{provinceId}")
    public Mono<Bank> updateProvince(@PathVariable UUID provinceId,
                                    @RequestBody Mono<ProvinceRequest> provinceRequestMono){
        return null;
    }

    @DeleteMapping("/{cityId}")
    public Mono<Void> deleteCity(@PathVariable UUID cityId){
        return null;
    }

    @DeleteMapping("/{provinceId}")
    public Mono<Void> deleteProvince(@PathVariable UUID provinceId){
        return null;
    }

}
