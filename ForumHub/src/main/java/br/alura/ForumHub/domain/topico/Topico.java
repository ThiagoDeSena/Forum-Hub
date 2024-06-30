package br.alura.ForumHub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos") //especificar o nome da tabela no banco de dados que corresponde a essa entidade
@Entity(name = "Topico")    //indica que essa classe é uma entidade do JPA, ou seja, ela será mapeada para uma tabela no banco de dados.
@Getter //Essa anotação do Lombok gera automaticamente os métodos getters para todos os atributos da classe
@NoArgsConstructor  //Essa anotação do Lombok gera automaticamente um construtor sem argumentos para a classe.
@AllArgsConstructor //Essa anotação do Lombok gera automaticamente um construtor com todos os argumentos da classe.
@EqualsAndHashCode(of = "id")   //Essa anotação do Lombok gera automaticamente os métodos equals() e hashCode() com base no atributo id da classe.
public class Topico {

    @Id //Essa anotação indica que o atributo marcado é o identificador único (chave primária) da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Essa anotação especifica como o valor do ID será gerado. A estratégia IDENTITY significa que o valor do ID será gerado automaticamente pelo banco de dados
    private Long id;
    private String titulo;
    private String mensagem;
    //@Column(name = "data_criacao")
    private LocalDateTime dataCriacao;
    private Boolean status;
    private String autor;
    private String curso;

    public Topico(DadosCadastroTopicos dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = LocalDateTime.now();
        this.status = true;
        this.autor = dados.autor();
        this.curso = dados.curso();
    }


    public void atualizar(DadosAtuzalizacaoTopico dados) {
        if (dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }

    }

    public void excluir() {
        this.status = false;
    }
}
