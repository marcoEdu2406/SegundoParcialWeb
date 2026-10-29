package org.gerdoc.service;

import org.gerdoc.model.Usuario;

import java.util.List;

public interface UsuarioService
{
    List<Usuario> findAll( );
    Usuario findById( Long id );
}
