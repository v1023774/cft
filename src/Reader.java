import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

 public class Reader {
   protected static void scanI(ArrayList<Long> listone,long numofstart, String ... f){
       for(long i = numofstart; i<f.length; i++){

           try {
               Scanner scanner = new Scanner(new File(f[(int) i]));
               Scanner scannerInt = new Scanner(new File(f[(int) i]));

               while(scanner.hasNextLine() && scannerInt.hasNextInt()){
                   listone.add(scannerInt.nextLong());
               }
           }catch (FileNotFoundException e) {
               e.printStackTrace();
               System.out.println("error");
           }
       }
   }
     protected static void scan(ArrayList<String> listforstring, long numofstart, String ... f){
        for(long i = numofstart; i<f.length; i++){

            try {
                Scanner scanner = new Scanner(new File(f[(int) i]));

                while(scanner.hasNextLine()){
                    listforstring.add(scanner.nextLine());
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("error");
            }
        }
    }
     protected static long[] ToPrimitiveInt(long[] arr, ArrayList<Long> listone){
       for (int i = 0; i< listone.size(); i++){
           arr[i] = listone.get(i);
       }
       return arr;
   }
     protected static String[] ToPrimitiveStr(String[] arr, ArrayList<String> listone){
        for (int i = 0; i< listone.size(); i++){
            arr[i] = listone.get(i);
        }
        return arr;
    }

}
