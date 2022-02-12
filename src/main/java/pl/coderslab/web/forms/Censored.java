package pl.coderslab.web.forms;

public class Censored {
    private static String[] FORBIDDEN_WORDS = {"cholera","kurde","kurde blaszka"};
    public static String doCensor(final String toBeCensored) {
        String censored = toBeCensored;
        for (String forbidden : FORBIDDEN_WORDS){
            censored = censored.replaceAll(forbidden, "*".repeat(forbidden.length()));
        }
        return censored;
    }
}

