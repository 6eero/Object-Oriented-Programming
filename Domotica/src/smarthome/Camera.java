package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;
import org.jetbrains.annotations.NotNull;

public class Camera extends Device {
    private String state;
    private int batteryLevel;

    public Camera() {
        state = "";
        batteryLevel = 100;
    }

    @Override
    public @NotNull String getState() {
        return "state:" + state + ",bat:" + batteryLevel;
    }

    @Override
    void sendCommand(@NotNull String command) throws ExecutionFailedException {
        switch (command) {
            case "on" -> state = "on";
            case "off" -> state = "off";
            case "standby" -> state = "standby";
            default -> throw new ExecutionFailedException("Unknown command");
        }
    }
}
