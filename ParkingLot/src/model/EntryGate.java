package model;

import java.util.UUID;

public class EntryGate {
    private String entryGateId;

    public EntryGate() {
        this.entryGateId = "EG-" + UUID.randomUUID();
    }

    public String getEntryGateId() {
        return entryGateId;
    }

    public void setEntryGateId(String entryGateId) {
        this.entryGateId = entryGateId;
    }

    @Override
    public String toString() {
        return "EntryGate{" +
                "entryGateId='" + entryGateId + '\'' +
                '}';
    }
}