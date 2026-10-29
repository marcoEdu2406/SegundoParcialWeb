package org.gerdoc.service.impl;

import org.gerdoc.dao.UsuarioDao;
import org.gerdoc.dao.impl.UsuarioDaoImpl;
import org.gerdoc.model.Usuario;
import org.gerdoc.service.UsuarioService;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioService
{
    private UsuarioDao alumnoDao;

    public UsuarioServiceImpl( )
    {
        this.alumnoDao = new UsuarioDaoImpl( );
    }

    @Override
    public List<Usuario> findAll()
    {
        return alumnoDao.findAll( );
    }

    @Override
    public Usuario findById(Long id)
    {
        return alumnoDao.findById( id );
    }
}
