package com.sokevinjonas.crud.repository;

import com.sokevinjonas.crud.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
