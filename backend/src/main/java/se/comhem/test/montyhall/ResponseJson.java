package se.comhem.test.montyhall;

import lombok.Data;

@Data
public class ResponseJson {

    private String doorName;

    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }

    public String getDoorName() {
        return doorName;
    }
}


