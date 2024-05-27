import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ArticleListController extends HttpServlet {
    ArticleRepository articleRepository = ArticleRepository.getInstance();
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("articles", articleRepository.getArticles());
        req.getRequestDispatcher("articleList.jsp").forward(req, res);
    }

}
