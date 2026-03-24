package com.gerenciamento_de_clientes.demo.repository;

import com.gerenciamento_de_clientes.demo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}