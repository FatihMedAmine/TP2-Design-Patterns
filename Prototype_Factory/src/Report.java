// Report.java
import java.util.ArrayList;
import java.util.List;

public class Report extends Document {
    private List<String> sections;

    public Report(String title, String author, String content) {
        super(title, author, content);
        this.sections = new ArrayList<>();
    }

    public Report(String title, String author, String content, List<String> sections) {
        super(title, author, content);
        this.sections = new ArrayList<>(sections);
    }

    public List<String> getSections() {
        return sections;
    }

    public void addSection(String section) {
        sections.add(section);
    }

    @Override
    public Document clone() {
        return new Report(this.title, this.author, this.content, new ArrayList<>(this.sections));
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
               ", sections=" + sections + "}";
    }
}
