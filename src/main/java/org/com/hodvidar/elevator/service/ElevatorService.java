package org.com.hodvidar.elevator.service;

import org.com.hodvidar.elevator.memory.ElevatorMemoryAccessor;
import org.com.hodvidar.elevator.model.Elevator;

public class ElevatorService {

    public static String getElevatorPosition() {
        Elevator elevator = ElevatorMemoryAccessor.getElevatorFromDB();
        return String.valueOf(elevator.getPosition());
    }

    public static void callElevator(int aNumberOfFloor) {
        Elevator elevator = ElevatorMemoryAccessor.getElevatorFromDB();
        elevator.setPosition(aNumberOfFloor);
    }
}
