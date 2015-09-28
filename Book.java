/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Matthew George)
 * @version (9/28/15)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;

        refNumber = "";
        borrowed = 0;
        courseText = false;
    }

    // Add the methods here ...
    
    // NUMBER 83 - The accessors
    public String GetAuther()
    {
        return author;
    }
    public String GetTitle()
    {
        return title;
    }
    
    // NUMBER 84 - Print values
    public void PrintAuthor()
    {
        System.out.println("Book's author: " + author);
    }
    public void PrintTitle()
    {
        System.out.println("Book's title: " + title);
    }
    
    // NUMBER 85 - Pages
    public int GetPages()
    {
        return pages;
    }
    
    // NUMBER 86 - Print details
    public void PrintPages()
    {
        System.out.println("Pages: " + pages);
    }
    public void PrintDetails()
    {
        PrintTitle();
        PrintAuthor();
        PrintPages();
        
        if(refNumber.length() > 0) System.out.println("Reference number: " + refNumber);
        else System.out.println("Reference number: ZZZ");
        
        System.out.println("Times borrowed: " + borrowed);
        System.out.println((courseText) ? "Is course text" : "Not course text");
    }
    
    // NUMBER 87 - Reference number
    public void SetRefNumber(String ref)
    {
        if(ref.length() >= 3) refNumber = ref;
        else System.out.println("ERROR: REFERENCE NUMBER MUST BE AT LEAST 3 CHARACTERS!");
    }
    public String GetRefNumber()
    {
        return refNumber;
    }
    
    // NUMBER 90 - Borrowed
    public void borrow()
    {
        borrowed++;
    }
    public int GetBorrowed()
    {
        return borrowed;
    }
    
    // NUMBER 91 - Is course text
    public void ToggleCourseText()
    {
        courseText = (courseText) ? false : true;
    }
    public boolean GetCourseText()
    {
        return courseText;
    }
}
