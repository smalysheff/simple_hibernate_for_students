package ru.sapteh.dao;

import java.util.List;

public interface Dao <Entity, Key>{
    Entity findById(Key key);
    List<Entity> findAll();
    void sava(Entity entity);
    void update(Entity entity);
    void deleteById(Key key);
}
