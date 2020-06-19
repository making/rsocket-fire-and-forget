package com.example.rsocketfireandforget;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
@Controller
public class RSocketController {

    @MessageMapping("fire-and-forget.{identifier}")
    public Mono<Void> fireAndForget(@DestinationVariable String identifier) {
        log.info("Fire-and-forget is correctly being invoked with identifier: {}", identifier);
        return Mono.empty();
    }
}
