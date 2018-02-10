

public class hammingDistance{
   public static void main(String args[]){
	   String firstString = new String("acaggatgtcatatcac");
	   String secondString = new String("taggaatactcagtacg");
	   distance(firstString,secondString); // test case 1
	   String thirdString = new String("atat");
	   String fourthString = new String("atat");
	   distance(thirdString,fourthString); // test case 2
	   String fifthString = new String("a");
	   String sixthString = new String("aaaaaaaa");
	   distance(fifthString,sixthString); // test case 3
   } // end main
   
   public static void distance(String s1, String s2){
	   if (s2.length() != s1.length()){
		   System.out.println("Input error: strings are not equal in length.");
		   return;
	   } // end if
   int i;
   int count = 0;
	   for (i = 0; i < s1.length(); i++){
		   if (s1.charAt(i) != (s2.charAt(i))){
			   count++;
		   } // end if
	   } // end for
   System.out.print("The Hamming distance between the inputed strings is: ");
   System.out.println(count);
   } // end distance
}// end hammingDistance