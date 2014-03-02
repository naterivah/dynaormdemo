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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CityService implements Service<City> {

    private DynaRepository<City> repository;

    /**
     * Injection by constructor
     *
     * @param repository
     */
    public CityService(DynaRepository repository) {
        this.repository = repository;

    }

    @Override
    public City findById(City cit) {
        City city = repository.findById(cit);
        return city;
    }

    @Override
    public List<City> findAll() {
        return repository.findAll();
    }

    @Override
    public void update(City city) {
        repository.update(city);
    }

    @Override
    public DynaRepository getRepository() {

        return repository;
    }

    public void setRepository(DynaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void delete(City t) {
        try {
            repository.delete(t);
        } catch (EntityDoesNotExistException ex) {
            Logger.getLogger(CityService.class.getName()).log(Level.SEVERE, "Impossible de supprimer la ville. Raison : " + ex.getMessage(), ex);
        }
    }

    //CityService.java
    @Override
    public TableColumn getTableColumn() {
        return repository.getTableColumn();
    }
}
