package com.example.carforum.entity;

import com.example.carforum.entity.myenum.CarReivewStatus;
import com.example.carforum.entity.myenum.PriceCarStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "carreview")
public class CarReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private int type;
    private String image;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private CategoryCar categoryCar;
    @Column(updatable = false, insertable = false)
    private int category_id;
    private int viewcount;
    @Enumerated(EnumType.ORDINAL)
    private CarReivewStatus status;}
