package se.comhem.test.montyhall;

import lombok.Data;

@Data
public class ResponseJson {

    private String CompleteName;

    public void setCompleteName(String completeName) {
        CompleteName = completeName;
    }

    public String getCompleteName() {
        return CompleteName;
    }

}


