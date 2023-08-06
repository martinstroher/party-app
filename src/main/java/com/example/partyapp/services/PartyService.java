package com.example.partyapp.services;

import com.example.partyapp.entities.Party;
import com.example.partyapp.repositories.PartyRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyService {

    private final PartyRepository partyRepository;


    public List<Party> findAll() {
        return partyRepository.findAll();
    }

    public Party save(Party party) {
        return partyRepository.save(party);
    }

    public void deleteById(String id) {
        partyRepository.deleteById(id);
    }

    public Party update(String id, Party party) {
        party.setId(id);

        return partyRepository.save(party);
    }
}
