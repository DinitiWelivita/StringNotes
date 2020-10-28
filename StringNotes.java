package stringnotes;

/**
 *
 * @author 802967
 */
public class StringNotes {

    public static void main(String[] args) {
       //String is a class
        String firstName = "Dede";
       //int is a primative data type
       int age = 17;
       String lastName = "Welivita";
       //concatenate two Strings - push strings together
       System.out.println(firstName + " " + lastName);
       ifsWithStrings();
       partsOfStrings();
    }
    
    public static void partsOfStrings() {
        String word = "watermelon";
        //each character in a String has an index, starting with 0
        String newWord = word.substring(5);
        System.out.println(newWord);
        String newWord2 = word.substring(0,5);
        System.out.println(newWord2);
        String newWord3 = word.substring(1,4);
        System.out.println(newWord3);
        //where is the l?
        System.out.println(word.contains("e"));
        
        String fullName = "Diniti Amali Welivita";
        System.out.println(fullName.substring(fullName.indexOf(" ")+1, fullName.lastIndexOf("")));
    }
    
    public static void ifsWithStrings() {
        String userInput = "Michigan";
        if (userInput.trim().equalsIgnoreCase("Michigan")) {
            System.out.println("You're a wolverine fan?");
    }
        
        else {
                System.out.println("Do you like the buckeyes?");
                }
        
    }
    
}
