package com.sokevinjonas.crud.service;

import com.sokevinjonas.crud.modele.Produit;

import java.util.List;

public interface ProduitService {

    Produit create(Produit produit);

    List<Produit> lire();

    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
}
