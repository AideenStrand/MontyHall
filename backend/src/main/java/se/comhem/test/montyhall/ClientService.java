package se.comhem.test.montyhall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class ClientService {

    private final static Integer Door_1 = 1;
    private final static Integer Door_2 = 2;
    private final static Integer Door_3 = 3;

    public ResponseJson Calculate(Integer id) {

        ResponseJson responseJson = new ResponseJson();
        if(Door_1.equals(id)){
            DoorsName doorsName = new DoorsName();
            doorsName.setDoor1("goat");
            doorsName.setDoor2("goat");
            doorsName.setDoor3("bill");
            responseJson.setDoorsName(doorsName);
            responseJson.setResultSentence("I suggest you to choose door number 3");
        }

        if(Door_2.equals(id)){
            DoorsName doorsName = new DoorsName();
            doorsName.setDoor1("goat");
            doorsName.setDoor2("bill");
            doorsName.setDoor3("goat");
            responseJson.setDoorsName(doorsName);
            responseJson.setResultSentence("I suggest you to choose door number 2");
        }

        if(Door_3.equals(id)){
            DoorsName doorsName = new DoorsName();
            doorsName.setDoor1("bill");
            doorsName.setDoor2("goat");
            doorsName.setDoor3("goat");
            responseJson.setDoorsName(doorsName);
            responseJson.setResultSentence("I suggest you to choose door number 1");
        }

        return responseJson;
    }

}
