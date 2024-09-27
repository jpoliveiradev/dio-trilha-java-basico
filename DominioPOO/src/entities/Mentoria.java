package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo{
    private String tema;
    private String data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
