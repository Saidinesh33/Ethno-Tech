import java.util.Scanner;
class Node 
{
    String page;
    Node next;
    Node(String page) 
    {
        this.page = page;
        this.next = null;
    }
}

public class BrowserHistory 
{
    static Node head = null;
    static void visitPage(String page) 
    {
        Node newNode = new Node(page);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    static void displayHistory() 
    {
        if (head == null) 
        {
            System.out.println("No browsing history.");
            return;
        }
        Node temp = head;
        while (temp != null) 
        {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }
    static void searchPage(String page) 
    {
        Node temp = head;
        while (temp != null) 
        {
            if (temp.page.equalsIgnoreCase(page)) 
            {
                System.out.println("Page Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Page Not Found");
    }

    static void deletePage(String page) 
    {
        if (head == null) 
        {
            return;
        }
        if (head.page.equalsIgnoreCase(page)) 
        {
            head = head.next;
            System.out.println("Page Deleted");
            return;
        }
        Node temp = head;
        while (temp.next != null) 
        {
            if (temp.next.page.equalsIgnoreCase(page)) 
            {
                temp.next = temp.next.next;
                System.out.println("Page Deleted");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Page Not Found");
    }
    static void countPages() 
    {
        int count = 0;
        Node temp = head;
        while (temp != null) 
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Visited Pages: " + count);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("\n1.Visit Page");
            System.out.println("2.Display History");
            System.out.println("3.Search Page");
            System.out.println("4.Delete Page");
            System.out.println("5.Count Pages");
            System.out.println("6.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Page Name: ");
                    String page = sc.nextLine();
                    visitPage(page);
                    break;
                case 2:
                    displayHistory();
                    break;
                case 3:
                    System.out.print("Enter Page to Search: ");
                    searchPage(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Page to Delete: ");
                    deletePage(sc.nextLine());
                    break;
                case 5:
                    countPages();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } 
        while (choice != 6);
        sc.close();
    }
}