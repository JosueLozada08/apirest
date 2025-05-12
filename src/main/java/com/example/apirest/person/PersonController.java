package com.example.apirest.person;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController  //declara la clase como un controlador REST
@RequestMapping("/person") //definicion de ruta base
@RequiredArgsConstructor  //crea el constructor para inyectar nuestra dependencia final
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void createPersona(@RequestBody Person person){
        personService.createPersona(person);
    }



    // Obtener lista de personas
    @GetMapping
    public List<Person> getAll() {
        return personService.listaPersonas();
    }

    // Obtener persona por ID
    @GetMapping("/{id}")
    public Optional<Person> getById(@PathVariable Integer id) {
        return personService.obtenerPersonaPorId(id);
    }

    // Actualizar persona
    @PutMapping
    public void updatePersona(@RequestBody Person person) {
        personService.actualizarPersona(person);
    }

    // Eliminar persona por ID
    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable Integer id) {
        personService.obtenerPersonaPorId(id)
            .ifPresent(personService::borrarPersona);
    }
}
