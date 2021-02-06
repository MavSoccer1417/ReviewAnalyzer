package com.example.ReviewAnalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewAnalyzerApplicationTests {

    private ReviewAnalyserApplication analyser = new ReviewAnalyserApplication();
    @Test	 
    public void testWordCount() {     	 
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
    }
}
