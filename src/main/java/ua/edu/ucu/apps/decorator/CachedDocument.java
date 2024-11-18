package ua.edu.ucu.apps.decorator;


public class CachedDocument extends AbstractDecorator {

    public CachedDocument(Document document) {
        super(document);
    }

    @Override
    public String parse() {
        String cached = DBConnection.getInstance().getDocument(getGcsPath());
        if (cached != null) {
            return cached;
        } else {
            String parsed = document.parse();
            DBConnection.getInstance().createDocument(getGcsPath(), parsed);
            return parsed;
       }
    }
        

    // @Override
    // public String getGcsPath() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getGcsPath'");
    // }

}
