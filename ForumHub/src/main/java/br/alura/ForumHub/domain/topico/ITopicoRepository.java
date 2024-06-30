package br.alura.ForumHub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITopicoRepository extends JpaRepository<Topico,Long> {
    Page<Topico> findAllByStatusTrue(Pageable paginacao);

}
