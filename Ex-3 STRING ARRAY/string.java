import java.util.*;  
class string{  
   static ArrayList<String> al=new ArrayList<String>();
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){   
      al.add("one");
      al.add("two");
      al.add("three");
      al.add("four");
      al.add("five");
      al.add("six");
      System.out.println(al);
      int x=1;
      System.out.println("1-append");
      System.out.println("2-insert");
      System.out.println("3-search");
      System.out.println("4-start with");
      System.out.println("5-exit");
      while(x==1){
      System.out.println("Enter the choice:");
      int choice = sc.nextInt();
      switch(choice) {
   case 1:
      append();
      break;
   case 2:
      insert();
      break;
   case 3:
      search();
      break;
   case 4:
      startWith();
      break;
   case 5:
      x=0;
      break;
}
}
}
public static void append(){
	System.out.println("Enter the string to append :");
	String c = sc.next();
	al.add(c);
        System.out.println(al);
}
public static void insert(){
	System.out.println("Enter the index to insert :");
        int index = sc.nextInt();
	System.out.println("Enter the string to insert the " + index + "  position");
	String c= sc.next();
	al.add(index,c);
        System.out.println(al);
}
public static void search(){
	System.out.println("Enter the string to search:");
	String c= sc.next();
	if(al.contains(c))
	System.out.println("yes");
}
public static void startWith(){
	System.out.println("Enter the char to check the first letter :");
	String c = sc.next();
	for(int i=0;i<al.size();i++){
		if(al.get(i).startsWith(c))
		System.out.println("yes");	
	}	
}
}
