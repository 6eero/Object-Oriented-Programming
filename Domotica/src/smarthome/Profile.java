package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;


public interface Profile {

    /**
     * @return The profile name
     */
    String getName();

    /**
     * Removes a device and all commands associated with it
     * @param device The device
     */
    boolean removeDevice(Device device);

    /**
     * Removes all devices and commands associates with them
     */
    void removeAllDevices();

    /**
     * Adds a command to a device
     * @param device Device, if not present it will be added
     * @param command Command
     * @return True if the command can be added
     */
    boolean addCommand(Device device, String command);

    /**
     * Removes the command
     * @param device Associated device
     * @param command Command
     */
    boolean removeCommand(Device device, String command);

    /**
     * Activate this profile
     * @throws ExecutionFailedException If a device cannot execute a command
     */
    void enableProfile() throws ExecutionFailedException;
}
