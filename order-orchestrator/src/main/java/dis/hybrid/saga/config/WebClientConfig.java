package dis.hybrid.saga.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @Qualifier("payment")
    public WebClient paymentClient(@Value("${service.endpoints.payment}") String endpoint){
        return WebClient.builder()
                .baseUrl(endpoint)
                .build();
    }

    @Bean
    @Qualifier("inventory")
    public WebClient inventoryClient(@Value("${service.endpoints.inventory}") String endpoint){
        return WebClient.builder()
                .baseUrl(endpoint)
                .build();
    }

    @Bean
    @Qualifier("dummy1")
    public WebClient dummy1Client(@Value("${service.endpoints.dummy1}") String endpoint){
        return WebClient.builder()
            .baseUrl(endpoint)
            .build();
    }

    @Bean
    @Qualifier("dummy2")
    public WebClient dummy2Client(@Value("${service.endpoints.dummy2}") String endpoint){
        return WebClient.builder()
            .baseUrl(endpoint)
            .build();
    }

    @Bean
    @Qualifier("dummy3")
    public WebClient dummy3Client(@Value("${service.endpoints.dummy3}") String endpoint){
        return WebClient.builder()
            .baseUrl(endpoint)
            .build();
    }

}
