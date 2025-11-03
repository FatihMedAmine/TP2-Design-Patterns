public class Invoice extends Document {
    private String invoiceNumber;
    private double amount;

    public Invoice(String title, String author, String content, String invoiceNumber, double amount) {
        super(title, author, content);
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public Document clone() {
        return new Invoice(this.title, this.author, this.content, this.invoiceNumber, this.amount);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
               ", invoiceNumber='" + invoiceNumber + '\'' +
               ", amount=" + amount +
               '}';
    }
}
