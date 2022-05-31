package main.strings;

class RegularExpressions {
    static String whiteSpaceRegex() {
        return "\\s+";
    }
    
    static String honorificRegex() {
        return "^(?:dr|mr|ms|mrs)\\.?$";
    }
    
    static String postNominalRegex() {
        return "^(?:phd|md|sr|jr)\\.?$";
    }
    
    static String commaAtEndOfString() {
        return "\\,$";
    }
}
