package com.example.partyapp.controllers;

import com.example.partyapp.entities.Party;
import com.example.partyapp.services.PartyService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/parties")
@RequiredArgsConstructor
public class PartyController {

    private final PartyService partyService;

    @GetMapping
    public List<Party> getAll() {
        return partyService.findAll();
    }

    @PostMapping
    public Party post(@RequestBody Party party) {
        return partyService.save(party);
    }

    @PutMapping("/{id}")
    public Party put(@PathVariable String id, @RequestBody Party party) {
        return partyService.update(id, party);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        partyService.deleteById(id);
    }


}
