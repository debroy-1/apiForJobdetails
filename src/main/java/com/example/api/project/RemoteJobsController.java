package com.example.api.project;

import java.io.IOException;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController
public class RemoteJobsController {
    @GetMapping("/remote-jobs")
    public String getRemoteJobs() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://remote-jobs-api.p.rapidapi.com/jobs?company=shopify")
                .get()
                .addHeader("X-RapidAPI-Key", "e9cb2591b6mshda5ff453c05d542p1ed44fjsnd429c102d480")
                .addHeader("X-RapidAPI-Host", "remote-jobs-api.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
 return response.body().string();
    }
}
