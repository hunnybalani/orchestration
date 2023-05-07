package dis.orchestration.saga.service.steps;

import dis.orchestration.dto.InventoryRequestDTO;
import dis.orchestration.dto.InventoryResponseDTO;
import dis.orchestration.enums.InventoryStatus;
import dis.orchestration.saga.service.WorkflowStep;
import dis.orchestration.saga.service.WorkflowStepStatus;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class Dummy1Step implements WorkflowStep {

  private final WebClient webClient;
  private WorkflowStepStatus stepStatus = WorkflowStepStatus.PENDING;

  public Dummy1Step(WebClient webClient) {
    this.webClient = webClient;
  }

  @Override
  public WorkflowStepStatus getStatus() {
    return this.stepStatus;
  }

  @Override
  public Mono<Boolean> process() {
    return this.webClient
        .post()
        .uri("/dummy1/process")
        .retrieve()
        .bodyToMono(Void.class)
        .map(r ->true)
        .onErrorReturn(false);
  }

  @Override
  public Mono<Boolean> revert() {
    return this.webClient
        .post()
        .uri("/dummy1/revert")
        .retrieve()
        .bodyToMono(Void.class)
        .map(r ->true)
        .onErrorReturn(false);
  }
}

