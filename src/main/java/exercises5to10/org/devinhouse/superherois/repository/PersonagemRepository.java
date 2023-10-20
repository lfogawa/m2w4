package exercises5to10.org.devinhouse.superherois.repository;

import exercises5to10.org.devinhouse.superherois.model.Personagem;

import java.util.*;

public class PersonagemRepository {

    private List<Personagem> personagens = new ArrayList<>();

    public void inserir(Personagem personagem) {
        personagens.add(personagem);
    }

    public List<Personagem> listar() {
        return personagens;
    }

}