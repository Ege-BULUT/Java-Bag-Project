public class Test {
    public static void main(String[] args) {
      Bag<String> bag =  new Bag();
      bag.add("C#");
      bag.add("Java");
      bag.add("C++");
      bag.add("C#");
      bag.add("java");

      Bag<String> bag2 = new Bag();
      bag2.add("java");
      bag2.add("Java");
      bag2.add("C#");

      Bag<String> bag3 = new Bag();
      bag3.add(null);

      Bag<String> bag4 = new Bag();
      bag4.add("Assembly");
      bag4.add("Kotlin");

      Bag<String> bag5 = new Bag();
      bag5.add("java");
      bag5.add("Java");

 //Bags and sizes//
        System.out.println("");
        System.out.println("bag1 :"+bag);
        System.out.println("Bag Size : "+bag.getSize());
        System.out.println("1 Distinct value : "+bag.getDistinctSize());
        System.out.println("bag2 :"+bag2);
        System.out.println("Bag Size : "+bag2.getSize());
        System.out.println("2 Distinct value : "+bag2.getDistinctSize());
        System.out.println("bag3 :"+bag3);
        System.out.println("Bag Size : "+bag3.getSize());
        System.out.println("3 Distinct value : "+bag3.getDistinctSize());
        System.out.println("bag4 :"+bag4);
        System.out.println("Bag Size : "+bag4.getSize());
        System.out.println("4 Distinct value : "+bag4.getDistinctSize());
        System.out.println("bag5 :"+bag5);
        System.out.println("Bag Size : "+bag5.getSize());
        System.out.println("5 Distinct value : "+bag5.getDistinctSize());
//isEmpties
        System.out.println("___________");
        System.out.println("bag1 isEmpty? : " + bag.isEmpty());
        System.out.println("bag2 isEmpty? : " + bag2.isEmpty());
        System.out.println("bag3 isEmpty? : " + bag3.isEmpty());
        System.out.println("bag4 isEmpty? : " + bag4.isEmpty());
        System.out.println("bag5 isEmpty? : " + bag5.isEmpty());
//Contains
        System.out.println("___________");
        System.out.println("bag1 contains 'C#' : "+bag.contains("C#"));
        System.out.println("bag2 contains 'C#' : "+bag2.contains("C#"));
        System.out.println("bag3 contains 'C#' : "+bag3.contains("C#"));
        System.out.println("bag4 contains 'C#' : "+bag4.contains("C#"));
        System.out.println("bag5 contains 'C#' : "+bag5.contains("C#"));
//Removes
        System.out.println("___________");
        System.out.println("bag1 remove 'C#' : "+bag.remove("C#"));
        System.out.println("bag2 remove 'C#' : "+bag2.remove("C#"));
        System.out.println("bag3 remove 'C#' : "+bag3.remove("C#"));
        System.out.println("bag4 remove 'C#' : "+bag4.remove("C#"));
        System.out.println("bag5 remove 'C#' : "+bag5.remove("C#"));
//Bags and sizes// new
        System.out.println("___________");
        System.out.println("bag1 :"+bag);
        System.out.println("Bag Size : "+bag.getSize());
        System.out.println("1 Distinct value : "+bag.getDistinctSize());
        System.out.println("bag2 :"+bag2);
        System.out.println("Bag Size : "+bag2.getSize());
        System.out.println("2 Distinct value : "+bag2.getDistinctSize());
        System.out.println("bag3 :"+bag3);
        System.out.println("Bag Size : "+bag3.getSize());
        System.out.println("3 Distinct value : "+bag3.getDistinctSize());
        System.out.println("bag4 :"+bag4);
        System.out.println("Bag Size : "+bag4.getSize());
        System.out.println("4 Distinct value : "+bag4.getDistinctSize());
        System.out.println("bag5 :"+bag5);
        System.out.println("Bag Size : "+bag5.getSize());
        System.out.println("5 Distinct value : "+bag5.getDistinctSize());
//Equals
      System.out.println("___________");
        System.out.println("equal bag2 to bag5 : "+ bag2.equals(bag5));
        System.out.println("equal bag5 to bag2 : "+ bag5.equals(bag2));
        System.out.println("equal bag4 to bag5 : "+ bag4.equals(bag5));
        System.out.println("equal bag3 to bag4 : "+ bag3.equals(bag4));
//Clears
      System.out.println("___________");
      System.out.println("clear bag1 :"+bag.clear());
      System.out.println("clear bag2 :"+bag2.clear());
      System.out.println("clear bag4 :"+bag4.clear());
      System.out.println("clear bag5 :"+bag5.clear());
//Bags and sizes// new
      System.out.println("___________");
      System.out.println("bag1 :"+bag);
      System.out.println("Bag Size : "+bag.getSize());
      System.out.println("1 Distinct value : "+bag.getDistinctSize());
      System.out.println("bag2 :"+bag2);
      System.out.println("Bag Size : "+bag2.getSize());
      System.out.println("2 Distinct value : "+bag2.getDistinctSize());
      System.out.println("bag3 :"+bag3);
      System.out.println("Bag Size : "+bag3.getSize());
      System.out.println("3 Distinct value : "+bag3.getDistinctSize());
      System.out.println("bag4 :"+bag4);
      System.out.println("Bag Size : "+bag4.getSize());
      System.out.println("4 Distinct value : "+bag4.getDistinctSize());
      System.out.println("bag5 :"+bag5);
      System.out.println("Bag Size : "+bag5.getSize());
      System.out.println("5 Distinct value : "+bag5.getDistinctSize());
//Equals
      System.out.println("___________");
      System.out.println("equal bag1 to bag3 : "+ bag.equals(bag3));
      System.out.println("equal bag5 to bag2 : "+ bag5.equals(bag2));
      System.out.println("equal bag3 to bag1 : "+ bag3.equals(bag));
// END of the Program.
      System.out.println("___________");
    }
}