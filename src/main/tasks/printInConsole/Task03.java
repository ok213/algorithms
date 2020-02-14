package main.tasks.printInConsole;

// что будет выведено в консоль, если attachment == true/false ?
// true : attachment
// false : inline; filename=new.txt

public class Task03 {

    private static final String ATTACHMENT = "attachment";
    private static final String INLINE = "inline";

    public static void main(String[] args) {
        // ...
        String downloadFileName = "new.txt";
        boolean attachment = false;
        System.out.println(attachment ? ATTACHMENT : INLINE + "; filename=" + downloadFileName);


    }
}
