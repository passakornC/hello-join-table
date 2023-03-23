package com.example.demo_join_table.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class OrdersEntity {

    @Id
    private Integer id;
    private String identity;

    @Column(name = "package_id")
    private Integer packageId;

    @Column(name = "agent_id")
    private Integer agentId;

    // JsonManageReference & JsonBackReference ใส่ไว้เพื่อไม่ให้ JSON เกิด infinite recursive ตอนแสดงผลที่ query มา
    @JsonManagedReference
    @ManyToOne // package_id
    @JoinColumn(name = "package_id", insertable = false, updatable = false) // name = column name ใน orders
    private PackagesEntity packages;

}
