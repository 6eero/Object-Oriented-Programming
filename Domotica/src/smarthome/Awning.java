package com.gero.smarthome;

import com.gero.smarthome.exceptions.ExecutionFailedException;
import org.jetbrains.annotations.NotNull;

public class Awning extends Device {
    private boolean state;


    public Awning() {
        this.state = false;
    }


    @Override
    public @NotNull String getState() {
        return state ? "on" : "off";
    }

    @Override
    void sendCommand(@NotNull String command) throws ExecutionFailedException {
        switch (command) {
            case "close" -> state = false;
            case "open" -> state = true;
            default -> throw new ExecutionFailedException("Unknown command");
        }
    }
}
