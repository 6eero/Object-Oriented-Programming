package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ControlHub implements IControlHub {
    private final List<Device> devicesList = new ArrayList<>();
    private final List<Profile> profiles = new ArrayList<>();

    @Override
    public void configuraCasa(@NotNull List<Device> devices) {
        devicesList.clear();
        devicesList.addAll(devices);
    }

    @Override
    public List<Device> statoImpianto() {
        Device[] list = new Device[devicesList.size()];
        devicesList.toArray(list);
        return List.of(list); // a simple immutable list
    }


    @Override
    public void inviaComando(@NotNull Device device, @NotNull String command) throws ExecutionFailedException {
        device.sendCommand(command);
    }

    @Override
    public boolean aggiungiProfilo(Profile p) {
        return profiles.add(p);
    }

    @Override
    public void attivaProfilo(@NotNull String nomeProfilo) throws ExecutionFailedException {
        for (Profile p : profiles) {
            if(p.getName().equals(nomeProfilo))
                p.enableProfile();
        }
    }
}
