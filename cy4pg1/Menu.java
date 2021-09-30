import java.util.*;
class First extends Thread
{
	public synchronized void run(){
        for(int i=0;i<4;i++){
            System.out.println("Python");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class Second implements Runnable
{
    public synchronized void run()
	{
        for(int i=0;i<4;i++)
		{
            System.out.println("Django");
            try 
			{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}


public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		First f1=new First();
		Second s2=new Second();
		Thread t1=new Thread(s2);
		System.out.println("\nMenu..\n");

		while(true){
			System.out.println("To print Python, Enter  1");
			System.out.println("To print Django, Enter 2");
			System.out.println("To Exit, Enter  3");
			
			System.out.print("\nEnter your choice:");
			int choice = scan.nextInt();

			switch(choice){
			case 1: f1.start();
						try {
                    Thread.sleep(1000);
                   }catch (Exception e){}
			break;
			case 2: t1.start();
					try {
					f1.join();
					t1.join();
					}catch (Exception e){}
			break;
			case 3: System.out.println("Exiting");
			System.exit(0);
			default: System.out.println("Error!!!");
			}
		}

	}

}
