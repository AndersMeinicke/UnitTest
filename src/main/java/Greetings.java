import java.util.ArrayList;

import static java.lang.Character.TYPE;
import static java.lang.Character.isUpperCase;

public class Greetings {
    public String greet(Object name) {
        if (name instanceof String) {
            if (name != null) {
                String stringName = (String) name;
                for (int i = 0; i < stringName.length(); i++) {
                    if (isUpperCase(stringName.charAt(i))) {
                        if (i == stringName.length() - 1) {
                            return "HELLO " + stringName;
                        }
                    } else break;
                }
                return "Hello, " + stringName;
            }
        } else if (name instanceof String[]) {
            String[] names = (String[]) name;
            ArrayList<String> allNormalNames = new ArrayList<>();
            ArrayList<String> allCapsNames = new ArrayList<>();
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names[i].length(); j++) {
                    if (isUpperCase(names[i].charAt(j))) {
                        if (j == names[i].length() - 1) {

                            allCapsNames.add(names[i]);
                        }
                    } else {
                        allNormalNames.add(names[i]);
                        break;
                    }
                }
            }
            String greetings = "Hello,";
            for (int i = 0; i < allNormalNames.size(); i++) {
                if (allNormalNames.size() > 2) {
                    if (i == allNormalNames.size() - 1) {
                        greetings += " and " + allNormalNames.get(i) + ".";
                    } else {
                        greetings += " " + allNormalNames.get(i) + ",";
                    }
                } else {
                    if (i == allNormalNames.size() - 1) {
                        greetings += " and " + allNormalNames.get(i) + ".";
                    } else {
                        greetings += " " + allNormalNames.get(i);
                    }
                }
            }
            for (int i = 0; i < allCapsNames.size(); i++) {
                if (i == 0){
                    greetings += " AND HELLO";
                }
                if (i == allCapsNames.size()-1){
                    greetings += " " + allCapsNames.get(i) + "!";
                }
                else
                {
                    greetings += " " + allCapsNames.get(i) + ",";
                }
            }
            return greetings;
        } else {
            return "Hello, friend";
        }
        return null;
    }
}

