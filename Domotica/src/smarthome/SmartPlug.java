package com.gero.smarthome;

import com.gero.smarthome.exceptions.ExecutionFailedException;
import org.jetbrains.annotations.NotNull;

public class SmartPlug extends Device {

    private boolean state;

    /**
     * Constructor method to add a new awning to the control panel.
     * The new awning will be closed by default.
     */
    public SmartPlug() {
        this.state = false;
    }

    @Override
    public @NotNull String getState() {
        return state ? "on" : "off";
    }

    @Override
    void sendCommand(@NotNull String command) throws ExecutionFailedException {
        switch (command) {
            case "off" -> state = false;
            case "on" -> state = true;
            default -> throw new ExecutionFailedException("Unknown command");
        }
    }
}
