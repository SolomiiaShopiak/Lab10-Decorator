package ua.edu.ucu.apps.decorator;

import java.time.Duration;
import java.time.LocalTime;


public class TimedDocument extends AbstractDecorator{

    public TimedDocument(Document document) {
        super(document);
    }

    @Override
    public String parse() {
        LocalTime startTime = LocalTime.now();
        String res = document.parse();
        LocalTime endTime = LocalTime.now();

        System.out.println("Time: " + Duration.between(startTime, endTime).getSeconds());
        return res;
    }

    // public String getGcsPath() {
    //     return document.getGcsPath();
    // }
    
}
