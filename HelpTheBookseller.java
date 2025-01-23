import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
      
        // check if empty
        if(lstOfArt.length==0||lstOf1stLetter.length==0) return "";
      
        // map to keep track of stock
        HashMap<String, Integer> categories = new HashMap<>();
      
        // make sure to include all categories that we seek
        for(String category : lstOf1stLetter) categories.put(category,0);
      
        // convert to list to check if contains
        List<String> requiredCategories = Arrays.asList(lstOf1stLetter);
      
        // if the first letter is included in the inquiry, add it to the summary
        for(String book : lstOfArt)
            if(requiredCategories.contains(book.substring(0,1)))
                categories.put(book.substring(0,1),
                        categories.getOrDefault(book.substring(0,1),0)
                                + Integer.parseInt(book.split(" ")[1]));
      
        // build the result string and trim the end later
        StringBuilder resultStringBuilder = new StringBuilder();
        for(String category : categories.keySet())  {
            resultStringBuilder.append("(")
                    .append(category)
                    .append(" : ")
                    .append(categories.get(category))
                    .append(")")
                    .append(" - ");
        }
        String result = resultStringBuilder.toString();
        return result.substring(0, result.length() - 3);
    }
}
