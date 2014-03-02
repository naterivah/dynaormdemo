/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import be.bittich.dynaorm.core.TableColumn;
import be.bittich.dynaorm.exception.EntityDoesNotExistException;
import be.bittich.dynaorm.repository.DynaRepository;
import entity.Auteur;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nordine
 */
public class AuteurService implements Service<Auteur> {

    private DynaRepository<Auteur> repository;

    public AuteurService(DynaRepository<Auteur> repository) {
        this.repository = repository;
    }

    public void setRepository(DynaRepository<Auteur> repository) {
        this.repository = repository;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public DynaRepository getRepository() {
        return repository;
    }

    @Override
    public void update(Auteur t) {
        repository.update(t);
    }

    @Override
    public void delete(Auteur t) {
        try {
            repository.delete(t);
        } catch (EntityDoesNotExistException ex) {
            Logger.getLogger(AuteurService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Auteur findById(Auteur t) {
        return repository.findById(t);
    }

    @Override
    public TableColumn getTableColumn() {
        return repository.getTableColumn();
    }

}
