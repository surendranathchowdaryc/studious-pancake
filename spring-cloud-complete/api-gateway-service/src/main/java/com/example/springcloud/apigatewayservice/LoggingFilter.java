package com.example.springcloud.apigatewayservice;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * log the requests before passing it to the respective micro-service
 */
public class LoggingFilter implements GlobalFilter, Ordered {

    final Logger logger = LoggerFactory.getLogger(LoggingFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("First Pre Global Filter");
        String requestPath = exchange.getRequest().getPath().toString();
        logger.info("Request path = " + requestPath);
        
        HttpHeaders headers = exchange.getRequest().getHeaders();
        Set<String> headerNames = headers.keySet();
 
        headerNames.forEach((header) -> {
            logger.info(header + " " + headers.get(header));
        });
        return chain.filter(exchange)
          .then(Mono.fromRunnable(() -> {
              logger.info("Last Post Global Filter ->" + exchange.getRequest().getPath().toString());
            }));
    }

    @Override
    public int getOrder() {
        return -1;
    }
    
}
