class Q {

        int n;
       
       boolean valueset=false;

       synchronized void get()
     {
        while(!valueset)
         try{

               wait();
            }
        catch(InterruptedException e) {
            
           System.out.println("InterruptedExceptioncaught");
         }

         System.out.println("Got:"+n);
          valueset=false;
          notify();
         //return n;
      }


       synchronized void put(int n)
     {
        while(valueset)
       
         try{
               wait();
           }
             
          catch(InterruptedException e)
         {
            System.out.println("InterruptedException caught");
         }


           this.n=n;
           valueset=true;
          
         System.out.println("Put :"+n);
          notify();
     }              
 
  }


      class Producer implements Runnable 
     {

           Q q;
           int i=0;


           Producer(Q q)
         {
             this.q=q;

              new Thread(this,"producer").start();
          }

               

           public void run()
           {
             
             while(true) {

                q.put(i++);
             }

             }
     }
 



         class Consumer implements Runnable {

               Q q;

            Consumer(Q q)
             {

               this.q=q;

             new Thread(this,"Consumer").start();

            }

           

             public void run()
           {

             
             
              while(true)
            {
               q.get();
            }
         }

               

      }




             class pcfixed {

               public static void main(String args[])
              {

                  Q q=new Q();
                 
                    new Producer(q);
                     new Consumer(q);
              System.out.println("Press Control-c to stop");

             }

          }

          
            
 