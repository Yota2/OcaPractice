import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCount {
    public static void main(String[] args) {
        /*********Initializing  arrays values************

         int  yearsMarried [] = new int [5];
         yearsMarried[0]= 4;
         yearsMarried[1]= 3;
         yearsMarried[2]=10;
         yearsMarried[3]=12;
         yearsMarried[4]=6;
         System.out.println(yearsMarried[4]+ " "+ "years married");
         */
        //********inside array loops  array******
        /*
        String daysPerWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double dailyTemp[] = {87.5, 90.0, 91.2, 88.8, 88.6, 87.5, 89.2};

        for (int i = 0; i < daysPerWeek.length; i++) {
            System.out.println("Today is " + daysPerWeek[i] + " with high temperature " + dailyTemp[i] + " degree's celsius ");
        }
        */
        //**********highest Lowest**********
       /*
        int[] oods = {123, 23, 4444, 512, 13, 6, 100000, 123212, 0, 2};
        int highestValue = oods[0];
        int lowestValue = oods[0];
         for(int i=0; i < oods.length;i++){
             if(oods[i]>highestValue) highestValue = oods[i];
             if(oods[i]<lowestValue) lowestValue=oods[i];
         }
        System.out.println("Highest Value is "+highestValue);
        System.out.println("Lowest Value is "+lowestValue);
    }
    */
        //**************print the square number's of given array********
        /*
        int []squareData = new int [100] ;
        for(int i = 0; i<squareData.length; i++){
            squareData[i]= i+1;
          int squredArray= squareData[i]*squareData[i];
            //System.out.println(squredArray);
          System.out.println("The square root of " + squareData[i] + " is "+ squredArray);
        }
        */

        //************initializing two dimensional arrays for the  monthly highly  payment*********************
              /* int  [] []monthlySalary  = new int[13][2];
               String[] monthNames = new DateFormatSymbols().getMonths();
               for(int i=0; i< monthNames.length;i++){
                   int monthlyDays [i]= i+1;

                   //System.out.println(monthlySalary[i]);
                   System.out.println( monthlyDa[i]+ " " + Arrays.toString(new String[]{monthNames[i]}) );
               }
*/


        /*String revenu [][] = new String[12][2];
        String[] monthNames = new DateFormatSymbols().getMonths();

        for(int i = 0; i<12;i++){
            System.out.println(revenu[i][0] = "Jan");
        }*/

        //***********Function filters string from numbers**************


/*
        class FilterList {
            public static List<Integer> filterList(List<Object> inputList) {
                List<Integer> result = new ArrayList<>();
                for (Object obj : inputList) {
                    if (obj instanceof Integer) {
                        result.add((Integer) obj);
                    }
                }
                return result;
            }
        }

 */
       /* @Test
        public void examples() {
            assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
            assertEquals(List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
            assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
        }

        */
        /*
// Find the duplicate from the Array
        String dataInput[] = {"1,2,3,4", "2,3,4,5"};
        // find the duplicates.
        //first i need to get separte the array
        int size = dataInput.length;
        int [] array1 = Arrays.stream(new int [size]).toArray();
        int [] array2 = Arrays.stream(new int [size]).toArray();
        System.out.println(Arrays.toString(array2));
        */
        //System.out.println(array2);
       /* StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        for(i<arr1.length > i; i++){
            for(int j= i+1; j<array2.length();j++){
               int num1 = Integer.parseInt(array1);
               int num2= Integer.parseInt(array2);
                if(num1==num2){
                    System.out.println(result.append(num1));
                }
            }

        */
        //Traverse Operation
      //  String houseAnimals[] = {"Dog", "Cats","Sheep","Chicken"};
        /*
        /for (String houseAimalsPrint: houseAnimals){
            System.out.println(houseAimalsPrint);
        }
        */

         //Insertion Operation
        //Insert on the third positions of the array
        


        }

    }



