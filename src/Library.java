import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		char r;
		do {
		System.out.println("..........Library mangement Sytem........");
		System.out.println("Press 1 to add book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return book");
		System.out.println("Press 4 to print complete issue details");
		System.out.println("Press 5 to exit");
		
         Scanner obj5=new Scanner(System.in);
         System.out.println("Enter any number till 5");
         int o=obj5.nextInt();
         switch(o) {
         
         case 1:
        	 Lib adding= new Lib();
        	 adding.add();
        	 break;
        	 
         case 2:
        	 Lib iss= new Lib();
        	 iss.issue();
        	 break;
        	 
         case 3:
        	 
        	 Lib q= new Lib();
        	 q.Return();
        	 break;
        	 
         case 4:
        	 Lib info=new Lib();
        	 info.detail();
        	 break;
        	 
         case 5:
        	 Lib out=new Lib();
        	 out.exit();
        	 break;
        	 
        	default:
        		System.out.println("Invalid number");
         }
         System.out.println("you want to slecet next option Y/N");
          r=obj5.next().charAt(0);
		}
          while(r=='y' || r=='Y') ;
		
         if(r=='n' || r=='N') {
        	 Lib z= new Lib();
        	 z.exit();
        	 
        }
		
		
	}

}

class Lib{
	
	static String str,c,d;
	static int a,b;
	void add() {
		System.out.println("Enter the book Name, Price and Book Number");
		Scanner obj =new Scanner(System.in);
		String str=obj.nextLine();
		float price=obj.nextInt();
		int bookNumber=obj.nextInt();
		System.out.println("Your Details"+ str + price + bookNumber);
	}
	
	void issue() {
		
		Scanner obj1 =new Scanner(System.in);
		System.out.println("Book Name");
		str=obj1.nextLine();
		System.out.println("Book id");
		 a=obj1.nextInt();
		 obj1.nextLine();
		 System.out.println("Total number of Book Issued");
		 b=obj1.nextInt();
		 System.out.println("Issue Date");
		 c=obj1.nextLine();
		 obj1.nextLine();
		 System.out.println("Returned book Date");
		 d=obj1.nextLine();
		 
	}
	
	//here book id will b stored in getid()
	int getid() {
		
		return a;
	}
	
	void Return() {
		System.out.println("Enter the Student name & Book Id");
		Scanner obj2 =new Scanner(System.in);
		String name=obj2.nextLine();
		int BookId=obj2.nextInt();
		
		// to match student name and book id
		
		if(a==BookId) {
			
			System.out.println("Total details");
			System.out.println("Book Name:"+ Lib.str);
			System.out.println("Book Id:"+ Lib.a);
			System.out.println("Issue Date:"+ Lib.c);
			System.out.println("Total number of Book Issued:"+Lib.b);
			System.out.println("Returned book Date:"+Lib.d);
			
		}
		
		else {
			
			System.out.println("wrong Id");
		}
		
	}
	
	void detail() {
		System.out.println("Book Name:"+ Lib.str);
		System.out.println("Book Id:"+ Lib.a);
		System.out.println("Issue Date:"+ Lib.c);
		System.out.println("Total number of Book Issued:"+Lib.b);
		System.out.println("Returned book Date:"+Lib.d);
	}
	
	void exit() {
		
		System.exit(0);
	}
	
}