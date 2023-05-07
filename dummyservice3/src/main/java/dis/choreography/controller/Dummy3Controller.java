package dis.choreography.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy3")
public class Dummy3Controller {

    @PostMapping("/process")
    public void process() {
        System.out.println("dummy service 3 process");
        return;
    }

    @PostMapping("/revert")
    public void revert() {
        System.out.println("dummy service 3 revert");
        return;
    }

}
