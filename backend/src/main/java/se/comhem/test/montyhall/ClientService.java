package se.comhem.test.montyhall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service

public class ClientService {

    private final static Integer Door_1 = 1;// door user chooses
    private final static Integer Door_2 = 2; // door user chooses
    private final static Integer Door_3 = 3;

    public ResponseJson getCustomers(Integer id) {

        ResponseJson responseJsonList = new ResponseJson();
        if(Door_1.equals(id)){

            responseJsonList.setCompleteName("goat");
        }

        if(Door_2.equals(id)){

            responseJsonList.setCompleteName("goat");
        }

        if(Door_3.equals(id)){

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
