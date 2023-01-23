import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
     public static void main(String[] args) {

     try{
         if(args.length<3)
         {
             System.out.println("Wrong parameters");
             return;
         }
         switch (args[0]) {

             case  ("-a"):
             case  ("-d"):
                 switch (args[1]) {
                     case  ("-i"):
                         ArrayList<Long> listone = new ArrayList<>();

                         Reader.scanI(listone,3, args);

                         long[] array4 = new long[listone.size()];

                         array4 = Reader.ToPrimitiveInt(array4, listone);

                         MegreSortInt.MergeSort(array4, array4.length);
                         try {
                             PrintWriter fileout = new PrintWriter(new FileWriter(args[2]));

                             if(Objects.equals(args[0], "-a")){
                                for (int i = 0; i < array4.length; i++) {
                                    fileout.println(array4[i]);
                                }
                             }
                             else{
                                 for (int i = array4.length-1; i >= 0; i--) {
                                     fileout.println(array4[i]);
                                 }
                             }
                             fileout.close();

                         } catch (Exception e) {
                             System.out.println(e);
                         }

                         break;
                     case ("-s"):
                         ArrayList<String> listforstrings = new ArrayList<String>();

                         Reader.scan(listforstrings,3, args);

                         String[] arrayforstrings = new String[listforstrings.size()];

                         arrayforstrings = Reader.ToPrimitiveStr(arrayforstrings, listforstrings);

                         arrayforstrings = MergeSortStrings.MergeSort(arrayforstrings, 0, arrayforstrings.length-1);
                         try {
                             PrintWriter fileout = new PrintWriter(new FileWriter(args[2]));

                             if(Objects.equals(args[0], "-a")){
                                 for (int i = 0; i < arrayforstrings.length; i++) {
                                     fileout.println(arrayforstrings[i]);
                                 }
                             }
                             else{
                                 for (int i = arrayforstrings.length-1; i >= 0; i--) {
                                     fileout.println(arrayforstrings[i]);
                                 }
                             }
                             fileout.close();

                         } catch (Exception e) {
                             System.out.println("non-existent path of out.txt file");
                         }
                         break;

                        default:
                        System.out.println("wrong parameters");
                        break;}
             break;


             case  ("-i"):
                 ArrayList<Long> listone = new ArrayList<>();

                 Reader.scanI(listone,2, args);

                 long[] array4 = new long[listone.size()];
                 array4 = Reader.ToPrimitiveInt(array4, listone);

                 MegreSortInt.MergeSort(array4, array4.length);
                 try {
                     PrintWriter fileout = new PrintWriter(new FileWriter(args[1]));

                     for (int i = 0; i < array4.length; i++) {
                         fileout.println(array4[i]);
                     }
                     fileout.close();

                 } catch (Exception e) {
                     System.out.println("non-existent path of out.txt file");
                 }

                 break;
             case ("-s"):
                 ArrayList<String> listforstrings = new ArrayList<String>();

                 Reader.scan(listforstrings,2, args);

                 String[] arrayforstrings = new String[listforstrings.size()];

                 arrayforstrings = Reader.ToPrimitiveStr(arrayforstrings, listforstrings);

                 arrayforstrings = MergeSortStrings.MergeSort(arrayforstrings, 0, arrayforstrings.length-1);
                 try {
                     PrintWriter fileout = new PrintWriter(new FileWriter(args[1]));

                     for (int i = 0; i < arrayforstrings.length; i++) {
                         fileout.println(arrayforstrings[i]);
                     }
                     fileout.close();

                 } catch (Exception e) {
                     System.out.println("non-existent path of out.txt file");
                 }
                 break;
             default:
                 System.out.println("wrong parameters");
                 break;
         }

     }catch (Exception e) {
         System.out.println(e.getMessage());
     }
     }
}