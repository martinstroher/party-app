package com.example.partyapp.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Party")
@Data
public class Party {
    private String title;
    private String address;
}
