//ajout d'un nouveau type de ressource "NetworkSlot"
package com.directi.training.ocp.exercise_refactored;

public class NetworkSlot implements Resource {

    @Override
    public int allocate() {
        int resourceId = findFreeNetworkSlot();
        markNetworkSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markNetworkSlotFree(resourceId);
    }

    private int findFreeNetworkSlot() {
        return 3; // exemple
    }

    private void markNetworkSlotBusy(int resourceId) {
        System.out.println("Network slot " + resourceId + " is now busy.");
    }

    private void markNetworkSlotFree(int resourceId) {
        System.out.println("Network slot " + resourceId + " is now free.");
    }
}
