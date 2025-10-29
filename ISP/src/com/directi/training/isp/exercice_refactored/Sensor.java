package com.directi.training.isp.exercice_refactored;

import java.util.Random;

public class Sensor
{
    public void register(SensorClient client)
    {
        while (true) {
            if (isPersonClose()) {
                client.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}