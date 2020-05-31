package MyHomeProjectPackage;

public class lesson5 {

    public static void main(String[] args) {

        String text = "       I l__^^^^^e_ar)n j=====a-V*a";

        //remove leading and trailing spaces.
        text = text.trim();

        //symbols replacement
        text = text.replace("_","");
        text = text.replace("^","");
        text = text.replace(")","");
        text = text.replace("=","");
        text = text.replace("-","");
        text = text.replace("*","");
        text = text.replace("V","v");
        
        System.out.println(text +"!");
    }
}

