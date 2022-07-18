package cn.itcast.autoconfig;


import cn.itcast.service.ipCountService;
import org.springframework.context.annotation.Bean;

public class IpAutoConfiguration {

    @Bean
    public ipCountService ipCountService(){
        return new ipCountService();
    }
}
