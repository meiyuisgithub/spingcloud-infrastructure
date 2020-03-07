package com.xiaoyang.reserve.controller;

import com.xiaoyang.reserve.feign.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author WXY
 */

@RestController
@RequestMapping("/reserve")
public class ReserveController {

    private final OrderService orderService;

    public ReserveController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/test")
    public Mono<String> test(){
        return Mono.just("reserve test");
    }
    @GetMapping("/user")
    public Mono<Object> user(){
        return Mono.just(orderService.user());
    }

}
