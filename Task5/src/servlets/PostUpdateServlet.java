package servlets;

import db.classes.Post;
import db.managers.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/post_update")
public class PostUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String title = request.getParameter("update_title");
            String short_content = request.getParameter("update_short_content");
            String content = request.getParameter("update_content");
            Long post_id = Long.parseLong(request.getParameter("post_id"));
            Long user_id = Long.parseLong(request.getParameter("user_id"));


            if(DBManager.getPost(post_id) != null) {
                if (DBManager.updatePost(new Post(post_id,title, short_content, content, DBManager.getUserById(user_id)))) {
                    response.sendRedirect("/?success=true&type=2");
                } else {
                    throw new Exception();
                }
            } else {

            }


        } catch (Exception e){
            e.printStackTrace();
            response.sendRedirect("/?success=false&type=0");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
