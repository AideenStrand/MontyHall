package se.comhem.test.montyhall;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MontyHallApplicationTests {

    @Autowired
    ClientService clientService;

    @Autowired
    private Controller controller;


    @Test
    public void contextLoadsGoat() {
        Integer number = 1;
        ResponseEntity<ResponseJson> responseEntity = controller.CalculateResponse(number);

        Assert.assertEquals(200, responseEntity.getStatusCodeValue());
        Assert.assertNotNull(responseEntity.getBody());
        Assert.assertEquals(responseEntity.getBody().getDoorName(), "goat");

    }

    @Test
    public void contextLoadsBill() {
        Integer number = 3;

        ResponseEntity<ResponseJson> responseEntity = controller.CalculateResponse(number);

        Assert.assertEquals(200, responseEntity.getStatusCodeValue());
        Assert.assertNotNull(responseEntity.getBody());
        Assert.assertEquals(responseEntity.getBody().getDoorName(), "bill");

    }

}
