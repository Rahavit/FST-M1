package activities;

public class Activity5 {
    public static void main(String []args) {
        String title = "My Dreams";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}
abstract class Book {
    String title;
    //Abstract method
    abstract void setTitle(String strTitle);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    public void setTitle(String strTitle) {
        title = strTitle;
    }
}
