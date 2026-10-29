package org.gerdoc.dao;

import org.gerdoc.model.Usuario;

import java.util.List;

public interface UsuarioDao
{
    List<Usuario> findAll( );
    Usuario findById(Long id);
}
