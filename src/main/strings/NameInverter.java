package main.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.strings.RegularExpressions.*;

public class NameInverter {
    public String invert(String name) {
        if (name == null) {
            return "";
        }
        return invert(splitNameToPartsIgnoringWhitespace(name));
    }
    
    private String invert(List<String> nameParts) {
        String result;
        // First we remove all honorifics such as mr, mrs etc
        removeHonorifics(nameParts);
        // To properly work, we need to first build and remove post nominals from the nameParts
        String postNominals = mergePostNominals(nameParts);
        removePostNominals(nameParts);
        // Then we take the last name and remove that as well
        String lastName = getLastName(nameParts);
        // Whatever remains, we consider to be all as first and middle names and such, will build them into a single string
        String firstName = getFirstAndMiddleNames(nameParts);
        result = String.format("%s, %s %s", lastName, firstName, postNominals).trim();
        // If only a single name is passed in, we don't want the trailing comma
        Pattern p = Pattern.compile(commaAtEndOfString());
        Matcher m = p.matcher(result);
        if (m.find()) {
            result = m.replaceAll("");
        }
        return result;
    }
    
    private String getLastName(List<String> nameParts) {
        String lastName = nameParts.get(nameParts.size() - 1);
        nameParts.remove(nameParts.size() - 1);
        return lastName;
    }
    
    private String getFirstAndMiddleNames(List<String> nameParts) {
        if (nameParts.size() == 1) {
            return nameParts.get(0);
        }
        StringBuilder firstAndMiddleNames = new StringBuilder();
        for (String name : nameParts) {
            firstAndMiddleNames.append(String.format("%s ", name));
        }
        return firstAndMiddleNames.toString().trim();
    }
    
    private String mergePostNominals(List<String> nameParts) {
        StringBuilder result = new StringBuilder();
        for (String namePart : nameParts) {
            if (isPostNominal(namePart)) {
                result.append(String.format("%s ", namePart));
            }
        }
        return result.toString().trim();
    }
    
    private void removePostNominals(List<String> nameParts) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (int i = 0; i < nameParts.size(); i++) {
            if (isPostNominal(nameParts.get(i))) {
                keysToRemove.add(i);
            }
        }
        // Need to sort the keysToRemove into descending because List.remove() will resort keys
        keysToRemove.sort(Collections.reverseOrder());
        for (int key : keysToRemove) {
            nameParts.remove(key);
        }
    }
    
    private boolean isPostNominal(String s) {
        Pattern regexp  = Pattern.compile(postNominalRegex(), Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexp.matcher(s);
        return matcher.find();
    }
    
    private void removeHonorifics(List<String> nameParts) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (int i = 0; i < nameParts.size(); i++) {
            if (isHonorific(nameParts.get(i))) {
                keysToRemove.add(i);
            }
        }
        // Need to sort the keysToRemove into descending because List.remove() will resort keys
        keysToRemove.sort(Collections.reverseOrder());
        for (int key : keysToRemove) {
            nameParts.remove(key);
        }
    }
    
    private boolean isHonorific(String s) {
        Pattern regexp  = Pattern.compile(honorificRegex(), Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexp.matcher(s);
        return matcher.find();
    }
    
    private List<String> splitNameToPartsIgnoringWhitespace(String name) {
        return new ArrayList<>(Arrays.asList(name.trim().split(whiteSpaceRegex())));
    }
}
