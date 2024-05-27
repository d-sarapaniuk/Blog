import java.util.ArrayList;
import java.util.List;

// Singleton
public class ArticleRepository {
    private static ArticleRepository instance;
    private List<Article> articles;
    private ArticleRepository() {
        articles = new ArrayList<>();
    }
    public static ArticleRepository getInstance() {
        if (instance == null) { instance = new ArticleRepository(); }
        return instance;
    }
    public void addArticle(Article article) {
        articles.add(article);
    }
    public List<Article> getArticles() {
        return articles;
    }
}
