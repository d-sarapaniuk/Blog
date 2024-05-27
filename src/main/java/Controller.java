import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class Controller extends HttpServlet {
    ArticleRepository articleRepository = ArticleRepository.getInstance();
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("articles", articleRepository.getArticles());
        req.getRequestDispatcher("articleList.jsp").forward(req, res);
    }

}
