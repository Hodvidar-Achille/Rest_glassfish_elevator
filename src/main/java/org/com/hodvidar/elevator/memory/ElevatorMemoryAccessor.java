package org.com.hodvidar.elevator.memory;

import org.com.hodvidar.elevator.model.Elevator;

public class ElevatorMemoryAccessor {

    private static Elevator long_memory_access = new Elevator();

    private ElevatorMemoryAccessor() {
        throw new IllegalStateException("Static class");
    }

    public static Elevator getElevatorFromDB() {
        return long_memory_access;
    }
}
