package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;
import org.jetbrains.annotations.NotNull;

public abstract class Device {
    /**
     * @return Device state
     */
    @NotNull
    public abstract String getState();

    /**
     * Send a command to this device
     *
     * @param command the command to execute
     * @throws ExecutionFailedException if the device cannot execute the command (or it is not online)
     */
    abstract void sendCommand(@NotNull String command) throws ExecutionFailedException;

    @Override
    public String toString() {
        return getState();
    }
}