package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("rowling")) {
            return "Joanne Rowling, CH, OBE, FRSL, FRCPE, who writes under the pen names J. K. Rowling and Robert Galbraith, is a British novelist and screenwriter who is best known for writing the Harry Potter fantasy series.";
        }
        return "";
    }
}
