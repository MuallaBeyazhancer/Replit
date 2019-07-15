package assessment_8;
import java.util.*;

public class WineOrder8_3 {
/*
 * Given wineSeller() method that takes as a parameter an array list of string array. This data structure holds a wine order.
The  array of string holds : the name of the wine, its price, the ordered amount and quantity.
Method returns a report with the price for each ordered item and total price.
If the requested quantity is bigger than the stock it will comment that the order item has less than what was ordered and wont be included in the final price.
 */
	 public String wineSeller(ArrayList<String[]> r) {
		   int totalPrice=0;
		   String sen="";

		   for(int i=0;i<r.size();i++){
		     int ord = Integer.parseInt(r.get(i)[2]);
		     int qua = Integer.parseInt(r.get(i)[3]);
		     int price = Integer.parseInt(r.get(i)[1]);
		     if(ord<qua){
		     sen += "*" + r.get(i)[0] + " " +r.get(i)[2] + " price:" + ord*price +"\n";
		     totalPrice += ord*price;
		     }
		     else{
		       sen += "*" + r.get(i)[0] + " " + ord + " quantity too big\n";
		     }
		   }
		   sen = sen + "\n"  + "total price:" + totalPrice;
		   return sen;

		 }//end wineSeller

		 public static void main(String[] args)
		 {
			WineOrder8_3 m = new WineOrder8_3();
		   ArrayList<String[]>  arr = new ArrayList<String[]>();
		   arr.add(new String[]{"Rautour Viejo","20","100","200"});
		   arr.add(new String[]{"Culung Garrafeira","30","10","9900"});
		   arr.add(new String[]{"Lirnolon Sec","200","2","1"});

		   String recipt = m.wineSeller(arr);
		   System.out.print(recipt);
		   //  shod output:
		   // *Rautour Viejo 100 price:2000
		   // *Culung Garrafeira 10 price:30
		   // *Lirnolon Sec 2 quantity too big

		   // total price:2030


		 }//end main
		}