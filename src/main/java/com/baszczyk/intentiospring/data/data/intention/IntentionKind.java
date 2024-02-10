package com.baszczyk.intentiospring.data.data.intention;


public enum IntentionKind {
    FOR_THE_DEAD ("Za Świętej Pamięci"),
    THANKSGIVING ("Dziękczynna"),
    SUPPLICANT ("Błagalna"),
    CUSTOM ("");

    private String type;
    IntentionKind(String type) {
        this.type = type;
    }
}
