package model.dao;

import model.Table;

import java.util.Collection;

/**
 * Created by ооо on 14.07.2015.
 */
public interface TableDao {

    void add(Table table);
    void delete(Table table);
    Collection<Table> getTable(String search);
}
