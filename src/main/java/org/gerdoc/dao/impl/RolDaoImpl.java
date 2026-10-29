package org.gerdoc.dao.impl;

import org.gerdoc.dao.RolDao;
import org.gerdoc.model.Rol;
import org.gerdoc.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class RolDaoImpl implements RolDao
{
    private Session session;

    public RolDaoImpl( )
    {
        session = HibernateUtil
                .getSessionFactory( )
                .openSession( );
    }

    @Override
    public List<Rol> findAll()
    {
        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Rol> criteria =
                builder.createQuery(Rol.class);
        criteria.from(Rol.class);
        return session
                .createQuery(criteria)
                .getResultList();
    }

    @Override
    public Rol findById(Long id)
    {
        return session.get( Rol.class, id );
    }

}
