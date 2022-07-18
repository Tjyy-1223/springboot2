package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;

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
}
