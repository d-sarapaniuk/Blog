import java.util.Date;

public class Article {
    private String title;
    private String content;
    private Date publicationDate;

    public Article(String title, String content, Date publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }
}
