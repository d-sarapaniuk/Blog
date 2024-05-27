import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class AddArticleController extends HttpServlet {
    ArticleRepository articleRepository = ArticleRepository.getInstance();
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("addArticle.jsp").forward(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        Article article = new Article(title, content, new Date());
        articleRepository.addArticle(article);
    }
}
