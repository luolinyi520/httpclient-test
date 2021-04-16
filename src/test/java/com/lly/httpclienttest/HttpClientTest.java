package com.lly.httpclienttest;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.io.IOException;
import java.util.UUID;

@Slf4j
//@TestPropertySource({"classpath:application-test.properties"})
public class HttpClientTest {
    private final String BASE_URL = "http://localhost:8080";
    private CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    private RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(60 * 1000)
            .setConnectTimeout(60 * 1000).build();

    long start;

    @Before
    public void setUp() {
        start = System.currentTimeMillis();
    }

    @After
    public void tearDown() {
        System.out.println(String.format("耗费 %d 毫秒数", System.currentTimeMillis() - start));
    }

    @Test
    public void testPost() throws IOException {
        String api = "/api/test/httpClient";
        String url = String.format("%s%s", BASE_URL, api);
//        log.info("url="+url);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(requestConfig);

        JSONObject json = new JSONObject();
        json.put("uuid", UUID.randomUUID().toString());
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
        httpPost.setEntity(new StringEntity(String.valueOf(json), "UTF-8"));
        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }

    @Test
    public void testGet() throws IOException {
        String api = "/api/test/httpClient";
        String url = String.format("%s%s", BASE_URL, api);
//        log.info("url="+url);
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        httpGet.setHeader("Content-Type", "application/json;charset=utf8");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }

}
