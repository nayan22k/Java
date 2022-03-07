package com.company;

public class string_methods {
    public static void main(String[] args) {
        String name = "Harry";
    //    System.out.println(name);
    //    int value = name.length();
    //    System.out.println(value);

/*        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimedString = "   Harry    ";
        System.out.println(nonTrimedString);

        String trimmedString = nonTrimedString.trim();
        System.out.println(trimmedString);

 */
    //    System.out.println(name.substring(1));
    //    System.out.println(name.substring(1,4));

    //    System.out.println(name.replace('r','p'));
    //    System.out.println(name.replace("r","ier"));

    //    System.out.println(name.startsWith("Har"));
    //    System.out.println(name.endsWith("ry"));

        System.out.println(name.charAt(0));

        String modifiedName = "Harryrryrry";
    //    System.out.println(modifiedName.indexOf("rry"));
    //    System.out.println(modifiedName.indexOf("rry",4));

        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence \" double quote");
    }
}
