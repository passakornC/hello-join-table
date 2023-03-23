package com.example.demo_join_table.controller;

import com.example.demo_join_table.entity.OrdersEntity;
import com.example.demo_join_table.entity.PackagesEntity;
import com.example.demo_join_table.repository.OrdersRepository;
import com.example.demo_join_table.repository.PackagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final OrdersRepository ordersRepository;
    private final PackagesRepository packagesRepository;

    @GetMapping("/demo/{agent_id}")
    public ResponseEntity<List<OrdersEntity>> demo(@PathVariable("agent_id") Integer agentId) {
        OrdersEntity where = new OrdersEntity();
        where.setAgentId(agentId);
        List<OrdersEntity> list = this.ordersRepository.findAll(Example.of(where));
        for (int i = 0; i < list.size(); i++) {
            // code
        }

        for (OrdersEntity item: list) {
            // code
        }

        return ResponseEntity.ok(this.ordersRepository.findAll(Example.of(where)));
    }

    @GetMapping("/demo2")
    public ResponseEntity<List<PackagesEntity>> demo2() {
        return ResponseEntity.ok(this.packagesRepository.findAll());
    }

}
