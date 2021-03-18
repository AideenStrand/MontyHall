package se.comhem.test.montyhall;

import lombok.Data;

@Data
public class ResponseJson {

    private String doorName;
    private String resultSentence;

    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }

    public String getDoorName() {
        return doorName;
    }

    public String getResultSentence() {
        return resultSentence;
    }

    public void setResultSentence(String resultSentence) {
        this.resultSentence = resultSentence;
    }
}


