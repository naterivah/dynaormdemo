/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import be.bittich.dynaorm.core.TableColumn;
import be.bittich.dynaorm.exception.EntityDoesNotExistException;

import be.bittich.dynaorm.repository.DynaRepository;
import entity.City;
import entity.Country;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CountryService implements Service<Country> {

    private DynaRepository<Country> repository;

    /**
     * Injection by constructor
     *
     * @param repository
     */
    public CountryService(DynaRepository repository) {
        this.repository = repository;

    }

    @Override
    public Country findById(Country count) {
        Country country = repository.findById(count);
        return country;
    }

    @Override
    public List<Country> findAll() {
        return repository.findAll();
    }

    @Override
    public void update(Country country) {
        repository.update(country);
    }

    @Override
    public DynaRepository getRepository() {

        return repository;
    }

    public void setRepository(DynaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void delete(Country t) {
        try {
            repository.delete(t);
        } catch (EntityDoesNotExistException ex) {
            Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, "Impossible de supprimer la ville. Raison : " + ex.getMessage(), ex);
        }
    }

    @Override
    public TableColumn getTableColumn() {
        return repository.getTableColumn();
    }
}
