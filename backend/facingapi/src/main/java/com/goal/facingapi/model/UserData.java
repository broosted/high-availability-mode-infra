package com.goal.facingapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document("userData")
public class UserData {

private String name;
private Long phone;



}