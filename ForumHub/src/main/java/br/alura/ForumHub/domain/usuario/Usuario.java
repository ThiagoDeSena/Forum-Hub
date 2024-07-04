package br.alura.ForumHub.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity(name = "Usuario") //indica que essa classe é uma entidade do JPA, ou seja, ela será mapeada para uma tabela no banco de dados.
@Table(name = "usuarios") //especificar o nome da tabela no banco de dados que corresponde a essa entidade
@AllArgsConstructor //Essa anotação do Lombok gera automaticamente um construtor com todos os argumentos da classe.
@EqualsAndHashCode(of = "id") //Essa anotação do Lombok gera automaticamente os métodos equals() e hashCode() com base no atributo id da classe.
@NoArgsConstructor //Essa anotação do Lombok gera automaticamente um construtor sem argumentos para a classe.
@Getter //Essa anotação do Lombok gera automaticamente os métodos getters para todos os atributos da classe
public class Usuario implements UserDetails  {

    @Id //Essa anotação indica que o atributo marcado é o identificador único (chave primária) da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Essa anotação especifica como o valor do ID será gerado. A estratégia IDENTITY significa que o valor do ID será gerado automaticamente pelo banco de dados
    private Long id;
    private String login;
    private String senha;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
