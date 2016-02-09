/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String ref = "";
    int refLength = ref.length();
    private int borrowed = 0;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNumber, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        ref = refNumber;
        courseText = bookCourseText;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRef()
    {
        return ref;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void setRef(String refNumber)
    {
        if(ref.length() <= 3)
        {
           System.out.println("Sorry cannot use that Reference Number.");
        }
        else
        {
            ref = refNumber;
        }
    }
    
    public void setBorrowed()
    {
        borrowed++;
    }
    
    public void printAuthor()
    {
        System.out.println("The author of the book is " + author);
    }
    
    public void printTitle()
    {
        System.out.println("The title of the book is " + title);
    }
    
    public void printDetails()
    {
        if(ref.length() <= 0)
        {
            System.out.println("*********************************");
            System.out.print("Author: " + author + "\nTitle: " + title + "\n# of Pages: " + pages + "\nRefNumber: ZZZ" + 
            "\nTimes the Book was Borrowed: " + borrowed);
            System.out.println("*********************************");
        }
        else
        {
            System.out.println("*********************************");
            System.out.println("Author: " + author + "\nTitle: " + title + "\n# of Pages: " + pages + "\nRefNumber: " + 
            ref + "\nTimes the Book was Borrowed: " + borrowed);
            System.out.println("*********************************");
        }
    }
    
    

    // Add the methods here ...
}
