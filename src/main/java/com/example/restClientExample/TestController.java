package com.example.restClientExample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tests")
public class TestController {

  private final RestClient myClient;

  @GetMapping
  public void test() {
    myClient
        .get()
        .uri("https://mp8c6d0d2b01c2052683.free.beeceptor.com")
        .retrieve()
        .body(String.class);
  }
}
