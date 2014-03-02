/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import be.bittich.dynaorm.core.TableColumn;
import be.bittich.dynaorm.repository.DynaRepository;
import java.util.List;

/**
 *
 * @author user
 * @param <T>
 */
public interface Service<T> {

    List findAll();

    DynaRepository getRepository();

    void update(T t);
    
    void delete(T t);

    T findById(T id);
    
    TableColumn getTableColumn();
}
