package com.directi.training.ocp.exercise_refactored;

public class SpaceSlot implements Resource {

    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() {
        return 2; // exemple
    }

    private void markSpaceSlotBusy(int resourceId) {
        System.out.println("Space slot " + resourceId + " is now busy.");
    }

    private void markSpaceSlotFree(int resourceId) {
        System.out.println("Space slot " + resourceId + " is now free.");
    }
}
