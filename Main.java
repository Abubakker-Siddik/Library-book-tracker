public class Main {
    public static void main(String[] args){

        //objects of class book
        Book b1 = new Book("Java mastery", "sundar pichai", 250, false);
        Book b2 = new Book("Programming tactics", "mark munroe", 200, false);
        
        //printing book details
        System.out.println("BOOK1:  title: "+b1.title+"/ author: "+b1.author+"/ pages: "+b1.pages+"/ checkedout: "+b1.isCheckedOut);
        System.out.println("BOOK2:  title: "+b2.title+"/ author: "+b2.author+"/ pages: "+b2.pages+"/ checkedout: "+b2.isCheckedOut);

        //updating isCheckOut
        b1.isCheckedOut = true;

        //final print statement
        System.out.println("BOOK1 updated checkout: "+b1.isCheckedOut);
        

    }
}
