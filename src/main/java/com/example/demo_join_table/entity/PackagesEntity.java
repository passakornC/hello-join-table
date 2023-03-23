package com.example.demo_join_table.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "packages")
public class PackagesEntity {

    @Id
    private Integer id;
    private String premium;

    @JsonBackReference
    @OneToMany(mappedBy = "packages") // packages ชื่อใน OrdersEntity.packages
    private List<OrdersEntity> ordersEntityList;

}
