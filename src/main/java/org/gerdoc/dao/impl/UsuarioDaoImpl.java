package org.gerdoc.dao.impl;

import org.gerdoc.dao.UsuarioDao;
import org.gerdoc.model.Usuario;
import org.gerdoc.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao
{
    private Session session;

    public UsuarioDaoImpl( )
    {
        session = HibernateUtil
                .getSessionFactory( )
                .openSession( );
    }

    @Override
    public List<Usuario> findAll()
    {
        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Usuario> criteria =
                builder.createQuery(Usuario.class);
        criteria.from(Usuario.class);
        return session
                .createQuery(criteria)
                .getResultList();
    }

    @Override
    public Usuario findById(Long id)
    {
        return session.get( Usuario.class, id );
    }

}
