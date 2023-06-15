package br.com.romulo.romulo.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {

    public Filme(){


    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer duracaoEmMinutos;

    private Integer anoLancamento;

    private String genero;

    public String getNome() {
        return nome;
    }
    public Long getId() {
        return id;
    }

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public Filme( String nome, Integer duracaoEmMinutos, Integer anoLancamento, String genero) {
        this.nome = nome;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public void atualizaDados(DadosAlteracaoFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();

    }
}
