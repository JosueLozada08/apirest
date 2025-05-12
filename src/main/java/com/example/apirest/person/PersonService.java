package com.example.apirest.person;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service // Provee servicios al controlador
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPersona(Person person) {
        personRepo.save(person);
    }

    public void actualizarPersona(Person person) {
        personRepo.save(person);
    }

    public void borrarPersona(Person person) {
        personRepo.delete(person);
    }

    public List<Person> listaPersonas() {
        return personRepo.findAll();
    }

    public Optional<Person> obtenerPersonaPorId(Integer id) {
        return personRepo.findById(id);
    }
}
