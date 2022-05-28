package main.strings;

public class StringReverser {
    public String reverse(String subject) {
        char[]        subjectArray = subject.toCharArray();
        StringBuilder builder      = new StringBuilder();
        for (int i = subjectArray.length - 1; i >= 0; i--) {
            builder.append(subjectArray[i]);
        }
        return builder.toString();
    }
    
    public String reverseTwo(String subject) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < subject.length(); i++) {
            builder.append(subject.charAt(subject.length() - i - 1));
        }
        return builder.toString();
    }
}
