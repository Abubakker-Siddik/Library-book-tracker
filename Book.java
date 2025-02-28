class Book{

    //instance variable field
    String title;
    String author;
    int pages;
    boolean isCheckedOut = false;

    //constructor field
    Book(String title, String author, int pages, boolean isCheckedOut){

        //initializing instance variable to parameters
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isCheckedOut = isCheckedOut;


    }


}