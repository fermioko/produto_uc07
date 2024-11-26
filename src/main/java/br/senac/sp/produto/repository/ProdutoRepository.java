package br.senac.sp.produto.repository;

import br.senac.sp.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


    List<Produto> findByLote(String lote);
}
