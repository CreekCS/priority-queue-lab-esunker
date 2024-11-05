// import statements
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;

public class PriorityQueueLab {
    public static void main(String[] args){
        File file= new File("RandIntegers.txt");
        PriorityQueue queue= new PriorityQueue<Integer>();
        Scanner scan;
        try{
            scan= new Scanner(file);
            while(scan.hasNextLine()){
                queue.add(scan.nextInt());
                scan.nextLine();
            }
            System.out.println(queue);
        }catch(FileNotFoundException e){
            System.out.println("No file");
        }
    }
}
