package Java8;


public class Ques3 {
        public static void main(String[] args) {
                Runnable myThread = () ->
                {
                        // Used to set custom name to the current thread
                        Thread.currentThread().setName("myThread");
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " is running");
                };

                // Instantiating Thread class by passing Runnable
                // reference to Thread constructor
                Thread run = new Thread(myThread);
                // Starting the thread
                run.start();
        }

}
