package com.directi.training.ocp.exercise_refactored;

public class TimeSlot implements Resource {

    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot() {
        return 1; // exemple
    }

    private void markTimeSlotBusy(int resourceId) {
        System.out.println("Time slot " + resourceId + " is now busy.");
    }

    private void markTimeSlotFree(int resourceId) {
        System.out.println("Time slot " + resourceId + " is now free.");
    }
}




