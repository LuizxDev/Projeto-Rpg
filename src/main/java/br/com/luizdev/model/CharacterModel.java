package br.com.luizdev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //cria os metodos getter, setter e toString
@AllArgsConstructor // cria o metodo contrutor com todos os atributos
public class CharacterModel {

    private int life;
    private String name;
    private int strength;

}
