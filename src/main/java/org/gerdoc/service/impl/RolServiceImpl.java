package org.gerdoc.service.impl;

import org.gerdoc.dao.RolDao;
import org.gerdoc.dao.impl.RolDaoImpl;
import org.gerdoc.model.Rol;
import org.gerdoc.service.RolService;

import java.util.List;

public class RolServiceImpl implements RolService
{
    private RolDao alumnoDao;

    public RolServiceImpl( )
    {
        this.alumnoDao = new RolDaoImpl( );
    }

    @Override
    public List<Rol> findAll()
    {
        return alumnoDao.findAll( );
    }

    @Override
    public Rol findById(Long id)
    {
        return alumnoDao.findById( id );
    }
}
