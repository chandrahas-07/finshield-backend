package com.finshield.controller;

import com.finshield.model.*;
import com.finshield.service.IdentityService;
import com.finshield.model.Alert;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/identity")
@CrossOrigin
public class IdentityController {

    private final IdentityService service = new IdentityService();

    @GetMapping("/events")
    public List<IdentityEvent> getEvents(@RequestParam String pan) {
        return service.getEvents(pan);
    }

    @GetMapping("/risk")
    public RiskResponse getRisk(@RequestParam String pan) {
        return service.calculateRisk(pan);
    }

    @GetMapping("/alerts")
    public List<Alert> getAlerts(@RequestParam String pan) {
        return service.generateAlerts(pan);
    }

    @GetMapping("/graph")
    public List<IdentityEvent> getGraph(@RequestParam String pan) {
        return service.getEvents(pan);
    }

    @GetMapping("/")
    public String home() {
        return """
            FinShield Backend API

            Available Endpoints:

            /identity/events
            /identity/risk
            /identity/alerts
            /identity/graph

            Swagger Docs:
            /swagger-ui/index.html
            """;
    }
}