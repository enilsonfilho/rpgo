package com.books.rest.entity.enumerated;

public enum TipoUM {

	USER(0, "User"),
	MACHINE(1, "Machine");

    private final Integer tipo;
    private final String descricao;

    private TipoUM(Integer tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoUM parse(String param) {
        for (TipoUM value : TipoUM.values()) {
            if (value.getTipo().equals(param)) {
                return value;
            }
        }
        return null;
    }
}
