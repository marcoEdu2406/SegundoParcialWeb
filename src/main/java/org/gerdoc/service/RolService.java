package org.gerdoc.service;

import org.gerdoc.model.Rol;

import java.util.List;

public interface RolService
{
    List<Rol> findAll( );
    Rol findById( Long id );
}
