package com.apizinha.endereco.endereco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
    public class UserController {

        @GetMapping("/users")
        public List<Map<String, String>> getUsers() {
            List<Map<String, String>> users = new ArrayList<>();

            Map<String, String> user1 = new HashMap<>();
            user1.put("nome", "João Silva");
            user1.put("endereco", "Rua das Flores, 123");
            users.add(user1);

            Map<String, String> user2 = new HashMap<>();
            user2.put("nome", "Cleiton");
            user2.put("endereco", "Rua das Cobras 555");
            users.add(user2);

            Map<String, String> user3 = new HashMap<>();
            user3.put("nome", "Maria");
            user3.put("endereco", "Rua das Almeidas 111");
            users.add(user3);



            return users;
        }
    }
