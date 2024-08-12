public class string {
    public static void main(String[] args) {
//        String name = "I am Ayush";
////        System.out.println(name);
////        String lstring = name.toUpperCase();
////        System.out.println(lstring);
//        name= name.replace(" ","{}");
//        System.out.println(name);

        String text = "Dear <|name|> , Thanks a lot!";
        text = text.replace("<|name|> ","Ayush");
        System.out.println(text);

     }
}
