package com.example.demo.controller;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1")
    public void test1() {
        try {
            String url = "https://www.mailinator.com/linker?linkid=e3bbbee7-8640-4b9a-b0fb-fe4a9406477d";
            HttpClient
                    client = HttpClientBuilder.create().build();
            HttpResponse response = client.execute(new HttpGet(url));
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            String str = new String(response.getEntity().getContent().readAllBytes());
            System.out.println(str);
        } catch (Exception e){

        }

    }
}
