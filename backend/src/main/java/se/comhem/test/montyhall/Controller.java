package se.comhem.test.montyhall;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {
    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/api/client/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseJson> CalculateResponse(
             @PathVariable(name = "id") Integer id
    ) {
        try {
            return new ResponseEntity<>(clientService.Calculate(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
