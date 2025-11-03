import java.util.Objects;

public abstract class Document {
    protected String title;
    protected String author;
    protected String content;

    public Document(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public abstract Document clone();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", content='" + content + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;
        return Objects.equals(title, document.title) &&
               Objects.equals(author, document.author) &&
               Objects.equals(content, document.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, content);
    }
}
