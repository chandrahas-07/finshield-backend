package com.finshield.model;

public class RiskResponse {

    private int riskScore;
    private String riskLevel;

    public RiskResponse(int riskScore, String riskLevel) {
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
    }

    public int getRiskScore() {
        return riskScore;
    }

    public String getRiskLevel() {
        return riskLevel;
    }
}