

/*class string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("my name is"+name);
    }
}*/
/*class string{
    public static void main(String[] args) {
        String first_name="Girish";
        String last_name="Mishra";
        String final_name=first_name+last_name;
        System.out.println(final_name.length());
       // for (int i=0;i<final_name.char.At(i));
    }
}*/
/*class string{
    public static void main(String[] args) {
        String name1="Girish";
        String name2="Girish";
        if (name1.compareTo(name2)==0){                                      //comparing of string
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}*/
/*class string{
    public static void main(String[] args) {
        String sentence="my name isgirish mishra";
        String point=sentence.substring(5,sentence.length());                  //substring
        System.out.println(point);
    }
}*/
//class java.util.*;
/*class setbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("pink");       
        //System.out.println(sb);
        //System.out.println(sb.charAt(0));                               //indexing values
        //sb.setCharAt(1,'o');                                   //change a word
        //System.out.println(sb);
        //sb.insert(4,"i");                          //inserting
        //System.out.println(sb);
        //sb.delete(1,3);                       //deleting
        //System.out.println(sb);



    }
} */
/*class string{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}  */
class setbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        for (int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);
    }
}
                                                                                     

