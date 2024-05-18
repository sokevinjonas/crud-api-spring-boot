package com.sokevinjonas.crud.controller;

import com.sokevinjonas.crud.modele.Produit;
import com.sokevinjonas.crud.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produit")
//@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping(path = "/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }
    @GetMapping(path = "/read")
    public List<Produit> read (){
        return produitService.lire();
    }

    @PutMapping(path = "/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id, produit);
    }

    @DeleteMapping(path = "/delete{id}")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }
}
