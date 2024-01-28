package com.gero.smarthome.exceptions;

public class DeviceNotFoundException extends ExecutionFailedException {
    public DeviceNotFoundException() {
        super();
    }

    public DeviceNotFoundException(String s) {
        super(s);
    }
}
