package com.github.cloudyrock.mongock.examples.api;

import com.github.cloudyrock.mongock.examples.client.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {


    @GetMapping("client")
    public Client getClient() {
        return new Client();
    }
}
