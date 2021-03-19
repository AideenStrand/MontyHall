package se.comhem.test.montyhall;

import lombok.Data;

@Data
public class ResponseJson {

    private DoorsName DoorsName;
    private String resultSentence;


    public String getResultSentence() {
        return resultSentence;
    }

    public void setResultSentence(String resultSentence) {
        this.resultSentence = resultSentence;
    }
}


