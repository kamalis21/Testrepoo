package Electricitybill;

public class BillCalculator {
	 public static void main(String[] args) {
		 int units =280;
		 double billToPay =0;
		 if (units < 100)
		 {
			 billToPay = units *1.20;
		 }
		 else if(units < 300)
		 { 
			 billToPay = 100*1.20+(units -100)*2;
		 }
		 System.out.println ("THe electricity bil for  "+units+"is : "+billToPay);
	 }

}
