package org.gerdoc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.gerdoc.service.UsuarioService;
import org.gerdoc.service.impl.UsuarioServiceImpl;
import org.gerdoc.model.Usuario;
import org.gerdoc.service.RolService;
import org.gerdoc.service.impl.RolServiceImpl;
import org.gerdoc.model.Rol;
import java.util.List;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("usarname" );
        String password = req.getParameter("password" );
        UsuarioService usuarioService = new UsuarioServiceImpl( );
        RolService rolService = new RolServiceImpl( );
        List<Usuario> usuarios = usuarioService.findAll( );
        List<Rol> roles = rolService.findAll( );
        boolean verify = false;

        for (Usuario usuario : usuarios) {
            System.out.println("hola");
            if (nombre.equals(usuario.getNombre()) && password.equals(usuario.getPassword())){
                verify = true;
            }else{
                System.out.println("");
                System.out.println(usuario.getNombre());
                System.out.println(usuario.getPassword());
            }
        }
        if (verify){

            resp.sendRedirect("Alumnos.jsp");
        }

    }
}
