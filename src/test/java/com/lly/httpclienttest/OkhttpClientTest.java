package com.lly.httpclienttest;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.UUID;

/**
 * OkhttpClient测试
 *
 */
public class OkhttpClientTest {
    private final String BASE_URL = "http://localhost:8080";
    private OkHttpClient client = new OkHttpClient();
//    private OkHttpClient client = new OkHttpClient.Builder()
//            .connectTimeout(60, TimeUnit.SECONDS)//设置连接超时时间
//            .readTimeout(60, TimeUnit.SECONDS)//设置读取超时时间
//            .build();

    //起始时间
    long start;

    @Before
    public void setUp() {
        start = System.currentTimeMillis();
    }

    @After
    public void tearDown() {
        System.out.println(String.format("cost %d msc", System.currentTimeMillis() - start));
    }

    @Test
    public void testPost() throws IOException {
        String api = "/api/test/httpClient";
        String url = String.format("%s%s", BASE_URL, api);
        //请求参数
        JSONObject json = new JSONObject();
        json.put("uuid", UUID.randomUUID().toString());
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), String.valueOf(json));
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody) //post请求
                .build();
        final Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.body().string());
    }

    @Test
    public void testGet() throws IOException {
        String api = "/api/test/httpClient";
        String url = String.format("%s%s", BASE_URL, api);
        Request request = new Request.Builder()
                .url(url)
                .get()  //默认为GET请求，可以不写
                .build();
        final Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.body().string());
    }
}
