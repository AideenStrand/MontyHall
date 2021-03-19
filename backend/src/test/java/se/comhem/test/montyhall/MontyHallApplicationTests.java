package se.comhem.test.montyhall;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

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
        Assert.assertEquals(responseEntity.getBody().getDoorsName().getDoor1(), "goat");

    }

    @Test
    public void contextLoadsBill() {
        Integer number = 3;

        ResponseEntity<ResponseJson> responseEntity = controller.CalculateResponse(number);

        Assert.assertEquals(200, responseEntity.getStatusCodeValue());
        Assert.assertNotNull(responseEntity.getBody());
        Assert.assertEquals(responseEntity.getBody().getDoorsName().getDoor1(), "bill");

    }

}
