package dis.hybrid.config;

import dis.hybrid.service.Dummy3Service;
import dis.hybrid.dto.OrchestratorRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Configuration
public class Dummy3Config {

  @Autowired
  private Dummy3Service service;

  @Bean
  public Function<Flux<OrchestratorRequestDTO>, Flux<OrchestratorRequestDTO>> dummy3Processor() {
    return flux -> flux.flatMap(this::processDummy);
  }

  private Mono<OrchestratorRequestDTO> processDummy(OrchestratorRequestDTO event) {
    return Mono.fromSupplier(() -> this.service.processDummy(event));
  }

}
