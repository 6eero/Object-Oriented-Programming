package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public interface IControlHub {

    /**
     * Method to add a device to the device list of the home
     * @param devices Devices that can be used by the control hub
     */
    void configuraCasa(@NotNull List<Device> devices);

    /**
     * Method to know which device is on and which is off
     * @return An iterator to the device list
     */
    List<Device> statoImpianto();

    /**
     * Method to send a specific command to a device
     * @param device the device which will execute the command
     * @param command the command to execute
     * @throws ExecutionFailedException If the device cannot execute the command
     */
    void inviaComando(@NotNull Device device, @NotNull String command) throws ExecutionFailedException;

    /**
     * Adds a new profile
     * @param p Profile
     * @return True if this control hub can add this profile
     */
    boolean aggiungiProfilo(Profile p);

    /**
     * Activates a profile
     * @param nomeProfilo Profile name
     * @throws ExecutionFailedException If a device cannot execute a command
     */
    void attivaProfilo(@NotNull String nomeProfilo) throws ExecutionFailedException;
}
