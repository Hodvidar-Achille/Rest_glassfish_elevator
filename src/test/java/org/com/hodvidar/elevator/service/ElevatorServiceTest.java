package org.com.hodvidar.elevator.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElevatorServiceTest {


    @Test
    void elevator_position_should_be_0_at_first() {
        assertThat(ElevatorService.getElevatorPosition()).isEqualTo("0");
    }

    @Test
    void elevator_position_should_be_1_after_Being_Called_at_1() {
        ElevatorService.callElevator(1);
        assertThat(ElevatorService.getElevatorPosition()).isEqualTo("1");
    }

}
