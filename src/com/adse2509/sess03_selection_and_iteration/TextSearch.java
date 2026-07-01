package com.adse2509.sess03_selection_and_iteration;

/**
 * Java program to search for some text in a paragraph using a while loop.
 * 
 * @author odhia
 */
public class TextSearch
{
    public static void main(String[] args)
    {
        // Paragraph to search text within
        String paragraph = "To change the way a picture fits in your document, click it and a button for layout options appears next to it. When you work on a table, click where you want to add a row or a column, and then click the plus sign. Reading is easier, too, in the new Reading view. You can collapse parts of the document and focus on the text you want. If you need to stop reading before you reach the end, Word remembers where you left off - even on another device. Video provides a powerful way to help you prove your point. When you click Online Video, you can paste in the embed code for the video you want to add. You can also type a keyword to search online for the video that best fits your document. To make your document look professionally produced, Word provides header, footer, cover page, and text box designs that complement each other. For example, you can add a matching cover page, header, and sidebar.";
        
        // Word/text to search for
        String textToSearch = "remembers";
        boolean found = false; // Variable to indicate whether the text has been found or not
        int index = 0;
        
        // Use a while loop to search for the text
        while(index < paragraph.length())
        {
            // Check if the substring matches the text to search
            if (index + textToSearch.length() <= paragraph.length()
                    && paragraph.substring(index, index + 
                            textToSearch.length()).equals(textToSearch))
            {
                found = true;
                break; // Exit the loop as we've found the text were searching for
            }
            index++; // Increment the index to check the next character
            
        }
        
        // Display/output the results
        if(found)
        {
            System.out.println("The text/word '" + textToSearch + "' was found "
                    + "at index: " + index);
        }
        else
        {
            System.out.println("Unfortunately, the text/word '" + textToSearch +
                    "' was not found in the paragraph.");
        }
    }
    
}
