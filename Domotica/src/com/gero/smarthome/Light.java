package com.gero.smarthome;

import com.gero.smarthome.exceptions.*;
import org.jetbrains.annotations.NotNull;

public class Light extends Device {
    private String color;
    private int brightness;


    /**
     * Constructor method to add a new light to the control panel.
     * The new light will be white, with an intensity of 0 since it
     * will be turned off and offline by default.
     */
    public Light() {
        this.color = "white";
        this.brightness = 0;
    }


    /**
     * Method to get the color of a light
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }


    /**
     * Method to get the brightness of a light
     *
     * @return the brightness value
     */
    public int getBrightness() {
        return brightness;
    }


    /**
     * Method to change the color of a light
     *
     * @param color the new color
     */
    public void changeColor(@NotNull String color) {
        this.color = color;
    }


    /**
     * Method to change the brightness of a light
     *
     * @param brightness Brightness between 0 and 100. It represents the new value of the brightness
     */
    public void changeBrightness(int brightness) {
        if (brightness <= 100 && brightness >= 0) {
            this.brightness = brightness;
        }
    }

    @Override
    public @NotNull String getState() {
        return "brightness:" + brightness + ",color:" + color;
    }

    @Override
    void sendCommand(@NotNull String command) throws ExecutionFailedException {
        switch (command) {
            case "brightness:high" -> changeBrightness(100);
            case "brightness:low" -> changeBrightness(15);
            case "color:white" -> changeColor("white");
            case "color:#f00" -> changeColor("#f00"); // short rbg format
            default -> throw new ExecutionFailedException("Unknown command");
        }
    }


}
