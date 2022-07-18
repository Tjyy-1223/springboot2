package cn.itcast.service;

import cn.itcast.properties.IpProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ipCountService {
    private Map<String,Integer> ipCountMap = new HashMap<>();

    @Autowired
    private HttpServletRequest httpServletRequest;

    public void count(){
        System.out.println("------------------------------");
        String ip = httpServletRequest.getRemoteAddr();
        System.out.println("IP:"+ip);

        Integer count = ipCountMap.get(ip);

        if (count == null)
            ipCountMap.put(ip,1);
        else
            ipCountMap.put(ip , ipCountMap.get(ip) + 1);
    }

    @Autowired
    private IpProperties ipProperties;


    @Scheduled(cron = "0/3 * * * * ?")
    public void print(){

        System.out.println(" IP访问监控");
        System.out.println("+-----ip-address-----+--num--+");
        for(Map.Entry<String,Integer> info :ipCountMap.entrySet()){
            String key = info.getKey();
            Integer count = info.getValue();
            String lineInfo = String.format("|%18s |%6d |",key,count);
            System.out.println(lineInfo);
        }
        System.out.println("+--------------------+-------+");

        if (ipProperties.getCycleReset()){
            ipCountMap.clear();
        }
    }
}
