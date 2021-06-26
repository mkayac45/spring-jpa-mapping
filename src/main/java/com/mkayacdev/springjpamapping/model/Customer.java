package com.mkayacdev.springjpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data // @Getter, @Setter anatasyonlarının yaptığı işi yapar.
@AllArgsConstructor // constructor üretir
@NoArgsConstructor // parametresiz constructor üretir
@ToString
@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "customer_name")
    private String name;
    @Column(name = "customer_surname")
    private String surname;
    @Column(name = "customer_email")
    private String email;
    @Column(name = "customer_gender")
    private String gender;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "custproduct_fk" ,referencedColumnName = "id")
    private List<Product> products;



}
