package org.gerdoc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.gerdoc.service.UsuarioService;
<%@ page import="org.gerdoc.service.AlumnoService" %>
<%@ page import="org.gerdoc.service.impl.AlumnoServiceImpl" %>
<%@ page import="org.gerdoc.model.Alumno" %>

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("usarname" );
        String password = req.getParameter("password" );
        UsuarioService usuarioService = new UsuarioServiceImpl( );
        List<Usuario> usuarios = usuarioService.findAll( );
        int i = 0;
        for (Usuario usuario : usuarios)
        {++i
        usuario.getId( )
        usuario.getNombre( )
        usuario.getEdad( )
        usuario.getPromedio( )

        //Long id = Long.parseLong( req.getParameter("id" ) );
        System.out.println(nombre);
        System.out.println(password);
        System.out.println("hola");
    }
}
