package exercises5to10;

import exercises5to10.org.devinhouse.superherois.cli.Display;
import exercises5to10.org.devinhouse.superherois.exception.OpcaoInvalidaException;
import exercises5to10.org.devinhouse.superherois.model.Heroi;
import exercises5to10.org.devinhouse.superherois.model.Opcao;
import exercises5to10.org.devinhouse.superherois.model.Personagem;
import exercises5to10.org.devinhouse.superherois.model.Vilao;
import exercises5to10.org.devinhouse.superherois.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {

    private Display display = new Display();
    private PersonagemRepository personagemRepo = new PersonagemRepository();

    public void executar() {
        Opcao opcao = null;
        do {
            display.exibirMenu();
            int codigo = display.obterOpcao();
            try {
                opcao = Opcao.converter(codigo);
                processar(opcao);
            } catch (OpcaoInvalidaException e) {
                display.exibirMensagem( e.getMessage() );
            }
        } while(opcao != Opcao.SAIR);
    }

    private void processar(Opcao opcao) {
        if (opcao == Opcao.SAIR)
            return;
        if (opcao == Opcao.CADASTRAR_HEROI) {
            Heroi heroi = display.obterDadosHeroi();
            personagemRepo.inserir(heroi);
        } else if (opcao == Opcao.CADASTRAR_VILAO) {
            Vilao vilao = display.obterDadosVilao();
            personagemRepo.inserir(vilao);
        } else if (opcao == Opcao.LISTAR) {
            List<Personagem> personagens = personagemRepo.listar();
            display.listar(personagens);
        }
    }

}