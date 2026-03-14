package com.finshield.data;

import com.finshield.model.IdentityEvent;
import java.util.*;

public class MockIdentityData {

    public static Map<String, List<IdentityEvent>> events = new HashMap<>();

    static {

        List<IdentityEvent> userEvents = new ArrayList<>();

        userEvents.add(
            new IdentityEvent(
                "Loan Inquiry",
                "Bandar Tech Finance",
                "Medium"
            )
        );

        userEvents.add(
            new IdentityEvent(
                "Company Registration",
                "MCA Portal",
                "High"
            )
        );

        userEvents.add(
            new IdentityEvent(
                "GST Registration",
                "GSTN",
                "Low"
            )
        );

        events.put("ABCDE1234F", userEvents);
    }

}