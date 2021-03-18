package se.comhem.test.montyhall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service

public class ClientService {

    private final static Integer door_1 = 1;// door user chooses
    private final static Integer door_2 = 2; // door user chooses
    private final static Integer door_3 = 3;

    public ResponseJson getCustomers() {

        ResponseJson responseJsonList = new ResponseJson();
        if(door_1!=null){

            responseJsonList.setCompleteName("goat");
        }

        if(door_2!=null){

            responseJsonList.setCompleteName("goat");
        }

        if(door_3!=null){

            responseJsonList.setCompleteName("bill");
        }


        return responseJsonList;
    }



    public  <T> T nameFamilyMaker() {
        HashMap<String, String> customerName = new HashMap<>();
        customerName.put("cai", "berger");
        customerName.put("narges", "amiri");
        return (T) customerName;
    }
}
