package org.com.hodvidar.elevator.web;

import org.com.hodvidar.elevator.service.ElevatorService;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/elevator")
public class ElevatorController {


    @GET
    @Produces("application/json")
    public JSONObject getPosition() {
        JSONObject json = new JSONObject();
        String currentElevatorPositon = ElevatorService.getElevatorPosition();
        json.put("Position", currentElevatorPositon);
        return json;
    }
}
