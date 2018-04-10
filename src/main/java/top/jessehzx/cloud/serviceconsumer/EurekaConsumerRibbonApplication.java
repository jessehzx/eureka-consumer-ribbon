package top.jessehzx.cloud.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author jessehzx
 * @Date 2018/4/10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    @Bean           // 定义REST客户端，RestTemplate实例
    @LoadBalanced   // 开启负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
	}
}
