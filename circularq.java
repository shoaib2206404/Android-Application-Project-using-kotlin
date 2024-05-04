import java.util.Scanner;
class circularq {	// start of circular queue class

   	static int cqueue[] = new int[20]; //declaration of global variables
   	static int max=5;
   	static int rear=-1,front=-1,item;

    	public static void main(String arg[]) { // start of main()
        	     char choice=' ';
        	     Scanner input = new Scanner(System.in);
        
	          while(choice!='3') { // start of while

            		System.out.println("\n1 : Insert In Circular Queue (Insert)");
            		System.out.println("2 : Delete From Circular Queue (Front)");
            		System.out.println("3 : Exit\n");
            		System.out.print("Enter Choice...");
            
		choice=input.next().charAt(0);

            		     switch(choice) { //start of switch statement

                		          case '1': System.out.print("\nEnter value into Queue... ");
                                 		     item=input.nextInt();
                                 		     cqinsert(item);
                                 		     break;
                
		         case '2': cqdelete();
                                 		     break;
                 
             		} //end switch statement
            	    } //end while
         	}//end main
      
		public static void cqinsert(int n) { // start of push()

          		if ((front==0 && rear==max-1) || front==rear+1) {
              		      System.out.println("\n Circular Queue is Full\n");
          		}
          		else {
              			if (front==-1){
			   front=rear=0;
			}
			else{
			           if (rear==max-1)
			               	rear=0;
			           else
			     	rear++;
			}
			cqueue[rear]=n;			
                                                           System.out.println("Item Inserted in circular Queue");
          		}

      		}//end circular Queue insert

		public static void cqdelete() { //start of qdelete()
            		     if (front==-1)  {
           		         System.out.println("circular Queue Is Empty\n");
        		}
       		else {
           			item=cqueue[front];
			System.out.println("\nThe deleted Item..."+item);
           		                   	if (front==rear)
 			{
			   front=-1;
			   rear=-1;
			}
			else
			{
			    if (front==max-1)
			       front=0;
			    else
			       front++;
			}
       		}

    		} //end cqdelete
} //end class circular queue
