package model;

import java.util.UUID;

public class ExitGate {
    private String exitGateId;

    public ExitGate() {
        this.exitGateId = "XG-" + UUID.randomUUID();
    }

    public String getExitGateId() {
        return exitGateId;
    }

    public void setExitGateId(String exitGateId) {
        this.exitGateId = exitGateId;
    }

    @Override
    public String toString() {
        return "ExitGate{" +
                "exitGateId='" + exitGateId + '\'' +
                '}';
    }
}