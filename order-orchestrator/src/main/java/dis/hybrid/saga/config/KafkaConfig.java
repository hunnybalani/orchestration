package dis.hybrid.saga.config;

import dis.hybrid.dto.OrchestratorRequestDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Sinks;

@Configuration
public class KafkaConfig {
  @Bean
  public Sinks.Many<OrchestratorRequestDTO> orderSink(){
    return Sinks.many().unicast().onBackpressureBuffer();
  }
}
