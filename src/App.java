import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {

            // Custmer customers=new Custmer();

            Custmer[] customers =new Custmer[2];
            ArrayList<Custmer> list=new ArrayList<Custmer>();
            for(int i=0;i<2;i++)
            {
                Scanner sc=new Scanner(System.in);
                Custmer ob=new Custmer();
                System.out.println("enter name");
                ob.setName(sc.nextLine());
                System.out.println("Enter Id");
                ob.setId(sc.nextInt());


                customers[i]=ob;
                list.add(customers[i]);
            }






//      Iterator itr=list.iterator();
//            while(itr.hasNext()){
//                Custmer s=(Custmer) itr.next();
//                System.out.println("detail:"+s.getId()+" "+s.getName());
//            }
//
//
            for (Custmer x:list
                 ) {
                System.out.println(x.getId());
            }
        }
}
