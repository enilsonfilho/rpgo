package com.books.rest.entity.enumerated;

public enum Status {

	ANDAMENTO(0, "Andamento"),
	CONCLUIDO(1, "Concluído");

    private final Integer tipo;
    private final String descricao;

    private Status(Integer tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status parse(String param) {
        for (Status value : Status.values()) {
            if (value.getTipo().equals(param)) {
                return value;
            }
        }
        return null;
    }
	
}
