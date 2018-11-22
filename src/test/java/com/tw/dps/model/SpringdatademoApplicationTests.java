package com.tw.dps.model;

import com.tw.dps.dao.ApiRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatademoApplicationTests {

    @Resource
    ApiRepository apiRepository;

    @Test
    public void contextLoads() {
        List<Api> apis = apiRepository.findAll();
        Api singalApi = apiRepository.findById(1).get();
        Assert.assertEquals("iot-platform", singalApi.getApiName());
        System.out.println(apis.size());
        System.out.println(apis.get(0));
        Assert.assertNotNull(apis);
    }

}
