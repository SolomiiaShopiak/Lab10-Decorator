package ua.edu.ucu.apps.decorator;

public abstract class AbstractDecorator implements Document {
    protected Document document;

    public AbstractDecorator(Document document) {
        this.document = document;
    }

    @Override
    public String getGcsPath() {
        return document.getGcsPath();
    }

    @Override
    public String parse() {
        return document.parse();
    }
}
