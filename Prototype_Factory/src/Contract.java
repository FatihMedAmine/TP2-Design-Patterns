public class Contract extends Document {
    private String partyA;
    private String partyB;
    private String clause;

    public Contract(String title, String author, String content, String partyA, String partyB, String clause) {
        super(title, author, content);
        this.partyA = partyA;
        this.partyB = partyB;
        this.clause = clause;
    }

    public String getPartyA() {
        return partyA;
    }

    public String getPartyB() {
        return partyB;
    }

    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }

    @Override
    public Document clone() {
        return new Contract(this.title, this.author, this.content, this.partyA, this.partyB, this.clause);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
               ", partyA='" + partyA + '\'' +
               ", partyB='" + partyB + '\'' +
               ", clause='" + clause + '\'' +
               '}';
    }
}
