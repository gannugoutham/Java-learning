public class StringMethods {
    public static void main() {
        String userName = "Gannu Goutham"; //declaration and initialization of string
        String firstName = userName.substring(6, 13); //includes the substring from index 6 to 12 ( excludes index 13 )
        String lastName = userName.substring(0, 5);
        String fullName = firstName + lastName;
        int length = fullName.length();
        String lowerCaseName = fullName.toLowerCase();
        String upperCaseName = fullName.toUpperCase();

        //comparing strings using " == " , it compares the object references
        String text1 = "gannu";
        String text2 = "gannu"; // text1 and text2 both are referring to same object of value gannu
        String text3 = new String("gannu"); // new keyword creates diff reference
        String text4 = new String("gannu");
        boolean check1 = text1 == text2; // returns True. comparing the strings referring to same object( == compares the obj reference )
        boolean check2 = text1 == text3; // returns false. comparing the same value but comparing to different object references.
        boolean check3 = text3 == text4; // returns false.

        //comparing strings using '.equals()' ,  it compares the object values irrespective of references
        String text5 = "gannu";
        String text6 = "goutham"; // text1 and text2 both are referring to same object of value gannu
        String text7 = new String("gannu"); // new keyword creates diff reference
        String text8 = new String("goutham");
        boolean check4 = text5.equals(text7); // returns True. comparing the string values referring to different object.

    }
}
