public class XMLAdapter extends DataAdapter {
    public XMLAdapter(InternalData data) {
        super(data);
    }

    public String toXml() {
        StringBuilder xml = new StringBuilder("<person>");
        toExternalFormat().forEach((key, value) -> {
            xml.append("<").append(key).append(">")
               .append(value)
               .append("</").append(key).append(">");
        });
        xml.append("</person>");
        return xml.toString();
    }
}
