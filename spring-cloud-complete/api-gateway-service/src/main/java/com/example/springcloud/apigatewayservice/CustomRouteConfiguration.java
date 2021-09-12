package com.example.springcloud.apigatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomRouteConfiguration {
   @Bean
   public RouteLocator gatewayRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
       return routeLocatorBuilder.routes()
       .route(r -> r.path("/fruit-color-extractor/**").uri("lb://fruit-color-extractor-service"))
       .route(r -> r.path("/fruit-info/**").uri("lb://fruit-info-service"))
       .build();
   }

}
