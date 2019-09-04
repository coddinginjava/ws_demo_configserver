package sai.service.ws_demo_configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustController {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/hello")
    private String getMessage(){
        return message;
    }
}
