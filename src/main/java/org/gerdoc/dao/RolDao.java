package org.gerdoc.dao;

import org.gerdoc.model.Rol;

import java.util.List;

public interface RolDao
{
    List<Rol> findAll( );
    Rol findById(Long id);
}
