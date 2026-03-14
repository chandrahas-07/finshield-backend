package com.finshield.service;

import com.finshield.data.MockIdentityData;
import com.finshield.model.IdentityEvent;
import com.finshield.model.RiskResponse;
import com.finshield.model.Alert;  // Fixed import

import java.util.ArrayList;
import java.util.List;

public class IdentityService {

    public List<IdentityEvent> getEvents(String pan) {
        return MockIdentityData.events.getOrDefault(
                pan,
                List.of()
        );
    }

    public List<Alert> generateAlerts(String pan) {
        var events = getEvents(pan);
        List<Alert> alerts = new ArrayList<>();

        for(var e : events) {
            if(e.getEvent().equals("Company Registration")) {
                alerts.add(
                    new Alert(
                        "HIGH",
                        "Company registration detected using your PAN"
                    )
                );
            }

            if(e.getEvent().equals("Loan Inquiry")) {
                alerts.add(
                    new Alert(
                        "MEDIUM",
                        "Loan inquiry detected using your PAN"
                    )
                );
            }
        }

        return alerts;
    }

    public RiskResponse calculateRisk(String pan) {
        var events = getEvents(pan);
        int score = 0;

        for(var e : events) {
            if(e.getEvent().equals("Loan Inquiry")) {
                score += 20;
            }

            if(e.getEvent().equals("GST Registration")) {
                score += 15;
            }

            if(e.getEvent().equals("Company Registration")) {
                score += 40;
            }
        }

        String level;

        if(score > 60) {
            level = "HIGH";
        } else if(score > 30) {
            level = "MEDIUM";
        } else {
            level = "LOW";
        }

        return new RiskResponse(score, level);
    }
}