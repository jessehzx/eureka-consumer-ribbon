package top.jessehzx.cloud.serviceconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jessehzx
 * @Date 2018/4/10
 */
@RestController
public class RibbonConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=2&b=3", String.class).getBody();
    }

}
