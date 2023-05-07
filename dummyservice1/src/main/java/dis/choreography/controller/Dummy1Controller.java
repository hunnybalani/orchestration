package dis.choreography.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy1")
public class Dummy1Controller {

    @PostMapping("/process")
    public void process() {
        System.out.println("dummy service 1 process");
        return;
    }

    @PostMapping("/revert")
    public void revert() {
        System.out.println("dummy service 1 revert");
        return;
    }

}
