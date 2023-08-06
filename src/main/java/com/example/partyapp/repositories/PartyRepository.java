package com.example.partyapp.repositories;

import com.example.partyapp.entities.Party;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends CrudRepository<Party, String> {

    @Override
    List<Party> findAll();
}
