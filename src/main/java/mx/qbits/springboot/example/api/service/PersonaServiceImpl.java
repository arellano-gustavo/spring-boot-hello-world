package mx.qbits.springboot.example.api.service;

import org.springframework.stereotype.Service;
import mx.qbits.springboot.example.api.model.persona.PersonaPojo;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Override
    public PersonaPojo[] getAll() {
        PersonaPojo personas[] = new PersonaPojo[3];
        personas[0] = new PersonaPojo(71, "gus","are");
        personas[1] = new PersonaPojo(72, "tavo","sabd");
        personas[2] = new PersonaPojo(73, "luis","perez");
        return personas;
    }

}
