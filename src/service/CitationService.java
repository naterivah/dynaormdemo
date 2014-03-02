/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import be.bittich.dynaorm.core.TableColumn;
import be.bittich.dynaorm.exception.EntityDoesNotExistException;
import be.bittich.dynaorm.repository.DynaRepository;
import entity.Citation;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nordine
 */
public class CitationService implements Service<Citation> {

    private DynaRepository<Citation> repository;

    public CitationService(DynaRepository<Citation> repository) {
        this.repository = repository;
    }

    public void setRepository(DynaRepository<Citation> repository) {
        this.repository = repository;
    }

    
    @Override
    public List<Citation> findAll() {
        return repository.findAll();
    }

    @Override
    public DynaRepository getRepository() {
        return this.repository;
    }

    @Override
    public void update(Citation t) {
        repository.update(t);
    }

    @Override
    public void delete(Citation t) {
        try {
            repository.delete(t);
        } catch (EntityDoesNotExistException ex) {
            Logger.getLogger(CitationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Citation findById(Citation cit) {
        return repository.findById(cit);
    }

    @Override
    public TableColumn getTableColumn() {
        return repository.getTableColumn();
    }

}
