class stringsinJava {
    public static void main(String[] args) {
        //strings 

        //concatenation
        String name1 = "Sweta";
        String name2 = "Singh";
        String name3 = name1 + " " + name2;
        System.out.println(name3);

        //chatAt
        String Name = "Gungun";
        System.out.println(Name.charAt(0));
        
        //Length
        System.out.println(Name.length());

        //Replace
        String firstName = "SWETa";
        String newName = firstName.replace('a', 'A');
        System.out.println(newName);
        System.out.println(firstName);

        //Substring
        String namee = "sweta and gungun";
        System.out.println(namee.substring(0,6));


        
    }
}
