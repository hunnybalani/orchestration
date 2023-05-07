package dis.choreography.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy2")
public class Dummy2Controller {

  @PostMapping("/process")
  public void process() {
    System.out.println("dummy service 2 process");
    return;
  }

  @PostMapping("/revert")
  public void revert() {
    System.out.println("dummy service 2 revert");
    return;
  }

}
