package br.alura.ForumHub.controller;

import br.alura.ForumHub.domain.ValidacaoException;
import br.alura.ForumHub.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private ITopicoRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastro(@RequestBody @Valid DadosCadastroTopicos dados, UriComponentsBuilder uriBuilder){
        var topico = new Topico(dados);
        repository.save(topico);

        var uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoTopico(topico));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemTopicos>> listagem(@PageableDefault(size = 10,sort = "dataCriacao")Pageable paginacao){
        var page = repository.findAllByStatusTrue(paginacao).map(DadosListagemTopicos::new);
        return ResponseEntity.ok(page);
    }


    @GetMapping("/{id}")
    public ResponseEntity detalharTopico(@PathVariable Long id){
        var topicoEncontrado = repository.findById(id);
        if (topicoEncontrado.isPresent()){
            var topico = repository.getReferenceById(id);

            return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
        }
        else{
            throw new ValidacaoException("Tópico não encontrado!");
        }

    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtuzalizacaoTopico dados, @PathVariable Long id){
        //Verifica se o topico existe no banco
        Optional<Topico> topicoPresente = repository.findById(id);
        if (topicoPresente.isPresent()){
            var topico = topicoPresente.get();
            topico.atualizar(dados);

            return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
        }
        else{

            throw new ValidacaoException("Tópico não existente no banco");
        }

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id){
        Optional<Topico> topicoEncontrado = repository.findById(id);

        if (topicoEncontrado.isPresent()){
            var topico = repository.getReferenceById(id);

            topico.excluir();

            return ResponseEntity.noContent().build();
        }
        else{
            throw new ValidacaoException("Tópico não achado no banco!");
        }
    }



}
