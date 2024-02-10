package proje;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class BilSupSys {
	private static HashSet<Creatine> cr = new HashSet<Creatine>();
	private static HashSet<ProteinPowder> pr = new HashSet<ProteinPowder>();
	private static HashSet<MultiVitamin> mv = new HashSet<MultiVitamin>();
	private static LinkedHashMap<Integer,ArrayList<BilSup>> alSup = new LinkedHashMap<Integer,ArrayList<BilSup>>();
	
	public static BilSup searchSupId(int id)
	{
		ArrayList<BilSup> b = new ArrayList<BilSup>();
		
		for (int i = 1; i <=3; i++) {
			b = alSup.get(i);
			
			for(BilSup bs : b) {
				if(bs.CheckId(id)) {
					return bs;
				}
			}
		}
		return null;
	}
	
	public static boolean removeSup(int id) {
		BilSup b = searchSupId(id);
		
		if (b instanceof Creatine) {
            cr.remove(b);
        } else if (b instanceof MultiVitamin) {
        	mv.remove(b);
        } else if (b instanceof ProteinPowder) {
        	pr.remove(b);
        }
		
		
		return false;
	}
	
	public static String display() {
		String result="";
		
		
		
		return result;
	}
	
	public static void readFromFile() {
		File f1;
		Scanner sc;
		int supId;
		double price;
		String supName;
		String supType;
		String date,vitType, size;
		BilSup b;
		String crType,proSize;
		Creatine creatine;
		ProteinPowder proteinP;
		MultiVitamin multiVitamin;
		ArrayList<BilSup> crAl = new ArrayList<BilSup>();
		ArrayList<BilSup> mvAl = new ArrayList<BilSup>();
		ArrayList<BilSup> prAl = new ArrayList<BilSup>();
		f1 = new File("supplement.txt");
		try {
			sc = new Scanner(f1);
			while(sc.hasNext())
			{
				supType=sc.next();
				
				if (supType.equalsIgnoreCase("creatine")) {
				 	supId=sc.nextInt();
					supName=sc.next();
					price=sc.nextDouble();
					date=sc.next();
					crType=sc.next();
					System.out.println(supId + supName + price + date + crType);
					creatine = new Creatine(supId, supName, price, date, crType);
					System.out.println("Added Creatine");
					cr.add(creatine);	
					crAl.add(creatine);
			 } else if (supType.equalsIgnoreCase("MultiVitamin")) {
					supId=sc.nextInt();
					supName=sc.next();
					price=sc.nextDouble();
					date=sc.next();
					size = sc.next();
					System.out.println(supId + supName + price + date + size);
					multiVitamin = new MultiVitamin(supId, supName, price, date, size);
					System.out.println("Added Mv");
					mv.add(multiVitamin);
					mvAl.add(multiVitamin);
				} else {
					 	supId=sc.nextInt();
						supName=sc.next();
						price=sc.nextDouble();
						date=sc.next();
						proSize=sc.next();
						System.out.println(supId + supName + price + date + proSize);
						proteinP = new ProteinPowder(supId, supName, price, date, proSize);
						System.out.println("Added Protein");
						pr.add(proteinP);	
						prAl.add(proteinP);
				 } 
				
				}	
			sc.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		alSup.put(1, crAl);
		alSup.put(2, prAl);
		alSup.put(3, mvAl);
		
		
	}
	
	 public static String displayCreatine() {

	        String output = "";
	        for (Creatine c : cr) {
	            output += c.toString() + "\n";
	        }
	        return output;
	    }
	
	
	 public static String displayVitamin() {
	        String output = "";
	        for (MultiVitamin v : mv) {
	            output += v.toString() + "\n";
	        }
	        return output;
	    }
	 public static String displayProtein() {
		 
	        String output = "";
	        for (ProteinPowder p : pr) {
	            output += p.toString() + "\n";
	        }
	        return output;
	    }
	

	
}
