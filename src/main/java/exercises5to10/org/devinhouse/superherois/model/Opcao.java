package exercises5to10.org.devinhouse.superherois.model;

import exercises5to10.org.devinhouse.superherois.exception.OpcaoInvalidaException;

public enum Opcao {

    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;


    public static Opcao converter(int codigo) throws OpcaoInvalidaException {
        if (codigo == 0 || codigo > 4)
            throw new OpcaoInvalidaException("Opcao invalida!");
        return Opcao.values()[codigo - 1];
    }

}