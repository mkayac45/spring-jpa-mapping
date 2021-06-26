package com.mkayacdev.springjpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data// @Getter, @Setter anatasyonlarının yaptığı işi yapar.
@AllArgsConstructor// constructor üretir
@NoArgsConstructor// parametresiz constructor üretir
@ToString
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    @Column(name = "product_name")
    private  String productName;
    @Column(name = "qty")
    private String qty;
    @Column(name = "price")
    private int price;


}
