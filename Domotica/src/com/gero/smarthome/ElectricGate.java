package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;
import org.jetbrains.annotations.NotNull;

public class ElectricGate extends Device {
    private boolean state;

    public ElectricGate() {
        this.state = false;
    }

    @Override
    public @NotNull String getState() {
        return state ? "opened" : "closed";
    }


    @Override
    public void sendCommand(@NotNull String command) throws ExecutionFailedException {
        switch (command) {
            case "close" -> state = false;
            case "open" -> state = true;
            default -> throw new ExecutionFailedException("Unknown command");
        }
    }
}
