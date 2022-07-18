package cn.itcast.autoconfig;


import cn.itcast.properties.IpProperties;
import cn.itcast.service.ipCountService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigurationProperties(IpProperties.class)
@EnableScheduling
public class IpAutoConfiguration {

    @Bean
    public ipCountService ipCountService(){
        return new ipCountService();
    }
}
