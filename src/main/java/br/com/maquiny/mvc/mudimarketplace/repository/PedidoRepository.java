package br.com.maquiny.mvc.mudimarketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maquiny.mvc.mudimarketplace.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	

}
