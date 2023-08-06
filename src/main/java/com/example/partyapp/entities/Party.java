package com.example.partyapp.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Party")
@Data
public class Party {
    @Id
    private ObjectId id;
    private String title;
    private String address;
}
