package io.fp.dictionary;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    private final Map<String, String> dictionary = new TreeMap<>();

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void addWordsToDictionary(String english, String german) throws DictionaryException {
        if(!dictionary.containsKey(english)) dictionary.put(english, german);
        else {
            throw new DictionaryException(String.format("The word %s is already in the dictionary", english));
        }
        
    }

    public void removeWordFromDictionary(String english) throws DictionaryException{
        //Aufgabe b)
    }

    public String changeTranslation(String englishWord, String germanWord) throws DictionaryException{
        //Aufgabe c)
        return null;
    }

    public String getGermanWord(String english) throws DictionaryException{
        //Aufgabe d)
        return null;
    }

    public String getEnglishWord(String germanWord) throws DictionaryException{
        //Aufgabe d)
        return null;
    }

 
}