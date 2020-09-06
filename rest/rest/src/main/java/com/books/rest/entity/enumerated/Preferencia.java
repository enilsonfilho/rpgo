package com.books.rest.entity.enumerated;

public enum Preferencia {

	FICCAO(0, "Ficção"),
	CIENCIA(1, "Ciência"),
    MAGIA(2, "Magia");

    private final Integer tipo;
    private final String descricao;

    private Preferencia(Integer tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Preferencia parse(String param) {
        for (Preferencia value : Preferencia.values()) {
            if (value.getTipo().equals(param)) {
                return value;
            }
        }
        return null;
    }
	
}
