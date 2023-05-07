package dis.hybrid.service;

import dis.hybrid.dto.OrchestratorRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Dummy1Service {

  @Transactional
  public OrchestratorRequestDTO processDummy(OrchestratorRequestDTO orchestratorRequestDTO) {
    System.out.println("Dummy Service 1");
    System.out.println(orchestratorRequestDTO);
    return orchestratorRequestDTO;
  }
}
