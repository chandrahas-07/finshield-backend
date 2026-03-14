package com.finshield.model;

public class IdentityEvent {

    private String event;
    private String source;
    private String risk;

    public IdentityEvent(String event, String source, String risk) {
        this.event = event;
        this.source = source;
        this.risk = risk;
    }

    public String getEvent() {
        return event;
    }

    public String getSource() {
        return source;
    }

    public String getRisk() {
        return risk;
    }
}