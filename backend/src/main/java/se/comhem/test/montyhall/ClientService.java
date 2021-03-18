package se.comhem.test.montyhall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class ClientService {

    private final static Integer Door_1 = 1;
    private final static Integer Door_2 = 2;
    private final static Integer Door_3 = 3;

    public ResponseJson getCustomers(Integer id) {

        ResponseJson responseJson = new ResponseJson();
        if(Door_1.equals(id)){
            responseJson.setDoorName("goat");
        }

        if(Door_2.equals(id)){
            responseJson.setDoorName("goat");
        }

        if(Door_3.equals(id)){
            responseJson.setDoorName("bill");
        }

        return responseJson;
    }

}
